package br.sp.puc.camel.route;

import br.sp.puc.camel.SolicitarPagamentoRequest;
import br.sp.puc.camel.SolicitarPagamentoResponse;
import br.sp.puc.camel.predicate.MasterCardPredicate;
import br.sp.puc.camel.predicate.VisaPredicate;
import br.sp.puc.camel.processor.MasterCardProcessor;
import br.sp.puc.camel.processor.VisaProcessor;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

/**
 * Created by gabriel on 04/12/14.
 */
public class PagamentoRoute extends RouteBuilder {

    private static final String VISA = "Visa";

    @Override
    public void configure() throws Exception {

        from("cxf:bean:solicitarPagamento").process(new Processor() {
            public void process(Exchange exchange) throws Exception {
                String bandeiraCartao = exchange.getIn().getBody(SolicitarPagamentoRequest.class).getBandeiraCartao();
                SolicitarPagamentoResponse output = new SolicitarPagamentoResponse();
                output.setAprovado(VISA.equalsIgnoreCase(bandeiraCartao) ? true : false);
                exchange.getOut().setBody(output);
            }
        }).to("log:output");

        from("cxf:bean:solicitarPagamento").choice()
                .when(new VisaPredicate())
                    .to("direct:http://env-7034838.jelasticlw.com.br/GatewayPagamentoVisa/services/SolicitarPagamento")
                    .process(new VisaProcessor())
                .when(new MasterCardPredicate())
                    .to("")
                    .process(new MasterCardProcessor())
                .otherwise().endChoice();
    }
}

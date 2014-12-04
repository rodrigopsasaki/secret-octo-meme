package br.sp.puc.camel.route;

import br.sp.puc.camel.SolicitarPagamentoRequest;
import br.sp.puc.camel.SolicitarPagamentoResponse;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

/**
 * Created by gabriel on 04/12/14.
 */
public class PagamentoRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("cxf:bean:solicitarPagamento").process(new Processor() {
            public void process(Exchange exchange) throws Exception {
                String bandeiraCartao = exchange.getIn().getBody(SolicitarPagamentoRequest.class).getBandeiraCartao();
                SolicitarPagamentoResponse output = new SolicitarPagamentoResponse();
                output.setAprovado(bandeiraCartao.equalsIgnoreCase("visa") ? true : false);
                exchange.getOut().setBody(output);
            }
        }).to("log:output");
    }
}

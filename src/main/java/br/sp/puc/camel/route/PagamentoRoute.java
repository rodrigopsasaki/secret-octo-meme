package br.sp.puc.camel.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import puc.sp.br.services.pagamento.SolicitarPagamentoRequest;
import puc.sp.br.services.pagamento.SolicitarPagamentoResponse;

/**
 * Created by gabriel on 04/12/14.
 */
public class PagamentoRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("cxf:bean:solicitarPagamento").process(new Processor() {
            public void process(Exchange exchange) throws Exception {
                String nomeCliente = exchange.getIn().getBody(SolicitarPagamentoRequest.class).getNomeCliente();
                SolicitarPagamentoResponse output = new SolicitarPagamentoResponse();
                output.setAprovado(nomeCliente.equalsIgnoreCase("Gabriel") ? true : false);
                exchange.getOut().setBody(output);
            }
        }).to("log:output");
    }
}

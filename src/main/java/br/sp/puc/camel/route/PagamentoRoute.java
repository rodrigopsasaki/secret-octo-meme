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
                String nomeCliente = exchange.getIn().getBody(SolicitarPagamentoRequest.class).getNomeCliente();
                SolicitarPagamentoResponse output = new SolicitarPagamentoResponse();

                if(nomeCliente.equalsIgnoreCase("Gabriel")){
                    output.setCodigo("001");
                    output.setDescricao("Aprovado");
                } else {
                    output.setCodigo("002");
                    output.setDescricao("Rejeitado");
                }
                exchange.getOut().setBody(output);
            }
        }).to("log:output");
    }
}

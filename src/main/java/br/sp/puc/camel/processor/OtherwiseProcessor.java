package br.sp.puc.camel.processor;

import br.sp.puc.camel.model.SolicitarPagamentoResponse;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import puc.sp.br.services.pagamento.SolicitarPagamento;

/**
 * Created by rodrigo on 12/5/14
 */
public class OtherwiseProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println("Otherwise");
        SolicitarPagamentoResponse response = new SolicitarPagamentoResponse();
        response.setAprovado(false);

        exchange.getOut().setBody(response);
    }
}

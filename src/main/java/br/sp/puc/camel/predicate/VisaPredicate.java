package br.sp.puc.camel.predicate;

import br.sp.puc.camel.model.SolicitarPagamentoRequest;
import org.apache.camel.Exchange;
import org.apache.camel.Predicate;

/**
 * Created by gabriel on 04/12/14.
 */
public class VisaPredicate implements Predicate {

    @Override
    public boolean matches(Exchange exchange) {
        String bandeiraCartao = exchange.getIn().getBody(SolicitarPagamentoRequest.class).getBandeiraCartao();

        return "visa".equalsIgnoreCase(bandeiraCartao) ? true : false;
    }
}

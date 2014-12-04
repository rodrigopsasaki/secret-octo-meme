package br.sp.puc.camel.predicate;

import br.sp.puc.camel.SolicitarPagamentoRequest;
import org.apache.camel.Exchange;
import org.apache.camel.Predicate;

/**
 * Created by gabriel on 04/12/14.
 */
public class MasterCardPredicate implements Predicate {

    @Override
    public boolean matches(Exchange exchange) {
        return false;
    }
}

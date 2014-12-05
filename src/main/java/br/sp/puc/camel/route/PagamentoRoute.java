package br.sp.puc.camel.route;

import br.sp.puc.camel.predicate.MasterCardPredicate;
import br.sp.puc.camel.predicate.VisaPredicate;
import br.sp.puc.camel.processor.MasterCardProcessor;
import br.sp.puc.camel.processor.OtherwiseProcessor;
import br.sp.puc.camel.processor.VisaProcessor;
import org.apache.camel.builder.RouteBuilder;

/**
 * Created by gabriel on 04/12/14.
 */
public class PagamentoRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("cxf:bean:solicitarPagamento").choice()
                .when(new VisaPredicate())
                    .process(new VisaProcessor())
                .when(new MasterCardPredicate())
                    .process(new MasterCardProcessor())
                .otherwise()
                    .process(new OtherwiseProcessor())
                .endChoice()
        .to("log:output");
    }
}

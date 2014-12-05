package br.sp.puc.camel.processor;

import br.sp.puc.camel.model.SolicitarPagamentoResponse;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;


import javax.xml.soap.Node;
import javax.xml.soap.SAAJResult;
import javax.xml.soap.SOAPMessage;

/**
 * Created by gabriel on 05/12/14.
 */
public class VisaOutputProcessor implements Processor {

    private static final String CODIGO = "codigo";
    private static final String CODIGO_APROVADO = "0";

    @Override
    public void process(Exchange exchange) throws Exception {

        SolicitarPagamentoResponse output = createOutput(exchange);
        exchange.getOut().setBody(output);

    }

    private static SolicitarPagamentoResponse createOutput(Exchange exchange) throws Exception {
        SOAPMessage soapResponse = exchange.getOut().getBody(SOAPMessage.class);

        SAAJResult result = new SAAJResult(soapResponse);

        Node codigo = getNodeCodigo(result.getResult());

        System.out.println("Codigo: " + codigo.getFirstChild().getTextContent());

        boolean aprovado = CODIGO_APROVADO.equalsIgnoreCase(codigo.getFirstChild().getTextContent());
        SolicitarPagamentoResponse output = new SolicitarPagamentoResponse();
        output.setAprovado(aprovado);

        return output;
    }

    private static Node getNodeCodigo(Node node) {
        return CODIGO.equals(node.getLocalName()) ? node : getNodeCodigo((Node) node.getFirstChild());
    }

}

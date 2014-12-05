package br.sp.puc.camel.processor;

import br.sp.puc.camel.model.SolicitarPagamentoRequest;
import br.sp.puc.camel.model.SolicitarPagamentoResponse;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import javax.xml.soap.*;

/**
 * Created by rodrigo on 12/5/14
 */
public abstract class PagamentoProcessor implements Processor{

    protected static final String CODIGO = "codigo";
    protected static final String CODIGO_APROVADO = "0";

    @Override
    public void process(Exchange exchange) throws Exception {
        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();

        SOAPMessage soapRequest = createSoapRequest(exchange);
        SOAPMessage soapResponse = soapConnection.call(soapRequest, getWebserviceURI());

        SolicitarPagamentoResponse output = createOutput(soapResponse);
        exchange.getOut().setBody(output);
    }

    protected abstract SOAPMessage createSoapRequest(Exchange exchange) throws Exception;

    protected static SolicitarPagamentoResponse createOutput(SOAPMessage soapResponse) throws Exception {
        SAAJResult result = new SAAJResult(soapResponse);

        Node codigo = getNodeCodigo(result.getResult());

        System.out.println("Codigo: " + codigo.getFirstChild().getTextContent());

        boolean aprovado = CODIGO_APROVADO.equalsIgnoreCase(codigo.getFirstChild().getTextContent());
        SolicitarPagamentoResponse output = new SolicitarPagamentoResponse();
        output.setAprovado(aprovado);

        return output;
    }

    protected static Node getNodeCodigo(Node node) {
        return CODIGO.equals(node.getLocalName()) ? node : getNodeCodigo((Node) node.getFirstChild());
    }

    protected abstract String getWebserviceURI();

}

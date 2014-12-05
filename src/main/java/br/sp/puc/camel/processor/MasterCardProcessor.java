package br.sp.puc.camel.processor;

import br.sp.puc.camel.model.SolicitarPagamentoRequest;
import org.apache.camel.Exchange;

import javax.xml.soap.*;

/**
 * Created by gabriel on 04/12/14.
 */
public class MasterCardProcessor extends PagamentoProcessor {

    @Override
    public void process(Exchange exchange) throws Exception {
        System.out.println("Mastercard");
        super.process(exchange);
    }

    protected SOAPMessage createSoapRequest(Exchange exchange) throws Exception {
        SolicitarPagamentoRequest in = exchange.getIn().getBody(SolicitarPagamentoRequest.class);

        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        String namespace = "http://ws.apache.org/axis2";

        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("ns", namespace);

        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapElement = soapBody.addChildElement("solicitarPagamento", "ns");

        soapElement.addChildElement("pedido", "ns").addTextNode(in.getNumeroPedido());
        soapElement.addChildElement("cpf", "ns").addTextNode(in.getCpfCliente());
        soapElement.addChildElement("valor", "ns").addTextNode(String.valueOf(in.getValorCompra()));
        soapElement.addChildElement("numeroCartao", "ns").addTextNode(in.getNumeroCartao());

        soapMessage.saveChanges();

        return soapMessage;
    }

    @Override
    protected String getWebserviceURI() {
        return "http://env-3413924.jelasticlw.com.br/GatewayPagamentoMastercard/services/SolicitarPagamento";
    }

}

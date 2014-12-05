package br.sp.puc.camel.processor;

import br.sp.puc.camel.model.SolicitarPagamentoRequest;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.ProcessorBuilder;

import javax.xml.soap.*;

/**
 * Created by gabriel on 04/12/14.
 */
public class VisaInputProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {

        SOAPMessage soapRequest = createSoapRequest(exchange);
        exchange.getOut().setBody(soapRequest);

    }

    private SOAPMessage createSoapRequest(Exchange exchange) throws Exception {
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
        soapElement.addChildElement("cliente", "ns").addTextNode(in.getNomeCliente());
        soapElement.addChildElement("valor", "ns").addTextNode(String.valueOf(in.getValorCompra()));
        soapElement.addChildElement("numeroCartao", "ns").addTextNode(in.getNumeroCartao());

        soapMessage.saveChanges();

        return soapMessage;
    }

}

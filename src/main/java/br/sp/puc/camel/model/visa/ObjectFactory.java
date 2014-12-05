
package br.sp.puc.camel.model.visa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import br.com.gpvisa.model.xsd.MensagemTO;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.ws.axis2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SolicitarPagamentoNumeroCartao_QNAME = new QName("http://ws.apache.org/axis2", "numeroCartao");
    private final static QName _SolicitarPagamentoCliente_QNAME = new QName("http://ws.apache.org/axis2", "cliente");
    private final static QName _SolicitarPagamentoResponseReturn_QNAME = new QName("http://ws.apache.org/axis2", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.ws.axis2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SolicitarPagamentoResponse }
     * 
     */
    public SolicitarPagamentoResponse createSolicitarPagamentoResponse() {
        return new SolicitarPagamentoResponse();
    }

    /**
     * Create an instance of {@link SolicitarPagamento }
     * 
     */
    public SolicitarPagamento createSolicitarPagamento() {
        return new SolicitarPagamento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.apache.org/axis2", name = "numeroCartao", scope = SolicitarPagamento.class)
    public JAXBElement<String> createSolicitarPagamentoNumeroCartao(String value) {
        return new JAXBElement<String>(_SolicitarPagamentoNumeroCartao_QNAME, String.class, SolicitarPagamento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.apache.org/axis2", name = "cliente", scope = SolicitarPagamento.class)
    public JAXBElement<String> createSolicitarPagamentoCliente(String value) {
        return new JAXBElement<String>(_SolicitarPagamentoCliente_QNAME, String.class, SolicitarPagamento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensagemTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.apache.org/axis2", name = "return", scope = SolicitarPagamentoResponse.class)
    public JAXBElement<MensagemTO> createSolicitarPagamentoResponseReturn(MensagemTO value) {
        return new JAXBElement<MensagemTO>(_SolicitarPagamentoResponseReturn_QNAME, MensagemTO.class, SolicitarPagamentoResponse.class, value);
    }

}

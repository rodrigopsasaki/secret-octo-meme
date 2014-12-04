
package br.sp.puc.camel;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the puc.sp.br.services.pagamento package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: puc.sp.br.services.pagamento
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
     * Create an instance of {@link SolicitarPagamentoRequest }
     * 
     */
    public SolicitarPagamentoRequest createSolicitarPagamentoRequest() {
        return new SolicitarPagamentoRequest();
    }

}

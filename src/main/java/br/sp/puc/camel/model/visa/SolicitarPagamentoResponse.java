
package br.sp.puc.camel.model.visa;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.com.gpvisa.model.xsd.MensagemTO;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://model.gpvisa.com.br/xsd}MensagemTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "_return"
})
@XmlRootElement(name = "solicitarPagamentoResponse")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T11:19:21-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
public class SolicitarPagamentoResponse {

    @XmlElementRef(name = "return", namespace = "http://ws.apache.org/axis2", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T11:19:21-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    protected JAXBElement<MensagemTO> _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MensagemTO }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T11:19:21-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public JAXBElement<MensagemTO> getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MensagemTO }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T11:19:21-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public void setReturn(JAXBElement<MensagemTO> value) {
        this._return = value;
    }

}

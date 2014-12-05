
package br.sp.puc.camel.model.visa;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="pedido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numeroCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "pedido",
    "cliente",
    "valor",
    "numeroCartao"
})
@XmlRootElement(name = "solicitarPagamento")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T11:19:21-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
public class SolicitarPagamento {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T11:19:21-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    protected Integer pedido;
    @XmlElementRef(name = "cliente", namespace = "http://ws.apache.org/axis2", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T11:19:21-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    protected JAXBElement<String> cliente;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T11:19:21-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    protected Double valor;
    @XmlElementRef(name = "numeroCartao", namespace = "http://ws.apache.org/axis2", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T11:19:21-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    protected JAXBElement<String> numeroCartao;

    /**
     * Gets the value of the pedido property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T11:19:21-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public Integer getPedido() {
        return pedido;
    }

    /**
     * Sets the value of the pedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T11:19:21-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public void setPedido(Integer value) {
        this.pedido = value;
    }

    /**
     * Gets the value of the cliente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T11:19:21-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public JAXBElement<String> getCliente() {
        return cliente;
    }

    /**
     * Sets the value of the cliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T11:19:21-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public void setCliente(JAXBElement<String> value) {
        this.cliente = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T11:19:21-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public Double getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T11:19:21-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public void setValor(Double value) {
        this.valor = value;
    }

    /**
     * Gets the value of the numeroCartao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T11:19:21-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public JAXBElement<String> getNumeroCartao() {
        return numeroCartao;
    }

    /**
     * Sets the value of the numeroCartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T11:19:21-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public void setNumeroCartao(JAXBElement<String> value) {
        this.numeroCartao = value;
    }

}

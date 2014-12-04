
package br.sp.puc.camel;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;


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
 *         &lt;element name="numeroPedido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nomeCliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cpfCliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valorCompra" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="numeroCartao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bandeiraCartao" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "numeroPedido",
    "nomeCliente",
    "cpfCliente",
    "valorCompra",
    "numeroCartao",
    "bandeiraCartao"
})
@XmlRootElement(name = "solicitarPagamentoRequest")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:24:28-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
public class SolicitarPagamentoRequest {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:24:28-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    protected String numeroPedido;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:24:28-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    protected String nomeCliente;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:24:28-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    protected String cpfCliente;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:24:28-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    protected double valorCompra;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:24:28-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    protected String numeroCartao;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:24:28-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    protected String bandeiraCartao;

    /**
     * Gets the value of the numeroPedido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:24:28-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public String getNumeroPedido() {
        return numeroPedido;
    }

    /**
     * Sets the value of the numeroPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:24:28-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public void setNumeroPedido(String value) {
        this.numeroPedido = value;
    }

    /**
     * Gets the value of the nomeCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:24:28-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * Sets the value of the nomeCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:24:28-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public void setNomeCliente(String value) {
        this.nomeCliente = value;
    }

    /**
     * Gets the value of the cpfCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:24:28-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public String getCpfCliente() {
        return cpfCliente;
    }

    /**
     * Sets the value of the cpfCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:24:28-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public void setCpfCliente(String value) {
        this.cpfCliente = value;
    }

    /**
     * Gets the value of the valorCompra property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:24:28-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public double getValorCompra() {
        return valorCompra;
    }

    /**
     * Sets the value of the valorCompra property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:24:28-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public void setValorCompra(double value) {
        this.valorCompra = value;
    }

    /**
     * Gets the value of the numeroCartao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:24:28-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public String getNumeroCartao() {
        return numeroCartao;
    }

    /**
     * Sets the value of the numeroCartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:24:28-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public void setNumeroCartao(String value) {
        this.numeroCartao = value;
    }

    /**
     * Gets the value of the bandeiraCartao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:24:28-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public String getBandeiraCartao() {
        return bandeiraCartao;
    }

    /**
     * Sets the value of the bandeiraCartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:24:28-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public void setBandeiraCartao(String value) {
        this.bandeiraCartao = value;
    }

}

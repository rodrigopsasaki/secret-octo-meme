
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
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "codigo",
    "descricao"
})
@XmlRootElement(name = "solicitarPagamentoResponse")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:03:23-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
public class SolicitarPagamentoResponse {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:03:23-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    protected String codigo;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:03:23-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    protected String descricao;

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:03:23-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:03:23-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the descricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:03:23-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public String getDescricao() {
        return descricao;
    }

    /**
     * Sets the value of the descricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-04T04:03:23-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public void setDescricao(String value) {
        this.descricao = value;
    }

}

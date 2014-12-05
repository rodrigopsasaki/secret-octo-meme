
package br.sp.puc.camel.model;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="aprovado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "aprovado"
})
@XmlRootElement(name = "solicitarPagamentoResponse")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-05T01:35:40-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
public class SolicitarPagamentoResponse {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-05T01:35:40-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    protected boolean aprovado;

    /**
     * Gets the value of the aprovado property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-05T01:35:40-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public boolean isAprovado() {
        return aprovado;
    }

    /**
     * Sets the value of the aprovado property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-12-05T01:35:40-02:00", comments = "JAXB RI v2.2.10-b140310.1920")
    public void setAprovado(boolean value) {
        this.aprovado = value;
    }

}

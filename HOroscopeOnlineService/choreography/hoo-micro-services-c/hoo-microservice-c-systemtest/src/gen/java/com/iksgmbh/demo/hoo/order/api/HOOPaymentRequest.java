//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.05.03 um 08:51:26 AM CEST 
//


package com.iksgmbh.demo.hoo.order.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="paid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orderNumber",
    "paid"
})
@XmlRootElement(name = "HOO_PaymentRequest")
public class HOOPaymentRequest {

    protected long orderNumber;
    protected boolean paid;

    /**
     * Ruft den Wert der orderNumber-Eigenschaft ab.
     * 
     */
    public long getOrderNumber() {
        return orderNumber;
    }

    /**
     * Legt den Wert der orderNumber-Eigenschaft fest.
     * 
     */
    public void setOrderNumber(long value) {
        this.orderNumber = value;
    }

    /**
     * Ruft den Wert der paid-Eigenschaft ab.
     * 
     */
    public boolean isPaid() {
        return paid;
    }

    /**
     * Legt den Wert der paid-Eigenschaft fest.
     * 
     */
    public void setPaid(boolean value) {
        this.paid = value;
    }

}

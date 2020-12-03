
package com.example.rest_soap_rabbit.soaptest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DropExportedMessagesResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "dropExportedMessagesResult"
})
@XmlRootElement(name = "DropExportedMessagesResponse")
public class DropExportedMessagesResponse {

    @XmlElement(name = "DropExportedMessagesResult")
    protected Integer dropExportedMessagesResult;

    /**
     * Gets the value of the dropExportedMessagesResult property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDropExportedMessagesResult() {
        return dropExportedMessagesResult;
    }

    /**
     * Sets the value of the dropExportedMessagesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDropExportedMessagesResult(Integer value) {
        this.dropExportedMessagesResult = value;
    }

}


package com.example.rest_soap_rabbit.soaptest;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetMessagesForExportResult" type="{http://schemas.datacontract.org/2004/07/NAT.BG.API.Message.ImEx.V1.Model}ArrayOfMessageForExport" minOccurs="0"/&gt;
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
    "getMessagesForExportResult"
})
@XmlRootElement(name = "GetMessagesForExportResponse")
public class GetMessagesForExportResponse {

    @XmlElementRef(name = "GetMessagesForExportResult", namespace = "http://nat.kz/imex/api/v1", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMessageForExport> getMessagesForExportResult;

    /**
     * Gets the value of the getMessagesForExportResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMessageForExport }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMessageForExport> getGetMessagesForExportResult() {
        return getMessagesForExportResult;
    }

    /**
     * Sets the value of the getMessagesForExportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMessageForExport }{@code >}
     *     
     */
    public void setGetMessagesForExportResult(JAXBElement<ArrayOfMessageForExport> value) {
        this.getMessagesForExportResult = value;
    }

}

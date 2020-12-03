
package com.example.rest_soap_rabbit.soaptest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMessageForExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMessageForExport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageForExport" type="{http://schemas.datacontract.org/2004/07/NAT.BG.API.Message.ImEx.V1.Model}MessageForExport" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMessageForExport", namespace = "http://schemas.datacontract.org/2004/07/NAT.BG.API.Message.ImEx.V1.Model", propOrder = {
    "messageForExport"
})
public class ArrayOfMessageForExport {

    @XmlElement(name = "MessageForExport", nillable = true)
    protected List<MessageForExport> messageForExport;

    /**
     * Gets the value of the messageForExport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageForExport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageForExport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageForExport }
     * 
     * 
     */
    public List<MessageForExport> getMessageForExport() {
        if (messageForExport == null) {
            messageForExport = new ArrayList<MessageForExport>();
        }
        return this.messageForExport;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.16 at 11:04:04 AM CET 
//

package nl.esi.poosl.generatedxmlclasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for t_communication_event_message complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="t_communication_event_message">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{uri:poosl}t_identifier"/>
 *         &lt;element name="parameters" type="{uri:poosl}t_communication_event_parameter"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t_communication_event_message", propOrder = { "name", "parameters" })
public class TCommunicationEventMessage {

    @XmlElement(required = true)
    protected String name;

    @XmlElement(required = true)
    protected TCommunicationEventParameter parameters;

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return possible object is {@link TCommunicationEventParameter }
     * 
     */
    public TCommunicationEventParameter getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *            allowed object is {@link TCommunicationEventParameter }
     * 
     */
    public void setParameters(TCommunicationEventParameter value) {
        this.parameters = value;
    }

}

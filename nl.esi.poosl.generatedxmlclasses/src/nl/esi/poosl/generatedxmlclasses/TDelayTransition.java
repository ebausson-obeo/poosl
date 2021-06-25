//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.16 at 11:04:04 AM CET 
//

package nl.esi.poosl.generatedxmlclasses;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for t_delay_transition complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="t_delay_transition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="node" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="process_path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="handle" use="required" type="{uri:poosl}t_handle_id" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t_delay_transition", propOrder = { "period", "node", "processPath" })
public class TDelayTransition {

    protected double period;

    @XmlElement(required = true)
    protected BigInteger node;

    @XmlElement(name = "process_path", required = true)
    protected String processPath;

    @XmlAttribute(name = "handle", required = true)
    protected BigInteger handle;

    /**
     * Gets the value of the period property.
     * 
     */
    public double getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     */
    public void setPeriod(double value) {
        this.period = value;
    }

    /**
     * Gets the value of the node property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setNode(BigInteger value) {
        this.node = value;
    }

    /**
     * Gets the value of the processPath property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getProcessPath() {
        return processPath;
    }

    /**
     * Sets the value of the processPath property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setProcessPath(String value) {
        this.processPath = value;
    }

    /**
     * Gets the value of the handle property.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setHandle(BigInteger value) {
        this.handle = value;
    }

}

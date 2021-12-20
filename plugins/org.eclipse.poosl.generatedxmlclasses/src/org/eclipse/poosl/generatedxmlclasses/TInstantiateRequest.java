//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.20 at 03:57:25 PM CET 
//

package org.eclipse.poosl.generatedxmlclasses;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for t_instantiate_request complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="t_instantiate_request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="poosl_specification" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="external_port_description_filename" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t_instantiate_request",
        propOrder = { "pooslSpecification", "externalPortDescriptionFilename" })
public class TInstantiateRequest {

    @XmlElement(name = "poosl_specification", required = true)
    protected BigInteger pooslSpecification;

    @XmlElement(name = "external_port_description_filename", required = true)
    protected String externalPortDescriptionFilename;

    /**
     * Gets the value of the pooslSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     * 
     */
    public BigInteger getPooslSpecification() {
        return pooslSpecification;
    }

    /**
     * Sets the value of the pooslSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     * 
     */
    public void setPooslSpecification(BigInteger value) {
        this.pooslSpecification = value;
    }

    /**
     * Gets the value of the externalPortDescriptionFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public String getExternalPortDescriptionFilename() {
        return externalPortDescriptionFilename;
    }

    /**
     * Sets the value of the externalPortDescriptionFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setExternalPortDescriptionFilename(String value) {
        this.externalPortDescriptionFilename = value;
    }

}

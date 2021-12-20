//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.20 at 03:57:25 PM CET 
//

package org.eclipse.poosl.generatedxmlclasses;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for t_var_list complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="t_var_list"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="variable" type="{uri:poosl}t_variable"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="local" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="global" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t_var_list", propOrder = { "variable" })
public class TVarList {

    protected List<TVariable> variable;

    @XmlAttribute(name = "local")
    protected BigInteger local;

    @XmlAttribute(name = "global")
    protected BigInteger global;

    /**
     * Gets the value of the variable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variable
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TVariable }
     * 
     * 
     */
    public List<TVariable> getVariable() {
        if (variable == null) {
            variable = new ArrayList<TVariable>();
        }
        return this.variable;
    }

    /**
     * Gets the value of the local property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     * 
     */
    public BigInteger getLocal() {
        return local;
    }

    /**
     * Sets the value of the local property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     * 
     */
    public void setLocal(BigInteger value) {
        this.local = value;
    }

    /**
     * Gets the value of the global property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     * 
     */
    public BigInteger getGlobal() {
        return global;
    }

    /**
     * Sets the value of the global property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     * 
     */
    public void setGlobal(BigInteger value) {
        this.global = value;
    }

}

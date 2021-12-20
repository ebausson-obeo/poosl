//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.20 at 03:57:25 PM CET 
//

package org.eclipse.poosl.generatedxmlclasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for t_get_position_response complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="t_get_position_response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stmt_handle" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="begin" type="{uri:poosl}t_source_position"/&gt;
 *         &lt;element name="end" type="{uri:poosl}t_source_position"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t_get_position_response", propOrder = { "stmtHandle", "begin", "end" })
public class TGetPositionResponse {

    @XmlElement(name = "stmt_handle")
    protected int stmtHandle;

    @XmlElement(required = true)
    protected TSourcePosition begin;

    @XmlElement(required = true)
    protected TSourcePosition end;

    /**
     * Gets the value of the stmtHandle property.
     * 
     */
    public int getStmtHandle() {
        return stmtHandle;
    }

    /**
     * Sets the value of the stmtHandle property.
     * 
     */
    public void setStmtHandle(int value) {
        this.stmtHandle = value;
    }

    /**
     * Gets the value of the begin property.
     * 
     * @return
     *     possible object is
     *     {@link TSourcePosition }
     * 
     */
    public TSourcePosition getBegin() {
        return begin;
    }

    /**
     * Sets the value of the begin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSourcePosition }
     * 
     */
    public void setBegin(TSourcePosition value) {
        this.begin = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link TSourcePosition }
     * 
     */
    public TSourcePosition getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSourcePosition }
     * 
     */
    public void setEnd(TSourcePosition value) {
        this.end = value;
    }

}

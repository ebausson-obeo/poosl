//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.20 at 03:57:25 PM CET 
//

package org.eclipse.poosl.generatedxmlclasses;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for t_execution_state_change_response complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="t_execution_state_change_response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="breakpoints" type="{uri:poosl}t_breakpoint" minOccurs="0"/&gt;
 *         &lt;element name="error" type="{uri:poosl}t_error_info" minOccurs="0"/&gt;
 *         &lt;element name="transition" type="{uri:poosl}t_transition" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="minimal_time_step" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t_execution_state_change_response",
        propOrder = {
                "breakpoints",
                "error",
                "transition",
                "message",
                "state",
                "time",
                "minimalTimeStep" })
public class TExecutionStateChangeResponse {

    protected TBreakpoint breakpoints;

    protected TErrorInfo error;

    protected TTransition transition;

    protected String message;

    @XmlElement(required = true)
    protected String state;

    @XmlElement(required = true)
    protected BigDecimal time;

    @XmlElement(name = "minimal_time_step")
    protected double minimalTimeStep;

    /**
     * Gets the value of the breakpoints property.
     * 
     * @return
     *     possible object is
     *     {@link TBreakpoint }
     * 
     */
    public TBreakpoint getBreakpoints() {
        return breakpoints;
    }

    /**
     * Sets the value of the breakpoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link TBreakpoint }
     * 
     */
    public void setBreakpoints(TBreakpoint value) {
        this.breakpoints = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link TErrorInfo }
     * 
     */
    public TErrorInfo getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link TErrorInfo }
     * 
     */
    public void setError(TErrorInfo value) {
        this.error = value;
    }

    /**
     * Gets the value of the transition property.
     * 
     * @return
     *     possible object is
     *     {@link TTransition }
     * 
     */
    public TTransition getTransition() {
        return transition;
    }

    /**
     * Sets the value of the transition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTransition }
     * 
     */
    public void setTransition(TTransition value) {
        this.transition = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     * 
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * 
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     * 
     */
    public BigDecimal getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     * 
     */
    public void setTime(BigDecimal value) {
        this.time = value;
    }

    /**
     * Gets the value of the minimalTimeStep property.
     * 
     */
    public double getMinimalTimeStep() {
        return minimalTimeStep;
    }

    /**
     * Sets the value of the minimalTimeStep property.
     * 
     */
    public void setMinimalTimeStep(double value) {
        this.minimalTimeStep = value;
    }

}

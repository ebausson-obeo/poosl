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
 * Java class for t_eengine_event_error_response complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="t_eengine_event_error_response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stmt_handle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="process_path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stacktrace" type="{uri:poosl}t_error_stacktrace"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t_eengine_event_error_response", propOrder = { "error", "stmtHandle", "processPath", "stacktrace" })
public class TEengineEventErrorResponse {

    @XmlElement(required = true)
    protected String error;

    @XmlElement(name = "stmt_handle")
    protected int stmtHandle;

    @XmlElement(name = "process_path", required = true)
    protected String processPath;

    @XmlElement(required = true)
    protected TErrorStacktrace stacktrace;

    /**
     * Gets the value of the error property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setError(String value) {
        this.error = value;
    }

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
     * Gets the value of the stacktrace property.
     * 
     * @return possible object is {@link TErrorStacktrace }
     * 
     */
    public TErrorStacktrace getStacktrace() {
        return stacktrace;
    }

    /**
     * Sets the value of the stacktrace property.
     * 
     * @param value
     *            allowed object is {@link TErrorStacktrace }
     * 
     */
    public void setStacktrace(TErrorStacktrace value) {
        this.stacktrace = value;
    }

}

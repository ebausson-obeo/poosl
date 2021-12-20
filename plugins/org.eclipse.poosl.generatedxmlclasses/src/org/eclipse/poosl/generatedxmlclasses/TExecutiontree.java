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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for t_executiontree complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="t_executiontree"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="sequential" type="{uri:poosl}t_executiontree_statements"/&gt;
 *           &lt;element name="method_call" type="{uri:poosl}t_executiontree_method_call"/&gt;
 *           &lt;element name="parallel" type="{uri:poosl}t_executiontree_statements"/&gt;
 *           &lt;element name="select" type="{uri:poosl}t_executiontree_statements"/&gt;
 *           &lt;element name="statement" type="{uri:poosl}t_executiontree_base"/&gt;
 *           &lt;element name="expression" type="{uri:poosl}t_executiontree_expression"/&gt;
 *           &lt;element name="process_method_call" type="{uri:poosl}t_executiontree_base"/&gt;
 *           &lt;element name="message_send" type="{uri:poosl}t_executiontree_message_send"/&gt;
 *           &lt;element name="message_receive" type="{uri:poosl}t_executiontree_message_receive"/&gt;
 *           &lt;element name="guard" type="{uri:poosl}t_executiontree_base"/&gt;
 *           &lt;element name="while" type="{uri:poosl}t_executiontree_base"/&gt;
 *           &lt;element name="abort" type="{uri:poosl}t_executiontree_base"/&gt;
 *           &lt;element name="interrupt" type="{uri:poosl}t_executiontree_base"/&gt;
 *           &lt;element name="skip" type="{uri:poosl}t_executiontree_base"/&gt;
 *           &lt;element name="delay" type="{uri:poosl}t_executiontree_base"/&gt;
 *           &lt;element name="sequence_of_expressions" type="{uri:poosl}t_executiontree_base"/&gt;
 *           &lt;element name="assignment" type="{uri:poosl}t_executiontree_base"/&gt;
 *           &lt;element name="data_method_call" type="{uri:poosl}t_executiontree_base"/&gt;
 *           &lt;element name="constant" type="{uri:poosl}t_executiontree_base"/&gt;
 *           &lt;element name="variable" type="{uri:poosl}t_executiontree_base"/&gt;
 *           &lt;element name="binary_operation" type="{uri:poosl}t_executiontree_base"/&gt;
 *           &lt;element name="unary_operation" type="{uri:poosl}t_executiontree_base"/&gt;
 *           &lt;element name="self" type="{uri:poosl}t_executiontree_base"/&gt;
 *           &lt;element name="nil" type="{uri:poosl}t_executiontree_base"/&gt;
 *           &lt;element name="current_time" type="{uri:poosl}t_executiontree_base"/&gt;
 *           &lt;element name="if" type="{uri:poosl}t_executiontree_base"/&gt;
 *           &lt;element name="new" type="{uri:poosl}t_executiontree_base"/&gt;
 *           &lt;element name="return" type="{uri:poosl}t_executiontree_base"/&gt;
 *           &lt;element name="switch" type="{uri:poosl}t_executiontree_base"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="execution_tree" type="{uri:poosl}t_executiontree" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="sourcecode_index_start" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *       &lt;attribute name="sourcecode_index_end" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t_executiontree",
        propOrder = { "sequentialOrMethodCallOrParallel", "executionTree" })
public class TExecutiontree {

    @XmlElementRefs({
            @XmlElementRef(name = "sequential",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "method_call",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "parallel",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "select",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "statement",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "expression",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "process_method_call",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "message_send",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "message_receive",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "guard",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "while",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "abort",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "interrupt",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "skip",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "delay",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "sequence_of_expressions",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "assignment",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "data_method_call",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "constant",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "variable",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "binary_operation",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "unary_operation",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "self",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "nil",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "current_time",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "if",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "new",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "return",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false),
            @XmlElementRef(name = "switch",
                    namespace = "uri:poosl",
                    type = JAXBElement.class,
                    required = false) })
    protected List<JAXBElement<? extends TExecutiontreeBase>> sequentialOrMethodCallOrParallel;

    @XmlElement(name = "execution_tree")
    protected List<TExecutiontree> executionTree;

    @XmlAttribute(name = "sourcecode_index_start", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sourcecodeIndexStart;

    @XmlAttribute(name = "sourcecode_index_end", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sourcecodeIndexEnd;

    /**
     * Gets the value of the sequentialOrMethodCallOrParallel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * sequentialOrMethodCallOrParallel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSequentialOrMethodCallOrParallel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TExecutiontreeStatements }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeMethodCall }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeStatements }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeStatements }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeBase }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeExpression }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeBase }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeMessageSend }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeMessageReceive
     * }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeBase }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeBase }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeBase }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeBase }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeBase }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeBase }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeBase }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeBase }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeBase }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeBase }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeBase }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeBase }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeBase }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeBase }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeBase }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeBase }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeBase }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeBase }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeBase }{@code >}
     * {@link JAXBElement }{@code <}{@link TExecutiontreeBase }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends TExecutiontreeBase>> getSequentialOrMethodCallOrParallel() {
        if (sequentialOrMethodCallOrParallel == null) {
            sequentialOrMethodCallOrParallel = new ArrayList<JAXBElement<? extends TExecutiontreeBase>>();
        }
        return this.sequentialOrMethodCallOrParallel;
    }

    /**
     * Gets the value of the executionTree property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the executionTree
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getExecutionTree().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TExecutiontree }
     * 
     * 
     */
    public List<TExecutiontree> getExecutionTree() {
        if (executionTree == null) {
            executionTree = new ArrayList<TExecutiontree>();
        }
        return this.executionTree;
    }

    /**
     * Gets the value of the sourcecodeIndexStart property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     * 
     */
    public BigInteger getSourcecodeIndexStart() {
        return sourcecodeIndexStart;
    }

    /**
     * Sets the value of the sourcecodeIndexStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     * 
     */
    public void setSourcecodeIndexStart(BigInteger value) {
        this.sourcecodeIndexStart = value;
    }

    /**
     * Gets the value of the sourcecodeIndexEnd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     * 
     */
    public BigInteger getSourcecodeIndexEnd() {
        return sourcecodeIndexEnd;
    }

    /**
     * Sets the value of the sourcecodeIndexEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     * 
     */
    public void setSourcecodeIndexEnd(BigInteger value) {
        this.sourcecodeIndexEnd = value;
    }

}

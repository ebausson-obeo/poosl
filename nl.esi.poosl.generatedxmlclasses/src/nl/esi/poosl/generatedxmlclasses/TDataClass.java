//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.16 at 11:04:04 AM CET 
//

package nl.esi.poosl.generatedxmlclasses;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for t_data_class complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="t_data_class">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="super_class" type="{uri:poosl}t_poosl_type" minOccurs="0"/>
 *         &lt;element name="instance_variable" type="{uri:poosl}t_typed_variable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="data_method" type="{uri:poosl}t_data_method" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="annotation" type="{uri:poosl}t_data_class_annotation" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{uri:poosl}t_poosl_type" />
 *       &lt;attribute name="native" type="{uri:poosl}t_boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "t_data_class", propOrder = { "superClass", "instanceVariable", "dataMethod", "annotation" })
public class TDataClass {

    @XmlElement(name = "super_class")
    protected String superClass;

    @XmlElement(name = "instance_variable")
    protected List<TTypedVariable> instanceVariable;

    @XmlElement(name = "data_method")
    protected List<TDataMethod> dataMethod;

    protected TDataClassAnnotation annotation;

    @XmlAttribute(name = "name", required = true)
    protected String name;

    @XmlAttribute(name = "native")
    protected TBoolean _native;

    /**
     * Gets the value of the superClass property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSuperClass() {
        return superClass;
    }

    /**
     * Sets the value of the superClass property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSuperClass(String value) {
        this.superClass = value;
    }

    /**
     * Gets the value of the instanceVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the instanceVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getInstanceVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link TTypedVariable }
     * 
     * 
     */
    public List<TTypedVariable> getInstanceVariable() {
        if (instanceVariable == null) {
            instanceVariable = new ArrayList<TTypedVariable>();
        }
        return this.instanceVariable;
    }

    /**
     * Gets the value of the dataMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the dataMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getDataMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link TDataMethod }
     * 
     * 
     */
    public List<TDataMethod> getDataMethod() {
        if (dataMethod == null) {
            dataMethod = new ArrayList<TDataMethod>();
        }
        return this.dataMethod;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * @return possible object is {@link TDataClassAnnotation }
     * 
     */
    public TDataClassAnnotation getAnnotation() {
        return annotation;
    }

    /**
     * Sets the value of the annotation property.
     * 
     * @param value
     *            allowed object is {@link TDataClassAnnotation }
     * 
     */
    public void setAnnotation(TDataClassAnnotation value) {
        this.annotation = value;
    }

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
     * Gets the value of the native property.
     * 
     * @return possible object is {@link TBoolean }
     * 
     */
    public TBoolean getNative() {
        return _native;
    }

    /**
     * Sets the value of the native property.
     * 
     * @param value
     *            allowed object is {@link TBoolean }
     * 
     */
    public void setNative(TBoolean value) {
        this._native = value;
    }

}

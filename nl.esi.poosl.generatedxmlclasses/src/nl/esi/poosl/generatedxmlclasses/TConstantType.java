//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.16 at 11:04:04 AM CET 
//

package nl.esi.poosl.generatedxmlclasses;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for t_constant_type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="t_constant_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="string"/>
 *     &lt;enumeration value="character"/>
 *     &lt;enumeration value="integer"/>
 *     &lt;enumeration value="real"/>
 *     &lt;enumeration value="boolean"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "t_constant_type")
@XmlEnum
public enum TConstantType {

    @XmlEnumValue("string")
    STRING("string"), @XmlEnumValue("character")
    CHARACTER("character"), @XmlEnumValue("integer")
    INTEGER("integer"), @XmlEnumValue("real")
    REAL("real"), @XmlEnumValue("boolean")
    BOOLEAN("boolean"), @XmlEnumValue("unknown")
    UNKNOWN("unknown");

    private final String value;

    TConstantType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TConstantType fromValue(String v) {
        for (TConstantType c : TConstantType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

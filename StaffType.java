//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.02 a las 03:52:44 PM EDT 
//


package mjaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para staff-type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="staff-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ossia"/>
 *     &lt;enumeration value="cue"/>
 *     &lt;enumeration value="editorial"/>
 *     &lt;enumeration value="regular"/>
 *     &lt;enumeration value="alternate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "staff-type")
@XmlEnum
public enum StaffType {

    @XmlEnumValue("ossia")
    OSSIA("ossia"),
    @XmlEnumValue("cue")
    CUE("cue"),
    @XmlEnumValue("editorial")
    EDITORIAL("editorial"),
    @XmlEnumValue("regular")
    REGULAR("regular"),
    @XmlEnumValue("alternate")
    ALTERNATE("alternate");
    private final java.lang.String value;

    StaffType(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static StaffType fromValue(java.lang.String v) {
        for (StaffType c: StaffType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

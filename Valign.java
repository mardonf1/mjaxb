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
 * <p>Clase Java para valign.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="valign">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="top"/>
 *     &lt;enumeration value="middle"/>
 *     &lt;enumeration value="bottom"/>
 *     &lt;enumeration value="baseline"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "valign")
@XmlEnum
public enum Valign {

    @XmlEnumValue("top")
    TOP("top"),
    @XmlEnumValue("middle")
    MIDDLE("middle"),
    @XmlEnumValue("bottom")
    BOTTOM("bottom"),
    @XmlEnumValue("baseline")
    BASELINE("baseline");
    private final java.lang.String value;

    Valign(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static Valign fromValue(java.lang.String v) {
        for (Valign c: Valign.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

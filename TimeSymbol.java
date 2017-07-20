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
 * <p>Clase Java para time-symbol.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="time-symbol">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="common"/>
 *     &lt;enumeration value="cut"/>
 *     &lt;enumeration value="single-number"/>
 *     &lt;enumeration value="note"/>
 *     &lt;enumeration value="dotted-note"/>
 *     &lt;enumeration value="normal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "time-symbol")
@XmlEnum
public enum TimeSymbol {

    @XmlEnumValue("common")
    COMMON("common"),
    @XmlEnumValue("cut")
    CUT("cut"),
    @XmlEnumValue("single-number")
    SINGLE_NUMBER("single-number"),
    @XmlEnumValue("note")
    NOTE("note"),
    @XmlEnumValue("dotted-note")
    DOTTED_NOTE("dotted-note"),
    @XmlEnumValue("normal")
    NORMAL("normal");
    private final java.lang.String value;

    TimeSymbol(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TimeSymbol fromValue(java.lang.String v) {
        for (TimeSymbol c: TimeSymbol.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

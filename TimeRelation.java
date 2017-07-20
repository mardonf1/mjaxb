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
 * <p>Clase Java para time-relation.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="time-relation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="parentheses"/>
 *     &lt;enumeration value="bracket"/>
 *     &lt;enumeration value="equals"/>
 *     &lt;enumeration value="slash"/>
 *     &lt;enumeration value="space"/>
 *     &lt;enumeration value="hyphen"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "time-relation")
@XmlEnum
public enum TimeRelation {

    @XmlEnumValue("parentheses")
    PARENTHESES("parentheses"),
    @XmlEnumValue("bracket")
    BRACKET("bracket"),
    @XmlEnumValue("equals")
    EQUALS("equals"),
    @XmlEnumValue("slash")
    SLASH("slash"),
    @XmlEnumValue("space")
    SPACE("space"),
    @XmlEnumValue("hyphen")
    HYPHEN("hyphen");
    private final java.lang.String value;

    TimeRelation(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static TimeRelation fromValue(java.lang.String v) {
        for (TimeRelation c: TimeRelation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

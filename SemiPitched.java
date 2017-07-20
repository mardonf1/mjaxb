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
 * <p>Clase Java para semi-pitched.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="semi-pitched">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="high"/>
 *     &lt;enumeration value="medium-high"/>
 *     &lt;enumeration value="medium"/>
 *     &lt;enumeration value="medium-low"/>
 *     &lt;enumeration value="low"/>
 *     &lt;enumeration value="very-low"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "semi-pitched")
@XmlEnum
public enum SemiPitched {

    @XmlEnumValue("high")
    HIGH("high"),
    @XmlEnumValue("medium-high")
    MEDIUM_HIGH("medium-high"),
    @XmlEnumValue("medium")
    MEDIUM("medium"),
    @XmlEnumValue("medium-low")
    MEDIUM_LOW("medium-low"),
    @XmlEnumValue("low")
    LOW("low"),
    @XmlEnumValue("very-low")
    VERY_LOW("very-low");
    private final java.lang.String value;

    SemiPitched(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static SemiPitched fromValue(java.lang.String v) {
        for (SemiPitched c: SemiPitched.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

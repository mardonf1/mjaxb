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
 * <p>Clase Java para clef-sign.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="clef-sign">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="percussion"/>
 *     &lt;enumeration value="TAB"/>
 *     &lt;enumeration value="jianpu"/>
 *     &lt;enumeration value="none"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "clef-sign")
@XmlEnum
public enum ClefSign {

    G("G"),
    F("F"),
    C("C"),
    @XmlEnumValue("percussion")
    PERCUSSION("percussion"),
    TAB("TAB"),
    @XmlEnumValue("jianpu")
    JIANPU("jianpu"),
    @XmlEnumValue("none")
    NONE("none");
    private final java.lang.String value;

    ClefSign(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ClefSign fromValue(java.lang.String v) {
        for (ClefSign c: ClefSign.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

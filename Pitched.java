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
 * <p>Clase Java para pitched.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="pitched">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="chimes"/>
 *     &lt;enumeration value="glockenspiel"/>
 *     &lt;enumeration value="mallet"/>
 *     &lt;enumeration value="marimba"/>
 *     &lt;enumeration value="tubular chimes"/>
 *     &lt;enumeration value="vibraphone"/>
 *     &lt;enumeration value="xylophone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "pitched")
@XmlEnum
public enum Pitched {

    @XmlEnumValue("chimes")
    CHIMES("chimes"),
    @XmlEnumValue("glockenspiel")
    GLOCKENSPIEL("glockenspiel"),
    @XmlEnumValue("mallet")
    MALLET("mallet"),
    @XmlEnumValue("marimba")
    MARIMBA("marimba"),
    @XmlEnumValue("tubular chimes")
    TUBULAR_CHIMES("tubular chimes"),
    @XmlEnumValue("vibraphone")
    VIBRAPHONE("vibraphone"),
    @XmlEnumValue("xylophone")
    XYLOPHONE("xylophone");
    private final java.lang.String value;

    Pitched(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static Pitched fromValue(java.lang.String v) {
        for (Pitched c: Pitched.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

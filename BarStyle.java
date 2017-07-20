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
 * <p>Clase Java para bar-style.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="bar-style">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="regular"/>
 *     &lt;enumeration value="dotted"/>
 *     &lt;enumeration value="dashed"/>
 *     &lt;enumeration value="heavy"/>
 *     &lt;enumeration value="light-light"/>
 *     &lt;enumeration value="light-heavy"/>
 *     &lt;enumeration value="heavy-light"/>
 *     &lt;enumeration value="heavy-heavy"/>
 *     &lt;enumeration value="tick"/>
 *     &lt;enumeration value="short"/>
 *     &lt;enumeration value="none"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "bar-style")
@XmlEnum
public enum BarStyle {

    @XmlEnumValue("regular")
    REGULAR("regular"),
    @XmlEnumValue("dotted")
    DOTTED("dotted"),
    @XmlEnumValue("dashed")
    DASHED("dashed"),
    @XmlEnumValue("heavy")
    HEAVY("heavy"),
    @XmlEnumValue("light-light")
    LIGHT_LIGHT("light-light"),
    @XmlEnumValue("light-heavy")
    LIGHT_HEAVY("light-heavy"),
    @XmlEnumValue("heavy-light")
    HEAVY_LIGHT("heavy-light"),
    @XmlEnumValue("heavy-heavy")
    HEAVY_HEAVY("heavy-heavy"),
    @XmlEnumValue("tick")
    TICK("tick"),
    @XmlEnumValue("short")
    SHORT("short"),
    @XmlEnumValue("none")
    NONE("none");
    private final java.lang.String value;

    BarStyle(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static BarStyle fromValue(java.lang.String v) {
        for (BarStyle c: BarStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

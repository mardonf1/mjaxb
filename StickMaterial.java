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
 * <p>Clase Java para stick-material.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="stick-material">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="soft"/>
 *     &lt;enumeration value="medium"/>
 *     &lt;enumeration value="hard"/>
 *     &lt;enumeration value="shaded"/>
 *     &lt;enumeration value="x"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "stick-material")
@XmlEnum
public enum StickMaterial {

    @XmlEnumValue("soft")
    SOFT("soft"),
    @XmlEnumValue("medium")
    MEDIUM("medium"),
    @XmlEnumValue("hard")
    HARD("hard"),
    @XmlEnumValue("shaded")
    SHADED("shaded"),
    @XmlEnumValue("x")
    X("x");
    private final java.lang.String value;

    StickMaterial(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static StickMaterial fromValue(java.lang.String v) {
        for (StickMaterial c: StickMaterial.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

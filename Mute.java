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
 * <p>Clase Java para mute.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="mute">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="on"/>
 *     &lt;enumeration value="off"/>
 *     &lt;enumeration value="straight"/>
 *     &lt;enumeration value="cup"/>
 *     &lt;enumeration value="harmon-no-stem"/>
 *     &lt;enumeration value="harmon-stem"/>
 *     &lt;enumeration value="bucket"/>
 *     &lt;enumeration value="plunger"/>
 *     &lt;enumeration value="hat"/>
 *     &lt;enumeration value="solotone"/>
 *     &lt;enumeration value="practice"/>
 *     &lt;enumeration value="stop-mute"/>
 *     &lt;enumeration value="stop-hand"/>
 *     &lt;enumeration value="echo"/>
 *     &lt;enumeration value="palm"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "mute")
@XmlEnum
public enum Mute {

    @XmlEnumValue("on")
    ON("on"),
    @XmlEnumValue("off")
    OFF("off"),
    @XmlEnumValue("straight")
    STRAIGHT("straight"),
    @XmlEnumValue("cup")
    CUP("cup"),
    @XmlEnumValue("harmon-no-stem")
    HARMON_NO_STEM("harmon-no-stem"),
    @XmlEnumValue("harmon-stem")
    HARMON_STEM("harmon-stem"),
    @XmlEnumValue("bucket")
    BUCKET("bucket"),
    @XmlEnumValue("plunger")
    PLUNGER("plunger"),
    @XmlEnumValue("hat")
    HAT("hat"),
    @XmlEnumValue("solotone")
    SOLOTONE("solotone"),
    @XmlEnumValue("practice")
    PRACTICE("practice"),
    @XmlEnumValue("stop-mute")
    STOP_MUTE("stop-mute"),
    @XmlEnumValue("stop-hand")
    STOP_HAND("stop-hand"),
    @XmlEnumValue("echo")
    ECHO("echo"),
    @XmlEnumValue("palm")
    PALM("palm");
    private final java.lang.String value;

    Mute(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static Mute fromValue(java.lang.String v) {
        for (Mute c: Mute.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

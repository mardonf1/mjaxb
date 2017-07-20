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
 * <p>Clase Java para handbell-value.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="handbell-value">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="damp"/>
 *     &lt;enumeration value="echo"/>
 *     &lt;enumeration value="gyro"/>
 *     &lt;enumeration value="hand martellato"/>
 *     &lt;enumeration value="mallet lift"/>
 *     &lt;enumeration value="mallet table"/>
 *     &lt;enumeration value="martellato"/>
 *     &lt;enumeration value="martellato lift"/>
 *     &lt;enumeration value="muted martellato"/>
 *     &lt;enumeration value="pluck lift"/>
 *     &lt;enumeration value="swing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "handbell-value")
@XmlEnum
public enum HandbellValue {

    @XmlEnumValue("damp")
    DAMP("damp"),
    @XmlEnumValue("echo")
    ECHO("echo"),
    @XmlEnumValue("gyro")
    GYRO("gyro"),
    @XmlEnumValue("hand martellato")
    HAND_MARTELLATO("hand martellato"),
    @XmlEnumValue("mallet lift")
    MALLET_LIFT("mallet lift"),
    @XmlEnumValue("mallet table")
    MALLET_TABLE("mallet table"),
    @XmlEnumValue("martellato")
    MARTELLATO("martellato"),
    @XmlEnumValue("martellato lift")
    MARTELLATO_LIFT("martellato lift"),
    @XmlEnumValue("muted martellato")
    MUTED_MARTELLATO("muted martellato"),
    @XmlEnumValue("pluck lift")
    PLUCK_LIFT("pluck lift"),
    @XmlEnumValue("swing")
    SWING("swing");
    private final java.lang.String value;

    HandbellValue(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static HandbellValue fromValue(java.lang.String v) {
        for (HandbellValue c: HandbellValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

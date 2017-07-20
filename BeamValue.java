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
 * <p>Clase Java para beam-value.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="beam-value">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="begin"/>
 *     &lt;enumeration value="continue"/>
 *     &lt;enumeration value="end"/>
 *     &lt;enumeration value="forward hook"/>
 *     &lt;enumeration value="backward hook"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "beam-value")
@XmlEnum
public enum BeamValue {

    @XmlEnumValue("begin")
    BEGIN("begin"),
    @XmlEnumValue("continue")
    CONTINUE("continue"),
    @XmlEnumValue("end")
    END("end"),
    @XmlEnumValue("forward hook")
    FORWARD_HOOK("forward hook"),
    @XmlEnumValue("backward hook")
    BACKWARD_HOOK("backward hook");
    private final java.lang.String value;

    BeamValue(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static BeamValue fromValue(java.lang.String v) {
        for (BeamValue c: BeamValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

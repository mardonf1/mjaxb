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
 * <p>Clase Java para stick-location.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="stick-location">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="center"/>
 *     &lt;enumeration value="rim"/>
 *     &lt;enumeration value="cymbal bell"/>
 *     &lt;enumeration value="cymbal edge"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "stick-location")
@XmlEnum
public enum StickLocation {

    @XmlEnumValue("center")
    CENTER("center"),
    @XmlEnumValue("rim")
    RIM("rim"),
    @XmlEnumValue("cymbal bell")
    CYMBAL_BELL("cymbal bell"),
    @XmlEnumValue("cymbal edge")
    CYMBAL_EDGE("cymbal edge");
    private final java.lang.String value;

    StickLocation(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static StickLocation fromValue(java.lang.String v) {
        for (StickLocation c: StickLocation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Clase Java para arrow-style.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="arrow-style">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="single"/>
 *     &lt;enumeration value="double"/>
 *     &lt;enumeration value="filled"/>
 *     &lt;enumeration value="hollow"/>
 *     &lt;enumeration value="paired"/>
 *     &lt;enumeration value="combined"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "arrow-style")
@XmlEnum
public enum ArrowStyle {

    @XmlEnumValue("single")
    SINGLE("single"),
    @XmlEnumValue("double")
    DOUBLE("double"),
    @XmlEnumValue("filled")
    FILLED("filled"),
    @XmlEnumValue("hollow")
    HOLLOW("hollow"),
    @XmlEnumValue("paired")
    PAIRED("paired"),
    @XmlEnumValue("combined")
    COMBINED("combined"),
    @XmlEnumValue("other")
    OTHER("other");
    private final java.lang.String value;

    ArrowStyle(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static ArrowStyle fromValue(java.lang.String v) {
        for (ArrowStyle c: ArrowStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

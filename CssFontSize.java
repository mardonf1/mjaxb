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
 * <p>Clase Java para css-font-size.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="css-font-size">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="xx-small"/>
 *     &lt;enumeration value="x-small"/>
 *     &lt;enumeration value="small"/>
 *     &lt;enumeration value="medium"/>
 *     &lt;enumeration value="large"/>
 *     &lt;enumeration value="x-large"/>
 *     &lt;enumeration value="xx-large"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "css-font-size")
@XmlEnum
public enum CssFontSize {

    @XmlEnumValue("xx-small")
    XX_SMALL("xx-small"),
    @XmlEnumValue("x-small")
    X_SMALL("x-small"),
    @XmlEnumValue("small")
    SMALL("small"),
    @XmlEnumValue("medium")
    MEDIUM("medium"),
    @XmlEnumValue("large")
    LARGE("large"),
    @XmlEnumValue("x-large")
    X_LARGE("x-large"),
    @XmlEnumValue("xx-large")
    XX_LARGE("xx-large");
    private final java.lang.String value;

    CssFontSize(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CssFontSize fromValue(java.lang.String v) {
        for (CssFontSize c: CssFontSize.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

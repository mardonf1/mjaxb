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
 * <p>Clase Java para wedge-type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="wedge-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="crescendo"/>
 *     &lt;enumeration value="diminuendo"/>
 *     &lt;enumeration value="stop"/>
 *     &lt;enumeration value="continue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "wedge-type")
@XmlEnum
public enum WedgeType {

    @XmlEnumValue("crescendo")
    CRESCENDO("crescendo"),
    @XmlEnumValue("diminuendo")
    DIMINUENDO("diminuendo"),
    @XmlEnumValue("stop")
    STOP("stop"),
    @XmlEnumValue("continue")
    CONTINUE("continue");
    private final java.lang.String value;

    WedgeType(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static WedgeType fromValue(java.lang.String v) {
        for (WedgeType c: WedgeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

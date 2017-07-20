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
 * <p>Clase Java para line-type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="line-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="solid"/>
 *     &lt;enumeration value="dashed"/>
 *     &lt;enumeration value="dotted"/>
 *     &lt;enumeration value="wavy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "line-type")
@XmlEnum
public enum LineType {

    @XmlEnumValue("solid")
    SOLID("solid"),
    @XmlEnumValue("dashed")
    DASHED("dashed"),
    @XmlEnumValue("dotted")
    DOTTED("dotted"),
    @XmlEnumValue("wavy")
    WAVY("wavy");
    private final java.lang.String value;

    LineType(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static LineType fromValue(java.lang.String v) {
        for (LineType c: LineType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

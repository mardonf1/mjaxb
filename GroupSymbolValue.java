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
 * <p>Clase Java para group-symbol-value.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="group-symbol-value">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="brace"/>
 *     &lt;enumeration value="line"/>
 *     &lt;enumeration value="bracket"/>
 *     &lt;enumeration value="square"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "group-symbol-value")
@XmlEnum
public enum GroupSymbolValue {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("brace")
    BRACE("brace"),
    @XmlEnumValue("line")
    LINE("line"),
    @XmlEnumValue("bracket")
    BRACKET("bracket"),
    @XmlEnumValue("square")
    SQUARE("square");
    private final java.lang.String value;

    GroupSymbolValue(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static GroupSymbolValue fromValue(java.lang.String v) {
        for (GroupSymbolValue c: GroupSymbolValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

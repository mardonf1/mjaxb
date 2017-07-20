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
 * <p>Clase Java para effect.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="effect">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="anvil"/>
 *     &lt;enumeration value="auto horn"/>
 *     &lt;enumeration value="bird whistle"/>
 *     &lt;enumeration value="cannon"/>
 *     &lt;enumeration value="duck call"/>
 *     &lt;enumeration value="gun shot"/>
 *     &lt;enumeration value="klaxon horn"/>
 *     &lt;enumeration value="lions roar"/>
 *     &lt;enumeration value="police whistle"/>
 *     &lt;enumeration value="siren"/>
 *     &lt;enumeration value="slide whistle"/>
 *     &lt;enumeration value="thunder sheet"/>
 *     &lt;enumeration value="wind machine"/>
 *     &lt;enumeration value="wind whistle"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "effect")
@XmlEnum
public enum Effect {

    @XmlEnumValue("anvil")
    ANVIL("anvil"),
    @XmlEnumValue("auto horn")
    AUTO_HORN("auto horn"),
    @XmlEnumValue("bird whistle")
    BIRD_WHISTLE("bird whistle"),
    @XmlEnumValue("cannon")
    CANNON("cannon"),
    @XmlEnumValue("duck call")
    DUCK_CALL("duck call"),
    @XmlEnumValue("gun shot")
    GUN_SHOT("gun shot"),
    @XmlEnumValue("klaxon horn")
    KLAXON_HORN("klaxon horn"),
    @XmlEnumValue("lions roar")
    LIONS_ROAR("lions roar"),
    @XmlEnumValue("police whistle")
    POLICE_WHISTLE("police whistle"),
    @XmlEnumValue("siren")
    SIREN("siren"),
    @XmlEnumValue("slide whistle")
    SLIDE_WHISTLE("slide whistle"),
    @XmlEnumValue("thunder sheet")
    THUNDER_SHEET("thunder sheet"),
    @XmlEnumValue("wind machine")
    WIND_MACHINE("wind machine"),
    @XmlEnumValue("wind whistle")
    WIND_WHISTLE("wind whistle");
    private final java.lang.String value;

    Effect(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static Effect fromValue(java.lang.String v) {
        for (Effect c: Effect.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

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
 * <p>Clase Java para membrane.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="membrane">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bass drum"/>
 *     &lt;enumeration value="bass drum on side"/>
 *     &lt;enumeration value="bongos"/>
 *     &lt;enumeration value="conga drum"/>
 *     &lt;enumeration value="goblet drum"/>
 *     &lt;enumeration value="military drum"/>
 *     &lt;enumeration value="snare drum"/>
 *     &lt;enumeration value="snare drum snares off"/>
 *     &lt;enumeration value="tambourine"/>
 *     &lt;enumeration value="tenor drum"/>
 *     &lt;enumeration value="timbales"/>
 *     &lt;enumeration value="tomtom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "membrane")
@XmlEnum
public enum Membrane {

    @XmlEnumValue("bass drum")
    BASS_DRUM("bass drum"),
    @XmlEnumValue("bass drum on side")
    BASS_DRUM_ON_SIDE("bass drum on side"),
    @XmlEnumValue("bongos")
    BONGOS("bongos"),
    @XmlEnumValue("conga drum")
    CONGA_DRUM("conga drum"),
    @XmlEnumValue("goblet drum")
    GOBLET_DRUM("goblet drum"),
    @XmlEnumValue("military drum")
    MILITARY_DRUM("military drum"),
    @XmlEnumValue("snare drum")
    SNARE_DRUM("snare drum"),
    @XmlEnumValue("snare drum snares off")
    SNARE_DRUM_SNARES_OFF("snare drum snares off"),
    @XmlEnumValue("tambourine")
    TAMBOURINE("tambourine"),
    @XmlEnumValue("tenor drum")
    TENOR_DRUM("tenor drum"),
    @XmlEnumValue("timbales")
    TIMBALES("timbales"),
    @XmlEnumValue("tomtom")
    TOMTOM("tomtom");
    private final java.lang.String value;

    Membrane(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static Membrane fromValue(java.lang.String v) {
        for (Membrane c: Membrane.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

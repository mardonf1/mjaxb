//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.02 a las 03:52:44 PM EDT 
//


package mjaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Beam values include begin, continue, end, forward hook, and backward hook. Up to eight concurrent beams are available to cover up to 1024th notes. Each beam in a note is represented with a separate beam element, starting with the eighth note beam using a number attribute of 1.
 * 
 * Note that the beam number does not distinguish sets of beams that overlap, as it does for slur and other elements. Beaming groups are distinguished by being in different voices and/or the presence or absence of grace and cue elements.
 * 
 * Beams that have a begin value can also have a fan attribute to indicate accelerandos and ritardandos using fanned beams. The fan attribute may also be used with a continue value if the fanning direction changes on that note. The value is "none" if not specified.
 * 	
 * The repeater attribute has been deprecated in MusicXML 3.0. Formerly used for tremolos, it needs to be specified with a "yes" value for each beam using it.
 * 
 * <p>Clase Java para beam complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="beam">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>beam-value">
 *       &lt;attGroup ref="{}color"/>
 *       &lt;attribute name="number" type="{}beam-level" default="1" />
 *       &lt;attribute name="repeater" type="{}yes-no" />
 *       &lt;attribute name="fan" type="{}fan" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beam", propOrder = {
    "value"
})
public class Beam {

    @XmlValue
    protected BeamValue value;
    @XmlAttribute(name = "number")
    protected Integer number;
    @XmlAttribute(name = "repeater")
    protected YesNo repeater;
    @XmlAttribute(name = "fan")
    protected Fan fan;
    @XmlAttribute(name = "color")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String color;

    /**
     * The beam-value type represents the type of beam associated with each of 8 beam levels (up to 1024th notes) available for each note.
     * 
     * @return
     *     possible object is
     *     {@link BeamValue }
     *     
     */
    public BeamValue getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link BeamValue }
     *     
     */
    public void setValue(BeamValue value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad number.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getNumber() {
        if (number == null) {
            return  1;
        } else {
            return number;
        }
    }

    /**
     * Define el valor de la propiedad number.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumber(Integer value) {
        this.number = value;
    }

    /**
     * Obtiene el valor de la propiedad repeater.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getRepeater() {
        return repeater;
    }

    /**
     * Define el valor de la propiedad repeater.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setRepeater(YesNo value) {
        this.repeater = value;
    }

    /**
     * Obtiene el valor de la propiedad fan.
     * 
     * @return
     *     possible object is
     *     {@link Fan }
     *     
     */
    public Fan getFan() {
        return fan;
    }

    /**
     * Define el valor de la propiedad fan.
     * 
     * @param value
     *     allowed object is
     *     {@link Fan }
     *     
     */
    public void setFan(Fan value) {
        this.fan = value;
    }

    /**
     * Obtiene el valor de la propiedad color.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getColor() {
        return color;
    }

    /**
     * Define el valor de la propiedad color.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setColor(java.lang.String value) {
        this.color = value;
    }

}

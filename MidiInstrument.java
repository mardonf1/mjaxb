//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.02 a las 03:52:44 PM EDT 
//


package mjaxb;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The midi-instrument type defines MIDI 1.0 instrument playback. The midi-instrument element can be a part of either the score-instrument element at the start of a part, or the sound element within a part. The id attribute refers to the score-instrument affected by the change.
 * 
 * <p>Clase Java para midi-instrument complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="midi-instrument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="midi-channel" type="{}midi-16" minOccurs="0"/>
 *         &lt;element name="midi-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="midi-bank" type="{}midi-16384" minOccurs="0"/>
 *         &lt;element name="midi-program" type="{}midi-128" minOccurs="0"/>
 *         &lt;element name="midi-unpitched" type="{}midi-128" minOccurs="0"/>
 *         &lt;element name="volume" type="{}percent" minOccurs="0"/>
 *         &lt;element name="pan" type="{}rotation-degrees" minOccurs="0"/>
 *         &lt;element name="elevation" type="{}rotation-degrees" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "midi-instrument", propOrder = {
    "midiChannel",
    "midiName",
    "midiBank",
    "midiProgram",
    "midiUnpitched",
    "volume",
    "pan",
    "elevation"
})
public class MidiInstrument {

    @XmlElement(name = "midi-channel")
    @XmlSchemaType(name = "positiveInteger")
    protected Integer midiChannel;
    @XmlElement(name = "midi-name")
    protected java.lang.String midiName;
    @XmlElement(name = "midi-bank")
    @XmlSchemaType(name = "positiveInteger")
    protected Integer midiBank;
    @XmlElement(name = "midi-program")
    @XmlSchemaType(name = "positiveInteger")
    protected Integer midiProgram;
    @XmlElement(name = "midi-unpitched")
    @XmlSchemaType(name = "positiveInteger")
    protected Integer midiUnpitched;
    protected BigDecimal volume;
    protected BigDecimal pan;
    protected BigDecimal elevation;
    @XmlAttribute(name = "id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object id;

    /**
     * Obtiene el valor de la propiedad midiChannel.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMidiChannel() {
        return midiChannel;
    }

    /**
     * Define el valor de la propiedad midiChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMidiChannel(Integer value) {
        this.midiChannel = value;
    }

    /**
     * Obtiene el valor de la propiedad midiName.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getMidiName() {
        return midiName;
    }

    /**
     * Define el valor de la propiedad midiName.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setMidiName(java.lang.String value) {
        this.midiName = value;
    }

    /**
     * Obtiene el valor de la propiedad midiBank.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMidiBank() {
        return midiBank;
    }

    /**
     * Define el valor de la propiedad midiBank.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMidiBank(Integer value) {
        this.midiBank = value;
    }

    /**
     * Obtiene el valor de la propiedad midiProgram.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMidiProgram() {
        return midiProgram;
    }

    /**
     * Define el valor de la propiedad midiProgram.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMidiProgram(Integer value) {
        this.midiProgram = value;
    }

    /**
     * Obtiene el valor de la propiedad midiUnpitched.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMidiUnpitched() {
        return midiUnpitched;
    }

    /**
     * Define el valor de la propiedad midiUnpitched.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMidiUnpitched(Integer value) {
        this.midiUnpitched = value;
    }

    /**
     * Obtiene el valor de la propiedad volume.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * Define el valor de la propiedad volume.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolume(BigDecimal value) {
        this.volume = value;
    }

    /**
     * Obtiene el valor de la propiedad pan.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPan() {
        return pan;
    }

    /**
     * Define el valor de la propiedad pan.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPan(BigDecimal value) {
        this.pan = value;
    }

    /**
     * Obtiene el valor de la propiedad elevation.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getElevation() {
        return elevation;
    }

    /**
     * Define el valor de la propiedad elevation.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setElevation(BigDecimal value) {
        this.elevation = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setId(Object value) {
        this.id = value;
    }

}

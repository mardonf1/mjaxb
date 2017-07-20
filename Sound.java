//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.02 a las 03:52:44 PM EDT 
//


package mjaxb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The sound element contains general playback parameters. They can stand alone within a part/measure, or be a component element within a direction.
 * 	
 * Tempo is expressed in quarter notes per minute. If 0, the sound-generating program should prompt the user at the time of compiling a sound (MIDI) file.
 * 	
 * Dynamics (or MIDI velocity) are expressed as a percentage of the default forte value (90 for MIDI 1.0).
 * 	
 * Dacapo indicates to go back to the beginning of the movement. When used it always has the value "yes".
 * 	
 * Segno and dalsegno are used for backwards jumps to a segno sign; coda and tocoda are used for forward jumps to a coda sign. If there are multiple jumps, the value of these parameters can be used to name and distinguish them. If segno or coda is used, the divisions attribute can also be used to indicate the number of divisions per quarter note. Otherwise sound and MIDI generating programs may have to recompute this.
 * 	
 * By default, a dalsegno or dacapo attribute indicates that the jump should occur the first time through, while a tocoda attribute indicates the jump should occur the second time through. The time that jumps occur can be changed by using the time-only attribute.
 * 	
 * Forward-repeat is used when a forward repeat sign is implied, and usually follows a bar line. When used it always has the value of "yes".
 * 	
 * The fine attribute follows the final note or rest in a movement with a da capo or dal segno direction. If numeric, the value represents the actual duration of the final note or rest, which can be ambiguous in written notation and different among parts and voices. The value may also be "yes" to indicate no change to the final duration.
 * 	
 * If the sound element applies only particular times through a repeat, the time-only attribute indicates which times to apply the sound element.
 * 	
 * Pizzicato in a sound element effects all following notes. Yes indicates pizzicato, no indicates arco.
 * 
 * The pan and elevation attributes are deprecated in Version 2.0. The pan and elevation elements in the midi-instrument element should be used instead. The meaning of the pan and elevation attributes is the same as for the pan and elevation elements. If both are present, the mid-instrument elements take priority.
 * 	
 * The damper-pedal, soft-pedal, and sostenuto-pedal attributes effect playback of the three common piano pedals and their MIDI controller equivalents. The yes value indicates the pedal is depressed; no indicates the pedal is released. A numeric value from 0 to 100 may also be used for half pedaling. This value is the percentage that the pedal is depressed. A value of 0 is equivalent to no, and a value of 100 is equivalent to yes.
 * 	
 * MIDI devices, MIDI instruments, and playback techniques are changed using the midi-device, midi-instrument, and play elements. When there are multiple instances of these elements, they should be grouped together by instrument using the id attribute values.
 * 
 * The offset element is used to indicate that the sound takes place offset from the current score position. If the sound element is a child of a direction element, the sound offset element overrides the direction offset element if both elements are present. Note that the offset reflects the intended musical position for the change in sound. It should not be used to compensate for latency issues in particular hardware configurations.
 * 
 * <p>Clase Java para sound complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sound">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="midi-device" type="{}midi-device" minOccurs="0"/>
 *           &lt;element name="midi-instrument" type="{}midi-instrument" minOccurs="0"/>
 *           &lt;element name="play" type="{}play" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element name="offset" type="{}offset" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="tempo" type="{}non-negative-decimal" />
 *       &lt;attribute name="dynamics" type="{}non-negative-decimal" />
 *       &lt;attribute name="dacapo" type="{}yes-no" />
 *       &lt;attribute name="segno" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="dalsegno" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="coda" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="tocoda" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="divisions" type="{}divisions" />
 *       &lt;attribute name="forward-repeat" type="{}yes-no" />
 *       &lt;attribute name="fine" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="time-only" type="{}time-only" />
 *       &lt;attribute name="pizzicato" type="{}yes-no" />
 *       &lt;attribute name="pan" type="{}rotation-degrees" />
 *       &lt;attribute name="elevation" type="{}rotation-degrees" />
 *       &lt;attribute name="damper-pedal" type="{}yes-no-number" />
 *       &lt;attribute name="soft-pedal" type="{}yes-no-number" />
 *       &lt;attribute name="sostenuto-pedal" type="{}yes-no-number" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sound", propOrder = {
    "midiDeviceAndMidiInstrumentAndPlay",
    "offset"
})
public class Sound {

    @XmlElements({
        @XmlElement(name = "midi-device", type = MidiDevice.class),
        @XmlElement(name = "midi-instrument", type = MidiInstrument.class),
        @XmlElement(name = "play", type = Play.class)
    })
    protected List<Object> midiDeviceAndMidiInstrumentAndPlay;
    protected Offset offset;
    @XmlAttribute(name = "tempo")
    protected BigDecimal tempo;
    @XmlAttribute(name = "dynamics")
    protected BigDecimal dynamics;
    @XmlAttribute(name = "dacapo")
    protected YesNo dacapo;
    @XmlAttribute(name = "segno")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected java.lang.String segno;
    @XmlAttribute(name = "dalsegno")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected java.lang.String dalsegno;
    @XmlAttribute(name = "coda")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected java.lang.String coda;
    @XmlAttribute(name = "tocoda")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected java.lang.String tocoda;
    @XmlAttribute(name = "divisions")
    protected BigDecimal divisions;
    @XmlAttribute(name = "forward-repeat")
    protected YesNo forwardRepeat;
    @XmlAttribute(name = "fine")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected java.lang.String fine;
    @XmlAttribute(name = "time-only")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String timeOnly;
    @XmlAttribute(name = "pizzicato")
    protected YesNo pizzicato;
    @XmlAttribute(name = "pan")
    protected BigDecimal pan;
    @XmlAttribute(name = "elevation")
    protected BigDecimal elevation;
    @XmlAttribute(name = "damper-pedal")
    protected java.lang.String damperPedal;
    @XmlAttribute(name = "soft-pedal")
    protected java.lang.String softPedal;
    @XmlAttribute(name = "sostenuto-pedal")
    protected java.lang.String sostenutoPedal;

    /**
     * Gets the value of the midiDeviceAndMidiInstrumentAndPlay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the midiDeviceAndMidiInstrumentAndPlay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMidiDeviceAndMidiInstrumentAndPlay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MidiDevice }
     * {@link MidiInstrument }
     * {@link Play }
     * 
     * 
     */
    public List<Object> getMidiDeviceAndMidiInstrumentAndPlay() {
        if (midiDeviceAndMidiInstrumentAndPlay == null) {
            midiDeviceAndMidiInstrumentAndPlay = new ArrayList<Object>();
        }
        return this.midiDeviceAndMidiInstrumentAndPlay;
    }

    /**
     * Obtiene el valor de la propiedad offset.
     * 
     * @return
     *     possible object is
     *     {@link Offset }
     *     
     */
    public Offset getOffset() {
        return offset;
    }

    /**
     * Define el valor de la propiedad offset.
     * 
     * @param value
     *     allowed object is
     *     {@link Offset }
     *     
     */
    public void setOffset(Offset value) {
        this.offset = value;
    }

    /**
     * Obtiene el valor de la propiedad tempo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTempo() {
        return tempo;
    }

    /**
     * Define el valor de la propiedad tempo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTempo(BigDecimal value) {
        this.tempo = value;
    }

    /**
     * Obtiene el valor de la propiedad dynamics.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDynamics() {
        return dynamics;
    }

    /**
     * Define el valor de la propiedad dynamics.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDynamics(BigDecimal value) {
        this.dynamics = value;
    }

    /**
     * Obtiene el valor de la propiedad dacapo.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getDacapo() {
        return dacapo;
    }

    /**
     * Define el valor de la propiedad dacapo.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setDacapo(YesNo value) {
        this.dacapo = value;
    }

    /**
     * Obtiene el valor de la propiedad segno.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSegno() {
        return segno;
    }

    /**
     * Define el valor de la propiedad segno.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSegno(java.lang.String value) {
        this.segno = value;
    }

    /**
     * Obtiene el valor de la propiedad dalsegno.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDalsegno() {
        return dalsegno;
    }

    /**
     * Define el valor de la propiedad dalsegno.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDalsegno(java.lang.String value) {
        this.dalsegno = value;
    }

    /**
     * Obtiene el valor de la propiedad coda.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCoda() {
        return coda;
    }

    /**
     * Define el valor de la propiedad coda.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCoda(java.lang.String value) {
        this.coda = value;
    }

    /**
     * Obtiene el valor de la propiedad tocoda.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTocoda() {
        return tocoda;
    }

    /**
     * Define el valor de la propiedad tocoda.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTocoda(java.lang.String value) {
        this.tocoda = value;
    }

    /**
     * Obtiene el valor de la propiedad divisions.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDivisions() {
        return divisions;
    }

    /**
     * Define el valor de la propiedad divisions.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDivisions(BigDecimal value) {
        this.divisions = value;
    }

    /**
     * Obtiene el valor de la propiedad forwardRepeat.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getForwardRepeat() {
        return forwardRepeat;
    }

    /**
     * Define el valor de la propiedad forwardRepeat.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setForwardRepeat(YesNo value) {
        this.forwardRepeat = value;
    }

    /**
     * Obtiene el valor de la propiedad fine.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFine() {
        return fine;
    }

    /**
     * Define el valor de la propiedad fine.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFine(java.lang.String value) {
        this.fine = value;
    }

    /**
     * Obtiene el valor de la propiedad timeOnly.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getTimeOnly() {
        return timeOnly;
    }

    /**
     * Define el valor de la propiedad timeOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setTimeOnly(java.lang.String value) {
        this.timeOnly = value;
    }

    /**
     * Obtiene el valor de la propiedad pizzicato.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getPizzicato() {
        return pizzicato;
    }

    /**
     * Define el valor de la propiedad pizzicato.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setPizzicato(YesNo value) {
        this.pizzicato = value;
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
     * Obtiene el valor de la propiedad damperPedal.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDamperPedal() {
        return damperPedal;
    }

    /**
     * Define el valor de la propiedad damperPedal.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDamperPedal(java.lang.String value) {
        this.damperPedal = value;
    }

    /**
     * Obtiene el valor de la propiedad softPedal.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSoftPedal() {
        return softPedal;
    }

    /**
     * Define el valor de la propiedad softPedal.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSoftPedal(java.lang.String value) {
        this.softPedal = value;
    }

    /**
     * Obtiene el valor de la propiedad sostenutoPedal.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSostenutoPedal() {
        return sostenutoPedal;
    }

    /**
     * Define el valor de la propiedad sostenutoPedal.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSostenutoPedal(java.lang.String value) {
        this.sostenutoPedal = value;
    }

}

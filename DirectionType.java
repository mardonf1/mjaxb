//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.02 a las 03:52:44 PM EDT 
//


package mjaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Textual direction types may have more than 1 component due to multiple fonts. The dynamics element may also be used in the notations element. Attribute groups related to print suggestions apply to the individual direction-type, not to the overall direction.
 * 
 * <p>Clase Java para direction-type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="direction-type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="rehearsal" type="{}formatted-text" maxOccurs="unbounded"/>
 *         &lt;element name="segno" type="{}empty-print-style-align" maxOccurs="unbounded"/>
 *         &lt;element name="words" type="{}formatted-text" maxOccurs="unbounded"/>
 *         &lt;element name="coda" type="{}empty-print-style-align" maxOccurs="unbounded"/>
 *         &lt;element name="wedge" type="{}wedge"/>
 *         &lt;element name="dynamics" type="{}dynamics" maxOccurs="unbounded"/>
 *         &lt;element name="dashes" type="{}dashes"/>
 *         &lt;element name="bracket" type="{}bracket"/>
 *         &lt;element name="pedal" type="{}pedal"/>
 *         &lt;element name="metronome" type="{}metronome"/>
 *         &lt;element name="octave-shift" type="{}octave-shift"/>
 *         &lt;element name="harp-pedals" type="{}harp-pedals"/>
 *         &lt;element name="damp" type="{}empty-print-style-align"/>
 *         &lt;element name="damp-all" type="{}empty-print-style-align"/>
 *         &lt;element name="eyeglasses" type="{}empty-print-style-align"/>
 *         &lt;element name="string-mute" type="{}string-mute"/>
 *         &lt;element name="scordatura" type="{}scordatura"/>
 *         &lt;element name="image" type="{}image"/>
 *         &lt;element name="principal-voice" type="{}principal-voice"/>
 *         &lt;element name="accordion-registration" type="{}accordion-registration"/>
 *         &lt;element name="percussion" type="{}percussion" maxOccurs="unbounded"/>
 *         &lt;element name="other-direction" type="{}other-direction"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "direction-type", propOrder = {
    "rehearsal",
    "segno",
    "words",
    "coda",
    "wedge",
    "dynamics",
    "dashes",
    "bracket",
    "pedal",
    "metronome",
    "octaveShift",
    "harpPedals",
    "damp",
    "dampAll",
    "eyeglasses",
    "stringMute",
    "scordatura",
    "image",
    "principalVoice",
    "accordionRegistration",
    "percussion",
    "otherDirection"
})
public class DirectionType {

    protected List<FormattedText> rehearsal;
    protected List<EmptyPrintStyleAlign> segno;
    protected List<FormattedText> words;
    protected List<EmptyPrintStyleAlign> coda;
    protected Wedge wedge;
    protected List<Dynamics> dynamics;
    protected Dashes dashes;
    protected Bracket bracket;
    protected Pedal pedal;
    protected Metronome metronome;
    @XmlElement(name = "octave-shift")
    protected OctaveShift octaveShift;
    @XmlElement(name = "harp-pedals")
    protected HarpPedals harpPedals;
    protected EmptyPrintStyleAlign damp;
    @XmlElement(name = "damp-all")
    protected EmptyPrintStyleAlign dampAll;
    protected EmptyPrintStyleAlign eyeglasses;
    @XmlElement(name = "string-mute")
    protected StringMute stringMute;
    protected Scordatura scordatura;
    protected Image image;
    @XmlElement(name = "principal-voice")
    protected PrincipalVoice principalVoice;
    @XmlElement(name = "accordion-registration")
    protected AccordionRegistration accordionRegistration;
    protected List<Percussion> percussion;
    @XmlElement(name = "other-direction")
    protected OtherDirection otherDirection;

    /**
     * Gets the value of the rehearsal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rehearsal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRehearsal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormattedText }
     * 
     * 
     */
    public List<FormattedText> getRehearsal() {
        if (rehearsal == null) {
            rehearsal = new ArrayList<FormattedText>();
        }
        return this.rehearsal;
    }

    /**
     * Gets the value of the segno property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segno property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegno().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmptyPrintStyleAlign }
     * 
     * 
     */
    public List<EmptyPrintStyleAlign> getSegno() {
        if (segno == null) {
            segno = new ArrayList<EmptyPrintStyleAlign>();
        }
        return this.segno;
    }

    /**
     * Gets the value of the words property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the words property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormattedText }
     * 
     * 
     */
    public List<FormattedText> getWords() {
        if (words == null) {
            words = new ArrayList<FormattedText>();
        }
        return this.words;
    }

    /**
     * Gets the value of the coda property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coda property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoda().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmptyPrintStyleAlign }
     * 
     * 
     */
    public List<EmptyPrintStyleAlign> getCoda() {
        if (coda == null) {
            coda = new ArrayList<EmptyPrintStyleAlign>();
        }
        return this.coda;
    }

    /**
     * Obtiene el valor de la propiedad wedge.
     * 
     * @return
     *     possible object is
     *     {@link Wedge }
     *     
     */
    public Wedge getWedge() {
        return wedge;
    }

    /**
     * Define el valor de la propiedad wedge.
     * 
     * @param value
     *     allowed object is
     *     {@link Wedge }
     *     
     */
    public void setWedge(Wedge value) {
        this.wedge = value;
    }

    /**
     * Gets the value of the dynamics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dynamics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDynamics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dynamics }
     * 
     * 
     */
    public List<Dynamics> getDynamics() {
        if (dynamics == null) {
            dynamics = new ArrayList<Dynamics>();
        }
        return this.dynamics;
    }

    /**
     * Obtiene el valor de la propiedad dashes.
     * 
     * @return
     *     possible object is
     *     {@link Dashes }
     *     
     */
    public Dashes getDashes() {
        return dashes;
    }

    /**
     * Define el valor de la propiedad dashes.
     * 
     * @param value
     *     allowed object is
     *     {@link Dashes }
     *     
     */
    public void setDashes(Dashes value) {
        this.dashes = value;
    }

    /**
     * Obtiene el valor de la propiedad bracket.
     * 
     * @return
     *     possible object is
     *     {@link Bracket }
     *     
     */
    public Bracket getBracket() {
        return bracket;
    }

    /**
     * Define el valor de la propiedad bracket.
     * 
     * @param value
     *     allowed object is
     *     {@link Bracket }
     *     
     */
    public void setBracket(Bracket value) {
        this.bracket = value;
    }

    /**
     * Obtiene el valor de la propiedad pedal.
     * 
     * @return
     *     possible object is
     *     {@link Pedal }
     *     
     */
    public Pedal getPedal() {
        return pedal;
    }

    /**
     * Define el valor de la propiedad pedal.
     * 
     * @param value
     *     allowed object is
     *     {@link Pedal }
     *     
     */
    public void setPedal(Pedal value) {
        this.pedal = value;
    }

    /**
     * Obtiene el valor de la propiedad metronome.
     * 
     * @return
     *     possible object is
     *     {@link Metronome }
     *     
     */
    public Metronome getMetronome() {
        return metronome;
    }

    /**
     * Define el valor de la propiedad metronome.
     * 
     * @param value
     *     allowed object is
     *     {@link Metronome }
     *     
     */
    public void setMetronome(Metronome value) {
        this.metronome = value;
    }

    /**
     * Obtiene el valor de la propiedad octaveShift.
     * 
     * @return
     *     possible object is
     *     {@link OctaveShift }
     *     
     */
    public OctaveShift getOctaveShift() {
        return octaveShift;
    }

    /**
     * Define el valor de la propiedad octaveShift.
     * 
     * @param value
     *     allowed object is
     *     {@link OctaveShift }
     *     
     */
    public void setOctaveShift(OctaveShift value) {
        this.octaveShift = value;
    }

    /**
     * Obtiene el valor de la propiedad harpPedals.
     * 
     * @return
     *     possible object is
     *     {@link HarpPedals }
     *     
     */
    public HarpPedals getHarpPedals() {
        return harpPedals;
    }

    /**
     * Define el valor de la propiedad harpPedals.
     * 
     * @param value
     *     allowed object is
     *     {@link HarpPedals }
     *     
     */
    public void setHarpPedals(HarpPedals value) {
        this.harpPedals = value;
    }

    /**
     * Obtiene el valor de la propiedad damp.
     * 
     * @return
     *     possible object is
     *     {@link EmptyPrintStyleAlign }
     *     
     */
    public EmptyPrintStyleAlign getDamp() {
        return damp;
    }

    /**
     * Define el valor de la propiedad damp.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyPrintStyleAlign }
     *     
     */
    public void setDamp(EmptyPrintStyleAlign value) {
        this.damp = value;
    }

    /**
     * Obtiene el valor de la propiedad dampAll.
     * 
     * @return
     *     possible object is
     *     {@link EmptyPrintStyleAlign }
     *     
     */
    public EmptyPrintStyleAlign getDampAll() {
        return dampAll;
    }

    /**
     * Define el valor de la propiedad dampAll.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyPrintStyleAlign }
     *     
     */
    public void setDampAll(EmptyPrintStyleAlign value) {
        this.dampAll = value;
    }

    /**
     * Obtiene el valor de la propiedad eyeglasses.
     * 
     * @return
     *     possible object is
     *     {@link EmptyPrintStyleAlign }
     *     
     */
    public EmptyPrintStyleAlign getEyeglasses() {
        return eyeglasses;
    }

    /**
     * Define el valor de la propiedad eyeglasses.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyPrintStyleAlign }
     *     
     */
    public void setEyeglasses(EmptyPrintStyleAlign value) {
        this.eyeglasses = value;
    }

    /**
     * Obtiene el valor de la propiedad stringMute.
     * 
     * @return
     *     possible object is
     *     {@link StringMute }
     *     
     */
    public StringMute getStringMute() {
        return stringMute;
    }

    /**
     * Define el valor de la propiedad stringMute.
     * 
     * @param value
     *     allowed object is
     *     {@link StringMute }
     *     
     */
    public void setStringMute(StringMute value) {
        this.stringMute = value;
    }

    /**
     * Obtiene el valor de la propiedad scordatura.
     * 
     * @return
     *     possible object is
     *     {@link Scordatura }
     *     
     */
    public Scordatura getScordatura() {
        return scordatura;
    }

    /**
     * Define el valor de la propiedad scordatura.
     * 
     * @param value
     *     allowed object is
     *     {@link Scordatura }
     *     
     */
    public void setScordatura(Scordatura value) {
        this.scordatura = value;
    }

    /**
     * Obtiene el valor de la propiedad image.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getImage() {
        return image;
    }

    /**
     * Define el valor de la propiedad image.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setImage(Image value) {
        this.image = value;
    }

    /**
     * Obtiene el valor de la propiedad principalVoice.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalVoice }
     *     
     */
    public PrincipalVoice getPrincipalVoice() {
        return principalVoice;
    }

    /**
     * Define el valor de la propiedad principalVoice.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalVoice }
     *     
     */
    public void setPrincipalVoice(PrincipalVoice value) {
        this.principalVoice = value;
    }

    /**
     * Obtiene el valor de la propiedad accordionRegistration.
     * 
     * @return
     *     possible object is
     *     {@link AccordionRegistration }
     *     
     */
    public AccordionRegistration getAccordionRegistration() {
        return accordionRegistration;
    }

    /**
     * Define el valor de la propiedad accordionRegistration.
     * 
     * @param value
     *     allowed object is
     *     {@link AccordionRegistration }
     *     
     */
    public void setAccordionRegistration(AccordionRegistration value) {
        this.accordionRegistration = value;
    }

    /**
     * Gets the value of the percussion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the percussion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPercussion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Percussion }
     * 
     * 
     */
    public List<Percussion> getPercussion() {
        if (percussion == null) {
            percussion = new ArrayList<Percussion>();
        }
        return this.percussion;
    }

    /**
     * Obtiene el valor de la propiedad otherDirection.
     * 
     * @return
     *     possible object is
     *     {@link OtherDirection }
     *     
     */
    public OtherDirection getOtherDirection() {
        return otherDirection;
    }

    /**
     * Define el valor de la propiedad otherDirection.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherDirection }
     *     
     */
    public void setOtherDirection(OtherDirection value) {
        this.otherDirection = value;
    }

}

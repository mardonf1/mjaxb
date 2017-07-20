//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.02 a las 03:52:44 PM EDT 
//


package mjaxb;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Notes are the most common type of MusicXML data. The MusicXML format keeps the MuseData distinction between elements used for sound information and elements used for notation information (e.g., tie is used for sound, tied for notation). Thus grace notes do not have a duration element. Cue notes have a duration element, as do forward elements, but no tie elements. Having these two types of information available can make interchange considerably easier, as some programs handle one type of information much more readily than the other. 
 * 	
 * The dynamics and end-dynamics attributes correspond to MIDI 1.0's Note On and Note Off velocities, respectively. They are expressed in terms of percentages of the default forte value (90 for MIDI 1.0). The attack and release attributes are used to alter the starting and stopping time of the note from when it would otherwise occur based on the flow of durations - information that is specific to a performance. They are expressed in terms of divisions, either positive or negative. A note that starts a tie should not have a release attribute, and a note that stops a tie should not have an attack attribute. If a note is played only particular times through a repeat, the time-only attribute shows which times to play the note. The pizzicato attribute is used when just this note is sounded pizzicato, vs. the pizzicato element which changes overall playback between pizzicato and arco.
 * 
 * <p>Clase Java para note complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="note">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="grace" type="{}grace"/>
 *             &lt;group ref="{}full-note"/>
 *             &lt;element name="tie" type="{}tie" maxOccurs="2" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="cue" type="{}empty"/>
 *             &lt;group ref="{}full-note"/>
 *             &lt;group ref="{}duration"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;group ref="{}full-note"/>
 *             &lt;group ref="{}duration"/>
 *             &lt;element name="tie" type="{}tie" maxOccurs="2" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="instrument" type="{}instrument" minOccurs="0"/>
 *         &lt;group ref="{}editorial-voice"/>
 *         &lt;element name="type" type="{}note-type" minOccurs="0"/>
 *         &lt;element name="dot" type="{}empty-placement" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accidental" type="{}accidental" minOccurs="0"/>
 *         &lt;element name="time-modification" type="{}time-modification" minOccurs="0"/>
 *         &lt;element name="stem" type="{}stem" minOccurs="0"/>
 *         &lt;element name="notehead" type="{}notehead" minOccurs="0"/>
 *         &lt;element name="notehead-text" type="{}notehead-text" minOccurs="0"/>
 *         &lt;group ref="{}staff" minOccurs="0"/>
 *         &lt;element name="beam" type="{}beam" maxOccurs="8" minOccurs="0"/>
 *         &lt;element name="notations" type="{}notations" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lyric" type="{}lyric" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="play" type="{}play" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}x-position"/>
 *       &lt;attGroup ref="{}font"/>
 *       &lt;attGroup ref="{}printout"/>
 *       &lt;attGroup ref="{}color"/>
 *       &lt;attribute name="dynamics" type="{}non-negative-decimal" />
 *       &lt;attribute name="end-dynamics" type="{}non-negative-decimal" />
 *       &lt;attribute name="attack" type="{}divisions" />
 *       &lt;attribute name="release" type="{}divisions" />
 *       &lt;attribute name="time-only" type="{}time-only" />
 *       &lt;attribute name="pizzicato" type="{}yes-no" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "note", propOrder = {
    "content"
})
public class Note {

    @XmlElementRefs({
        @XmlElementRef(name = "play", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cue", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "footnote", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "level", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "time-modification", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tie", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dot", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rest", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "duration", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "type", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "staff", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lyric", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "chord", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "voice", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "notehead-text", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "unpitched", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "grace", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "instrument", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "beam", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "notations", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "notehead", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pitch", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "accidental", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "stem", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;
    @XmlAttribute(name = "dynamics")
    protected BigDecimal dynamics;
    @XmlAttribute(name = "end-dynamics")
    protected BigDecimal endDynamics;
    @XmlAttribute(name = "attack")
    protected BigDecimal attack;
    @XmlAttribute(name = "release")
    protected BigDecimal release;
    @XmlAttribute(name = "time-only")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String timeOnly;
    @XmlAttribute(name = "pizzicato")
    protected YesNo pizzicato;
    @XmlAttribute(name = "default-x")
    protected BigDecimal defaultX;
    @XmlAttribute(name = "default-y")
    protected BigDecimal defaultY;
    @XmlAttribute(name = "relative-x")
    protected BigDecimal relativeX;
    @XmlAttribute(name = "relative-y")
    protected BigDecimal relativeY;
    @XmlAttribute(name = "font-family")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String fontFamily;
    @XmlAttribute(name = "font-style")
    protected FontStyle fontStyle;
    @XmlAttribute(name = "font-size")
    protected java.lang.String fontSize;
    @XmlAttribute(name = "font-weight")
    protected FontWeight fontWeight;
    @XmlAttribute(name = "print-dot")
    protected YesNo printDot;
    @XmlAttribute(name = "print-lyric")
    protected YesNo printLyric;
    @XmlAttribute(name = "print-object")
    protected YesNo printObject;
    @XmlAttribute(name = "print-spacing")
    protected YesNo printSpacing;
    @XmlAttribute(name = "color")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String color;

    /**
     * Obtiene el resto del modelo de contenido. 
     * 
     * <p>
     * Ha obtenido esta propiedad que permite capturar todo por el siguiente motivo: 
     * El nombre de campo "Chord" se está utilizando en dos partes diferentes de un esquema. Consulte: 
     * línea 5290 de file:/Users/ThePulsarPlanet/Documents/musicxml30/musicxml.xsd
     * línea 5290 de file:/Users/ThePulsarPlanet/Documents/musicxml30/musicxml.xsd
     * <p>
     * Para deshacerse de esta propiedad, aplique una personalización de propiedad a una
     * de las dos declaraciones siguientes para cambiarles de nombre: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Play }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link FormattedText }{@code >}
     * {@link JAXBElement }{@code <}{@link Level }{@code >}
     * {@link JAXBElement }{@code <}{@link TimeModification }{@code >}
     * {@link JAXBElement }{@code <}{@link Tie }{@code >}
     * {@link JAXBElement }{@code <}{@link EmptyPlacement }{@code >}
     * {@link JAXBElement }{@code <}{@link Rest }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link NoteType }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link Lyric }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     * {@link JAXBElement }{@code <}{@link NoteheadText }{@code >}
     * {@link JAXBElement }{@code <}{@link Unpitched }{@code >}
     * {@link JAXBElement }{@code <}{@link Grace }{@code >}
     * {@link JAXBElement }{@code <}{@link Instrument }{@code >}
     * {@link JAXBElement }{@code <}{@link Beam }{@code >}
     * {@link JAXBElement }{@code <}{@link Notations }{@code >}
     * {@link JAXBElement }{@code <}{@link Notehead }{@code >}
     * {@link JAXBElement }{@code <}{@link Pitch }{@code >}
     * {@link JAXBElement }{@code <}{@link Accidental }{@code >}
     * {@link JAXBElement }{@code <}{@link Stem }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
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
     * Obtiene el valor de la propiedad endDynamics.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndDynamics() {
        return endDynamics;
    }

    /**
     * Define el valor de la propiedad endDynamics.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndDynamics(BigDecimal value) {
        this.endDynamics = value;
    }

    /**
     * Obtiene el valor de la propiedad attack.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAttack() {
        return attack;
    }

    /**
     * Define el valor de la propiedad attack.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAttack(BigDecimal value) {
        this.attack = value;
    }

    /**
     * Obtiene el valor de la propiedad release.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRelease() {
        return release;
    }

    /**
     * Define el valor de la propiedad release.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRelease(BigDecimal value) {
        this.release = value;
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
     * Obtiene el valor de la propiedad defaultX.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultX() {
        return defaultX;
    }

    /**
     * Define el valor de la propiedad defaultX.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultX(BigDecimal value) {
        this.defaultX = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultY.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultY() {
        return defaultY;
    }

    /**
     * Define el valor de la propiedad defaultY.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultY(BigDecimal value) {
        this.defaultY = value;
    }

    /**
     * Obtiene el valor de la propiedad relativeX.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRelativeX() {
        return relativeX;
    }

    /**
     * Define el valor de la propiedad relativeX.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRelativeX(BigDecimal value) {
        this.relativeX = value;
    }

    /**
     * Obtiene el valor de la propiedad relativeY.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRelativeY() {
        return relativeY;
    }

    /**
     * Define el valor de la propiedad relativeY.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRelativeY(BigDecimal value) {
        this.relativeY = value;
    }

    /**
     * Obtiene el valor de la propiedad fontFamily.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFontFamily() {
        return fontFamily;
    }

    /**
     * Define el valor de la propiedad fontFamily.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFontFamily(java.lang.String value) {
        this.fontFamily = value;
    }

    /**
     * Obtiene el valor de la propiedad fontStyle.
     * 
     * @return
     *     possible object is
     *     {@link FontStyle }
     *     
     */
    public FontStyle getFontStyle() {
        return fontStyle;
    }

    /**
     * Define el valor de la propiedad fontStyle.
     * 
     * @param value
     *     allowed object is
     *     {@link FontStyle }
     *     
     */
    public void setFontStyle(FontStyle value) {
        this.fontStyle = value;
    }

    /**
     * Obtiene el valor de la propiedad fontSize.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getFontSize() {
        return fontSize;
    }

    /**
     * Define el valor de la propiedad fontSize.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setFontSize(java.lang.String value) {
        this.fontSize = value;
    }

    /**
     * Obtiene el valor de la propiedad fontWeight.
     * 
     * @return
     *     possible object is
     *     {@link FontWeight }
     *     
     */
    public FontWeight getFontWeight() {
        return fontWeight;
    }

    /**
     * Define el valor de la propiedad fontWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link FontWeight }
     *     
     */
    public void setFontWeight(FontWeight value) {
        this.fontWeight = value;
    }

    /**
     * Obtiene el valor de la propiedad printDot.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getPrintDot() {
        return printDot;
    }

    /**
     * Define el valor de la propiedad printDot.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setPrintDot(YesNo value) {
        this.printDot = value;
    }

    /**
     * Obtiene el valor de la propiedad printLyric.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getPrintLyric() {
        return printLyric;
    }

    /**
     * Define el valor de la propiedad printLyric.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setPrintLyric(YesNo value) {
        this.printLyric = value;
    }

    /**
     * Obtiene el valor de la propiedad printObject.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getPrintObject() {
        return printObject;
    }

    /**
     * Define el valor de la propiedad printObject.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setPrintObject(YesNo value) {
        this.printObject = value;
    }

    /**
     * Obtiene el valor de la propiedad printSpacing.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getPrintSpacing() {
        return printSpacing;
    }

    /**
     * Define el valor de la propiedad printSpacing.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setPrintSpacing(YesNo value) {
        this.printSpacing = value;
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

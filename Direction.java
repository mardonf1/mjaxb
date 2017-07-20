//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.02 a las 03:52:44 PM EDT 
//


package mjaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A direction is a musical indication that is not attached to a specific note. Two or more may be combined to indicate starts and stops of wedges, dashes, etc.
 * 	
 * By default, a series of direction-type elements and a series of child elements of a direction-type within a single direction element follow one another in sequence visually. For a series of direction-type children, non-positional formatting attributes are carried over from the previous element by default.
 * 
 * <p>Clase Java para direction complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="direction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="direction-type" type="{}direction-type" maxOccurs="unbounded"/>
 *         &lt;element name="offset" type="{}offset" minOccurs="0"/>
 *         &lt;group ref="{}editorial-voice-direction"/>
 *         &lt;group ref="{}staff" minOccurs="0"/>
 *         &lt;element name="sound" type="{}sound" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}placement"/>
 *       &lt;attGroup ref="{}directive"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "direction", propOrder = {
    "directionType",
    "offset",
    "footnote",
    "level",
    "voice",
    "staff",
    "sound"
})
public class Direction {

    @XmlElement(name = "direction-type", required = true)
    protected List<DirectionType> directionType;
    protected Offset offset;
    protected FormattedText footnote;
    protected Level level;
    protected java.lang.String voice;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger staff;
    protected Sound sound;
    @XmlAttribute(name = "placement")
    protected AboveBelow placement;
    @XmlAttribute(name = "directive")
    protected YesNo directive;

    /**
     * Gets the value of the directionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectionType }
     * 
     * 
     */
    public List<DirectionType> getDirectionType() {
        if (directionType == null) {
            directionType = new ArrayList<DirectionType>();
        }
        return this.directionType;
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
     * Obtiene el valor de la propiedad footnote.
     * 
     * @return
     *     possible object is
     *     {@link FormattedText }
     *     
     */
    public FormattedText getFootnote() {
        return footnote;
    }

    /**
     * Define el valor de la propiedad footnote.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedText }
     *     
     */
    public void setFootnote(FormattedText value) {
        this.footnote = value;
    }

    /**
     * Obtiene el valor de la propiedad level.
     * 
     * @return
     *     possible object is
     *     {@link Level }
     *     
     */
    public Level getLevel() {
        return level;
    }

    /**
     * Define el valor de la propiedad level.
     * 
     * @param value
     *     allowed object is
     *     {@link Level }
     *     
     */
    public void setLevel(Level value) {
        this.level = value;
    }

    /**
     * Obtiene el valor de la propiedad voice.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getVoice() {
        return voice;
    }

    /**
     * Define el valor de la propiedad voice.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setVoice(java.lang.String value) {
        this.voice = value;
    }

    /**
     * Obtiene el valor de la propiedad staff.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStaff() {
        return staff;
    }

    /**
     * Define el valor de la propiedad staff.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStaff(BigInteger value) {
        this.staff = value;
    }

    /**
     * Obtiene el valor de la propiedad sound.
     * 
     * @return
     *     possible object is
     *     {@link Sound }
     *     
     */
    public Sound getSound() {
        return sound;
    }

    /**
     * Define el valor de la propiedad sound.
     * 
     * @param value
     *     allowed object is
     *     {@link Sound }
     *     
     */
    public void setSound(Sound value) {
        this.sound = value;
    }

    /**
     * Obtiene el valor de la propiedad placement.
     * 
     * @return
     *     possible object is
     *     {@link AboveBelow }
     *     
     */
    public AboveBelow getPlacement() {
        return placement;
    }

    /**
     * Define el valor de la propiedad placement.
     * 
     * @param value
     *     allowed object is
     *     {@link AboveBelow }
     *     
     */
    public void setPlacement(AboveBelow value) {
        this.placement = value;
    }

    /**
     * Obtiene el valor de la propiedad directive.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getDirective() {
        return directive;
    }

    /**
     * Define el valor de la propiedad directive.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setDirective(YesNo value) {
        this.directive = value;
    }

}

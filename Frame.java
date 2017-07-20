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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The frame type represents a frame or fretboard diagram used together with a chord symbol. The representation is based on the NIFF guitar grid with additional information. The frame type's unplayed attribute indicates what to display above a string that has no associated frame-note element. Typical values are x and the empty string. If the attribute is not present, the display of the unplayed string is application-defined.
 * 
 * <p>Clase Java para frame complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="frame">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frame-strings" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="frame-frets" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="first-fret" type="{}first-fret" minOccurs="0"/>
 *         &lt;element name="frame-note" type="{}frame-note" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}valign-image"/>
 *       &lt;attGroup ref="{}position"/>
 *       &lt;attGroup ref="{}halign"/>
 *       &lt;attGroup ref="{}color"/>
 *       &lt;attribute name="height" type="{}tenths" />
 *       &lt;attribute name="width" type="{}tenths" />
 *       &lt;attribute name="unplayed" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "frame", propOrder = {
    "frameStrings",
    "frameFrets",
    "firstFret",
    "frameNote"
})
public class Frame {

    @XmlElement(name = "frame-strings", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger frameStrings;
    @XmlElement(name = "frame-frets", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger frameFrets;
    @XmlElement(name = "first-fret")
    protected FirstFret firstFret;
    @XmlElement(name = "frame-note", required = true)
    protected List<FrameNote> frameNote;
    @XmlAttribute(name = "height")
    protected BigDecimal height;
    @XmlAttribute(name = "width")
    protected BigDecimal width;
    @XmlAttribute(name = "unplayed")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected java.lang.String unplayed;
    @XmlAttribute(name = "valign")
    protected ValignImage valign;
    @XmlAttribute(name = "default-x")
    protected BigDecimal defaultX;
    @XmlAttribute(name = "default-y")
    protected BigDecimal defaultY;
    @XmlAttribute(name = "relative-x")
    protected BigDecimal relativeX;
    @XmlAttribute(name = "relative-y")
    protected BigDecimal relativeY;
    @XmlAttribute(name = "halign")
    protected LeftCenterRight halign;
    @XmlAttribute(name = "color")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String color;

    /**
     * Obtiene el valor de la propiedad frameStrings.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFrameStrings() {
        return frameStrings;
    }

    /**
     * Define el valor de la propiedad frameStrings.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFrameStrings(BigInteger value) {
        this.frameStrings = value;
    }

    /**
     * Obtiene el valor de la propiedad frameFrets.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFrameFrets() {
        return frameFrets;
    }

    /**
     * Define el valor de la propiedad frameFrets.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFrameFrets(BigInteger value) {
        this.frameFrets = value;
    }

    /**
     * Obtiene el valor de la propiedad firstFret.
     * 
     * @return
     *     possible object is
     *     {@link FirstFret }
     *     
     */
    public FirstFret getFirstFret() {
        return firstFret;
    }

    /**
     * Define el valor de la propiedad firstFret.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstFret }
     *     
     */
    public void setFirstFret(FirstFret value) {
        this.firstFret = value;
    }

    /**
     * Gets the value of the frameNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frameNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrameNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrameNote }
     * 
     * 
     */
    public List<FrameNote> getFrameNote() {
        if (frameNote == null) {
            frameNote = new ArrayList<FrameNote>();
        }
        return this.frameNote;
    }

    /**
     * Obtiene el valor de la propiedad height.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * Define el valor de la propiedad height.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeight(BigDecimal value) {
        this.height = value;
    }

    /**
     * Obtiene el valor de la propiedad width.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * Define el valor de la propiedad width.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWidth(BigDecimal value) {
        this.width = value;
    }

    /**
     * Obtiene el valor de la propiedad unplayed.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getUnplayed() {
        return unplayed;
    }

    /**
     * Define el valor de la propiedad unplayed.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setUnplayed(java.lang.String value) {
        this.unplayed = value;
    }

    /**
     * Obtiene el valor de la propiedad valign.
     * 
     * @return
     *     possible object is
     *     {@link ValignImage }
     *     
     */
    public ValignImage getValign() {
        return valign;
    }

    /**
     * Define el valor de la propiedad valign.
     * 
     * @param value
     *     allowed object is
     *     {@link ValignImage }
     *     
     */
    public void setValign(ValignImage value) {
        this.valign = value;
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
     * Obtiene el valor de la propiedad halign.
     * 
     * @return
     *     possible object is
     *     {@link LeftCenterRight }
     *     
     */
    public LeftCenterRight getHalign() {
        return halign;
    }

    /**
     * Define el valor de la propiedad halign.
     * 
     * @param value
     *     allowed object is
     *     {@link LeftCenterRight }
     *     
     */
    public void setHalign(LeftCenterRight value) {
        this.halign = value;
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

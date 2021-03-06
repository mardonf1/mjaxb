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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The bend type is used in guitar and tablature. The bend-alter element indicates the number of steps in the bend, similar to the alter element. As with the alter element, numbers like 0.5 can be used to indicate microtones. Negative numbers indicate pre-bends or releases; the pre-bend and release elements are used to distinguish what is intended. A with-bar element indicates that the bend is to be done at the bridge with a whammy or vibrato bar. The content of the element indicates how this should be notated.
 * 
 * <p>Clase Java para bend complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bend">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bend-alter" type="{}semitones"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="pre-bend" type="{}empty"/>
 *           &lt;element name="release" type="{}empty"/>
 *         &lt;/choice>
 *         &lt;element name="with-bar" type="{}placement-text" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}bend-sound"/>
 *       &lt;attGroup ref="{}print-style"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bend", propOrder = {
    "bendAlter",
    "preBend",
    "release",
    "withBar"
})
public class Bend {

    @XmlElement(name = "bend-alter", required = true)
    protected BigDecimal bendAlter;
    @XmlElement(name = "pre-bend")
    protected Empty preBend;
    protected Empty release;
    @XmlElement(name = "with-bar")
    protected PlacementText withBar;
    @XmlAttribute(name = "accelerate")
    protected YesNo accelerate;
    @XmlAttribute(name = "beats")
    protected BigDecimal beats;
    @XmlAttribute(name = "first-beat")
    protected BigDecimal firstBeat;
    @XmlAttribute(name = "last-beat")
    protected BigDecimal lastBeat;
    @XmlAttribute(name = "font-family")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String fontFamily;
    @XmlAttribute(name = "font-style")
    protected FontStyle fontStyle;
    @XmlAttribute(name = "font-size")
    protected java.lang.String fontSize;
    @XmlAttribute(name = "font-weight")
    protected FontWeight fontWeight;
    @XmlAttribute(name = "default-x")
    protected BigDecimal defaultX;
    @XmlAttribute(name = "default-y")
    protected BigDecimal defaultY;
    @XmlAttribute(name = "relative-x")
    protected BigDecimal relativeX;
    @XmlAttribute(name = "relative-y")
    protected BigDecimal relativeY;
    @XmlAttribute(name = "color")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String color;

    /**
     * Obtiene el valor de la propiedad bendAlter.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBendAlter() {
        return bendAlter;
    }

    /**
     * Define el valor de la propiedad bendAlter.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBendAlter(BigDecimal value) {
        this.bendAlter = value;
    }

    /**
     * Obtiene el valor de la propiedad preBend.
     * 
     * @return
     *     possible object is
     *     {@link Empty }
     *     
     */
    public Empty getPreBend() {
        return preBend;
    }

    /**
     * Define el valor de la propiedad preBend.
     * 
     * @param value
     *     allowed object is
     *     {@link Empty }
     *     
     */
    public void setPreBend(Empty value) {
        this.preBend = value;
    }

    /**
     * Obtiene el valor de la propiedad release.
     * 
     * @return
     *     possible object is
     *     {@link Empty }
     *     
     */
    public Empty getRelease() {
        return release;
    }

    /**
     * Define el valor de la propiedad release.
     * 
     * @param value
     *     allowed object is
     *     {@link Empty }
     *     
     */
    public void setRelease(Empty value) {
        this.release = value;
    }

    /**
     * Obtiene el valor de la propiedad withBar.
     * 
     * @return
     *     possible object is
     *     {@link PlacementText }
     *     
     */
    public PlacementText getWithBar() {
        return withBar;
    }

    /**
     * Define el valor de la propiedad withBar.
     * 
     * @param value
     *     allowed object is
     *     {@link PlacementText }
     *     
     */
    public void setWithBar(PlacementText value) {
        this.withBar = value;
    }

    /**
     * Obtiene el valor de la propiedad accelerate.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getAccelerate() {
        return accelerate;
    }

    /**
     * Define el valor de la propiedad accelerate.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setAccelerate(YesNo value) {
        this.accelerate = value;
    }

    /**
     * Obtiene el valor de la propiedad beats.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBeats() {
        return beats;
    }

    /**
     * Define el valor de la propiedad beats.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBeats(BigDecimal value) {
        this.beats = value;
    }

    /**
     * Obtiene el valor de la propiedad firstBeat.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstBeat() {
        return firstBeat;
    }

    /**
     * Define el valor de la propiedad firstBeat.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstBeat(BigDecimal value) {
        this.firstBeat = value;
    }

    /**
     * Obtiene el valor de la propiedad lastBeat.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastBeat() {
        return lastBeat;
    }

    /**
     * Define el valor de la propiedad lastBeat.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastBeat(BigDecimal value) {
        this.lastBeat = value;
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

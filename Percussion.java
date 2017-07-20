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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The percussion element is used to define percussion pictogram symbols. Definitions for these symbols can be found in Kurt Stone's "Music Notation in the Twentieth Century" on pages 206-212 and 223. Some values are added to these based on how usage has evolved in the 30 years since Stone's book was published.
 * 
 * <p>Clase Java para percussion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="percussion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="glass" type="{}glass"/>
 *         &lt;element name="metal" type="{}metal"/>
 *         &lt;element name="wood" type="{}wood"/>
 *         &lt;element name="pitched" type="{}pitched"/>
 *         &lt;element name="membrane" type="{}membrane"/>
 *         &lt;element name="effect" type="{}effect"/>
 *         &lt;element name="timpani" type="{}empty"/>
 *         &lt;element name="beater" type="{}beater"/>
 *         &lt;element name="stick" type="{}stick"/>
 *         &lt;element name="stick-location" type="{}stick-location"/>
 *         &lt;element name="other-percussion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{}print-style-align"/>
 *       &lt;attGroup ref="{}enclosure"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "percussion", propOrder = {
    "glass",
    "metal",
    "wood",
    "pitched",
    "membrane",
    "effect",
    "timpani",
    "beater",
    "stick",
    "stickLocation",
    "otherPercussion"
})
public class Percussion {

    @XmlSchemaType(name = "string")
    protected Glass glass;
    @XmlSchemaType(name = "string")
    protected Metal metal;
    @XmlSchemaType(name = "string")
    protected Wood wood;
    @XmlSchemaType(name = "string")
    protected Pitched pitched;
    @XmlSchemaType(name = "string")
    protected Membrane membrane;
    @XmlSchemaType(name = "string")
    protected Effect effect;
    protected Empty timpani;
    protected Beater beater;
    protected Stick stick;
    @XmlElement(name = "stick-location")
    @XmlSchemaType(name = "string")
    protected StickLocation stickLocation;
    @XmlElement(name = "other-percussion")
    protected java.lang.String otherPercussion;
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
    @XmlAttribute(name = "halign")
    protected LeftCenterRight halign;
    @XmlAttribute(name = "valign")
    protected Valign valign;
    @XmlAttribute(name = "enclosure")
    protected EnclosureShape enclosure;

    /**
     * Obtiene el valor de la propiedad glass.
     * 
     * @return
     *     possible object is
     *     {@link Glass }
     *     
     */
    public Glass getGlass() {
        return glass;
    }

    /**
     * Define el valor de la propiedad glass.
     * 
     * @param value
     *     allowed object is
     *     {@link Glass }
     *     
     */
    public void setGlass(Glass value) {
        this.glass = value;
    }

    /**
     * Obtiene el valor de la propiedad metal.
     * 
     * @return
     *     possible object is
     *     {@link Metal }
     *     
     */
    public Metal getMetal() {
        return metal;
    }

    /**
     * Define el valor de la propiedad metal.
     * 
     * @param value
     *     allowed object is
     *     {@link Metal }
     *     
     */
    public void setMetal(Metal value) {
        this.metal = value;
    }

    /**
     * Obtiene el valor de la propiedad wood.
     * 
     * @return
     *     possible object is
     *     {@link Wood }
     *     
     */
    public Wood getWood() {
        return wood;
    }

    /**
     * Define el valor de la propiedad wood.
     * 
     * @param value
     *     allowed object is
     *     {@link Wood }
     *     
     */
    public void setWood(Wood value) {
        this.wood = value;
    }

    /**
     * Obtiene el valor de la propiedad pitched.
     * 
     * @return
     *     possible object is
     *     {@link Pitched }
     *     
     */
    public Pitched getPitched() {
        return pitched;
    }

    /**
     * Define el valor de la propiedad pitched.
     * 
     * @param value
     *     allowed object is
     *     {@link Pitched }
     *     
     */
    public void setPitched(Pitched value) {
        this.pitched = value;
    }

    /**
     * Obtiene el valor de la propiedad membrane.
     * 
     * @return
     *     possible object is
     *     {@link Membrane }
     *     
     */
    public Membrane getMembrane() {
        return membrane;
    }

    /**
     * Define el valor de la propiedad membrane.
     * 
     * @param value
     *     allowed object is
     *     {@link Membrane }
     *     
     */
    public void setMembrane(Membrane value) {
        this.membrane = value;
    }

    /**
     * Obtiene el valor de la propiedad effect.
     * 
     * @return
     *     possible object is
     *     {@link Effect }
     *     
     */
    public Effect getEffect() {
        return effect;
    }

    /**
     * Define el valor de la propiedad effect.
     * 
     * @param value
     *     allowed object is
     *     {@link Effect }
     *     
     */
    public void setEffect(Effect value) {
        this.effect = value;
    }

    /**
     * Obtiene el valor de la propiedad timpani.
     * 
     * @return
     *     possible object is
     *     {@link Empty }
     *     
     */
    public Empty getTimpani() {
        return timpani;
    }

    /**
     * Define el valor de la propiedad timpani.
     * 
     * @param value
     *     allowed object is
     *     {@link Empty }
     *     
     */
    public void setTimpani(Empty value) {
        this.timpani = value;
    }

    /**
     * Obtiene el valor de la propiedad beater.
     * 
     * @return
     *     possible object is
     *     {@link Beater }
     *     
     */
    public Beater getBeater() {
        return beater;
    }

    /**
     * Define el valor de la propiedad beater.
     * 
     * @param value
     *     allowed object is
     *     {@link Beater }
     *     
     */
    public void setBeater(Beater value) {
        this.beater = value;
    }

    /**
     * Obtiene el valor de la propiedad stick.
     * 
     * @return
     *     possible object is
     *     {@link Stick }
     *     
     */
    public Stick getStick() {
        return stick;
    }

    /**
     * Define el valor de la propiedad stick.
     * 
     * @param value
     *     allowed object is
     *     {@link Stick }
     *     
     */
    public void setStick(Stick value) {
        this.stick = value;
    }

    /**
     * Obtiene el valor de la propiedad stickLocation.
     * 
     * @return
     *     possible object is
     *     {@link StickLocation }
     *     
     */
    public StickLocation getStickLocation() {
        return stickLocation;
    }

    /**
     * Define el valor de la propiedad stickLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link StickLocation }
     *     
     */
    public void setStickLocation(StickLocation value) {
        this.stickLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad otherPercussion.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getOtherPercussion() {
        return otherPercussion;
    }

    /**
     * Define el valor de la propiedad otherPercussion.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setOtherPercussion(java.lang.String value) {
        this.otherPercussion = value;
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
     * Obtiene el valor de la propiedad valign.
     * 
     * @return
     *     possible object is
     *     {@link Valign }
     *     
     */
    public Valign getValign() {
        return valign;
    }

    /**
     * Define el valor de la propiedad valign.
     * 
     * @param value
     *     allowed object is
     *     {@link Valign }
     *     
     */
    public void setValign(Valign value) {
        this.valign = value;
    }

    /**
     * Obtiene el valor de la propiedad enclosure.
     * 
     * @return
     *     possible object is
     *     {@link EnclosureShape }
     *     
     */
    public EnclosureShape getEnclosure() {
        return enclosure;
    }

    /**
     * Define el valor de la propiedad enclosure.
     * 
     * @param value
     *     allowed object is
     *     {@link EnclosureShape }
     *     
     */
    public void setEnclosure(EnclosureShape value) {
        this.enclosure = value;
    }

}

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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The formatted-text type represents a text element with text-formatting attributes.
 * 
 * <p>Clase Java para formatted-text complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="formatted-text">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attGroup ref="{}text-formatting"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formatted-text", propOrder = {
    "value"
})
public class FormattedText {

    @XmlValue
    protected java.lang.String value;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected java.lang.String lang;
    @XmlAttribute(name = "space", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String space;
    @XmlAttribute(name = "justify")
    protected LeftCenterRight justify;
    @XmlAttribute(name = "line-height")
    protected java.lang.String lineHeight;
    @XmlAttribute(name = "rotation")
    protected BigDecimal rotation;
    @XmlAttribute(name = "dir")
    protected TextDirection dir;
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
    @XmlAttribute(name = "letter-spacing")
    protected java.lang.String letterSpacing;
    @XmlAttribute(name = "underline")
    protected Integer underline;
    @XmlAttribute(name = "overline")
    protected Integer overline;
    @XmlAttribute(name = "line-through")
    protected Integer lineThrough;
    @XmlAttribute(name = "enclosure")
    protected EnclosureShape enclosure;

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad lang.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLang() {
        return lang;
    }

    /**
     * Define el valor de la propiedad lang.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLang(java.lang.String value) {
        this.lang = value;
    }

    /**
     * Obtiene el valor de la propiedad space.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSpace() {
        return space;
    }

    /**
     * Define el valor de la propiedad space.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSpace(java.lang.String value) {
        this.space = value;
    }

    /**
     * Obtiene el valor de la propiedad justify.
     * 
     * @return
     *     possible object is
     *     {@link LeftCenterRight }
     *     
     */
    public LeftCenterRight getJustify() {
        return justify;
    }

    /**
     * Define el valor de la propiedad justify.
     * 
     * @param value
     *     allowed object is
     *     {@link LeftCenterRight }
     *     
     */
    public void setJustify(LeftCenterRight value) {
        this.justify = value;
    }

    /**
     * Obtiene el valor de la propiedad lineHeight.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLineHeight() {
        return lineHeight;
    }

    /**
     * Define el valor de la propiedad lineHeight.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLineHeight(java.lang.String value) {
        this.lineHeight = value;
    }

    /**
     * Obtiene el valor de la propiedad rotation.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRotation() {
        return rotation;
    }

    /**
     * Define el valor de la propiedad rotation.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRotation(BigDecimal value) {
        this.rotation = value;
    }

    /**
     * Obtiene el valor de la propiedad dir.
     * 
     * @return
     *     possible object is
     *     {@link TextDirection }
     *     
     */
    public TextDirection getDir() {
        return dir;
    }

    /**
     * Define el valor de la propiedad dir.
     * 
     * @param value
     *     allowed object is
     *     {@link TextDirection }
     *     
     */
    public void setDir(TextDirection value) {
        this.dir = value;
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
     * Obtiene el valor de la propiedad letterSpacing.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLetterSpacing() {
        return letterSpacing;
    }

    /**
     * Define el valor de la propiedad letterSpacing.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLetterSpacing(java.lang.String value) {
        this.letterSpacing = value;
    }

    /**
     * Obtiene el valor de la propiedad underline.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnderline() {
        return underline;
    }

    /**
     * Define el valor de la propiedad underline.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnderline(Integer value) {
        this.underline = value;
    }

    /**
     * Obtiene el valor de la propiedad overline.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOverline() {
        return overline;
    }

    /**
     * Define el valor de la propiedad overline.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOverline(Integer value) {
        this.overline = value;
    }

    /**
     * Obtiene el valor de la propiedad lineThrough.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineThrough() {
        return lineThrough;
    }

    /**
     * Define el valor de la propiedad lineThrough.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineThrough(Integer value) {
        this.lineThrough = value;
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

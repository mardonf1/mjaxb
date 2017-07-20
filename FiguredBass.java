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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The figured-bass element represents figured bass notation. Figured bass elements take their position from the first regular note (not a grace note or chord note) that follows in score order. The optional duration element is used to indicate changes of figures under a note.
 * 	
 * Figures are ordered from top to bottom. The value of parentheses is "no" if not present.
 * 
 * <p>Clase Java para figured-bass complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="figured-bass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="figure" type="{}figure" maxOccurs="unbounded"/>
 *         &lt;group ref="{}duration" minOccurs="0"/>
 *         &lt;group ref="{}editorial"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}printout"/>
 *       &lt;attGroup ref="{}print-style"/>
 *       &lt;attribute name="parentheses" type="{}yes-no" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "figured-bass", propOrder = {
    "figure",
    "duration",
    "footnote",
    "level"
})
public class FiguredBass {

    @XmlElement(required = true)
    protected List<Figure> figure;
    protected BigDecimal duration;
    protected FormattedText footnote;
    protected Level level;
    @XmlAttribute(name = "parentheses")
    protected YesNo parentheses;
    @XmlAttribute(name = "print-dot")
    protected YesNo printDot;
    @XmlAttribute(name = "print-lyric")
    protected YesNo printLyric;
    @XmlAttribute(name = "print-object")
    protected YesNo printObject;
    @XmlAttribute(name = "print-spacing")
    protected YesNo printSpacing;
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
     * Gets the value of the figure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the figure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFigure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Figure }
     * 
     * 
     */
    public List<Figure> getFigure() {
        if (figure == null) {
            figure = new ArrayList<Figure>();
        }
        return this.figure;
    }

    /**
     * Obtiene el valor de la propiedad duration.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDuration() {
        return duration;
    }

    /**
     * Define el valor de la propiedad duration.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDuration(BigDecimal value) {
        this.duration = value;
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
     * Obtiene el valor de la propiedad parentheses.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getParentheses() {
        return parentheses;
    }

    /**
     * Define el valor de la propiedad parentheses.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setParentheses(YesNo value) {
        this.parentheses = value;
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

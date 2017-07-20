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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Kind indicates the type of chord. Degree elements can then add, subtract, or alter from these starting points
 * 	
 * The attributes are used to indicate the formatting of the symbol. Since the kind element is the constant in all the harmony-chord groups that can make up a polychord, many formatting attributes are here.
 * 	
 * The use-symbols attribute is yes if the kind should be represented when possible with harmony symbols rather than letters and numbers. These symbols include:
 * 	
 * 	major: a triangle, like Unicode 25B3
 * 	minor: -, like Unicode 002D
 * 	augmented: +, like Unicode 002B
 * 	diminished: °, like Unicode 00B0
 * 	half-diminished: ø, like Unicode 00F8
 * 	
 * For the major-minor kind, only the minor symbol is used when use-symbols is yes. The major symbol is set using the symbol attribute in the degree-value element. The corresponding degree-alter value will usually be 0 in this case.
 * 
 * The text attribute describes how the kind should be spelled in a score. If use-symbols is yes, the value of the text attribute follows the symbol. The stack-degrees attribute is yes if the degree elements should be stacked above each other. The parentheses-degrees attribute is yes if all the degrees should be in parentheses. The bracket-degrees attribute is yes if all the degrees should be in a bracket. If not specified, these values are implementation-specific. The alignment attributes are for the entire harmony-chord group of which this kind element is a part.
 * 
 * <p>Clase Java para kind complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="kind">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>kind-value">
 *       &lt;attGroup ref="{}halign"/>
 *       &lt;attGroup ref="{}print-style"/>
 *       &lt;attGroup ref="{}valign"/>
 *       &lt;attribute name="use-symbols" type="{}yes-no" />
 *       &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="stack-degrees" type="{}yes-no" />
 *       &lt;attribute name="parentheses-degrees" type="{}yes-no" />
 *       &lt;attribute name="bracket-degrees" type="{}yes-no" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kind", propOrder = {
    "value"
})
public class Kind {

    @XmlValue
    protected KindValue value;
    @XmlAttribute(name = "use-symbols")
    protected YesNo useSymbols;
    @XmlAttribute(name = "text")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected java.lang.String text;
    @XmlAttribute(name = "stack-degrees")
    protected YesNo stackDegrees;
    @XmlAttribute(name = "parentheses-degrees")
    protected YesNo parenthesesDegrees;
    @XmlAttribute(name = "bracket-degrees")
    protected YesNo bracketDegrees;
    @XmlAttribute(name = "halign")
    protected LeftCenterRight halign;
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
    @XmlAttribute(name = "valign")
    protected Valign valign;

    /**
     * A kind-value indicates the type of chord. Degree elements can then add, subtract, or alter from these starting points. Values include:
     * 	
     * Triads:
     * 	major (major third, perfect fifth)
     * 	minor (minor third, perfect fifth)
     * 	augmented (major third, augmented fifth)
     * 	diminished (minor third, diminished fifth)
     * Sevenths:
     * 	dominant (major triad, minor seventh)
     * 	major-seventh (major triad, major seventh)
     * 	minor-seventh (minor triad, minor seventh)
     * 	diminished-seventh (diminished triad, diminished seventh)
     * 	augmented-seventh (augmented triad, minor seventh)
     * 	half-diminished (diminished triad, minor seventh)
     * 	major-minor (minor triad, major seventh)
     * Sixths:
     * 	major-sixth (major triad, added sixth)
     * 	minor-sixth (minor triad, added sixth)
     * Ninths:
     * 	dominant-ninth (dominant-seventh, major ninth)
     * 	major-ninth (major-seventh, major ninth)
     * 	minor-ninth (minor-seventh, major ninth)
     *  11ths (usually as the basis for alteration):
     * 	dominant-11th (dominant-ninth, perfect 11th)
     * 	major-11th (major-ninth, perfect 11th)
     * 	minor-11th (minor-ninth, perfect 11th)
     *  13ths (usually as the basis for alteration):
     * 	dominant-13th (dominant-11th, major 13th)
     * 	major-13th (major-11th, major 13th)
     * 	minor-13th (minor-11th, major 13th)
     * Suspended:
     * 	suspended-second (major second, perfect fifth)
     * 	suspended-fourth (perfect fourth, perfect fifth)
     * Functional sixths:
     * 	Neapolitan
     * 	Italian
     * 	French
     * 	German
     * Other:
     * 	pedal (pedal-point bass)
     * 	power (perfect fifth)
     * 	Tristan
     * 	
     * The "other" kind is used when the harmony is entirely composed of add elements. The "none" kind is used to explicitly encode absence of chords or functional harmony.
     * 
     * @return
     *     possible object is
     *     {@link KindValue }
     *     
     */
    public KindValue getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link KindValue }
     *     
     */
    public void setValue(KindValue value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad useSymbols.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getUseSymbols() {
        return useSymbols;
    }

    /**
     * Define el valor de la propiedad useSymbols.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setUseSymbols(YesNo value) {
        this.useSymbols = value;
    }

    /**
     * Obtiene el valor de la propiedad text.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getText() {
        return text;
    }

    /**
     * Define el valor de la propiedad text.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setText(java.lang.String value) {
        this.text = value;
    }

    /**
     * Obtiene el valor de la propiedad stackDegrees.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getStackDegrees() {
        return stackDegrees;
    }

    /**
     * Define el valor de la propiedad stackDegrees.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setStackDegrees(YesNo value) {
        this.stackDegrees = value;
    }

    /**
     * Obtiene el valor de la propiedad parenthesesDegrees.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getParenthesesDegrees() {
        return parenthesesDegrees;
    }

    /**
     * Define el valor de la propiedad parenthesesDegrees.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setParenthesesDegrees(YesNo value) {
        this.parenthesesDegrees = value;
    }

    /**
     * Obtiene el valor de la propiedad bracketDegrees.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getBracketDegrees() {
        return bracketDegrees;
    }

    /**
     * Define el valor de la propiedad bracketDegrees.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setBracketDegrees(YesNo value) {
        this.bracketDegrees = value;
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

}

//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.02 a las 03:52:44 PM EDT 
//


package mjaxb;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The content of the degree-value type is a number indicating the degree of the chord (1 for the root, 3 for third, etc). The text attribute specifies how the type of the degree should be displayed in a score. The degree-value symbol attribute indicates that a symbol should be used in specifying the degree. If the symbol attribute is present, the value of the text attribute follows the symbol.
 * 
 * <p>Clase Java para degree-value complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="degree-value">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
 *       &lt;attGroup ref="{}print-style"/>
 *       &lt;attribute name="symbol" type="{}degree-symbol-value" />
 *       &lt;attribute name="text" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "degree-value", propOrder = {
    "value"
})
public class DegreeValue {

    @XmlValue
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger value;
    @XmlAttribute(name = "symbol")
    protected DegreeSymbolValue symbol;
    @XmlAttribute(name = "text")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected java.lang.String text;
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
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad symbol.
     * 
     * @return
     *     possible object is
     *     {@link DegreeSymbolValue }
     *     
     */
    public DegreeSymbolValue getSymbol() {
        return symbol;
    }

    /**
     * Define el valor de la propiedad symbol.
     * 
     * @param value
     *     allowed object is
     *     {@link DegreeSymbolValue }
     *     
     */
    public void setSymbol(DegreeSymbolValue value) {
        this.symbol = value;
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

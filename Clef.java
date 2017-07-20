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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Clefs are represented by a combination of sign, line, and clef-octave-change elements. The optional number attribute refers to staff numbers within the part. A value of 1 is assumed if not present.
 * 
 * Sometimes clefs are added to the staff in non-standard line positions, either to indicate cue passages, or when there are multiple clefs present simultaneously on one staff. In this situation, the additional attribute is set to "yes" and the line value is ignored. The size attribute is used for clefs where the additional attribute is "yes". It is typically used to indicate cue clefs.
 * 
 * Sometimes clefs at the start of a measure need to appear after the barline rather than before, as for cues or for use after a repeated section. The after-barline attribute is set to "yes" in this situation. The attribute is ignored for mid-measure clefs.
 * 
 * Clefs appear at the start of each system unless the print-object attribute has been set to "no" or the additional attribute has been set to "yes".
 * 
 * <p>Clase Java para clef complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sign" type="{}clef-sign"/>
 *         &lt;element name="line" type="{}staff-line" minOccurs="0"/>
 *         &lt;element name="clef-octave-change" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}print-style"/>
 *       &lt;attGroup ref="{}print-object"/>
 *       &lt;attribute name="number" type="{}staff-number" />
 *       &lt;attribute name="additional" type="{}yes-no" />
 *       &lt;attribute name="size" type="{}symbol-size" />
 *       &lt;attribute name="after-barline" type="{}yes-no" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clef", propOrder = {
    "sign",
    "line",
    "clefOctaveChange"
})
public class Clef {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ClefSign sign;
    protected BigInteger line;
    @XmlElement(name = "clef-octave-change")
    protected BigInteger clefOctaveChange;
    @XmlAttribute(name = "number")
    protected BigInteger number;
    @XmlAttribute(name = "additional")
    protected YesNo additional;
    @XmlAttribute(name = "size")
    protected SymbolSize size;
    @XmlAttribute(name = "after-barline")
    protected YesNo afterBarline;
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
    @XmlAttribute(name = "print-object")
    protected YesNo printObject;

    /**
     * Obtiene el valor de la propiedad sign.
     * 
     * @return
     *     possible object is
     *     {@link ClefSign }
     *     
     */
    public ClefSign getSign() {
        return sign;
    }

    /**
     * Define el valor de la propiedad sign.
     * 
     * @param value
     *     allowed object is
     *     {@link ClefSign }
     *     
     */
    public void setSign(ClefSign value) {
        this.sign = value;
    }

    /**
     * Obtiene el valor de la propiedad line.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLine() {
        return line;
    }

    /**
     * Define el valor de la propiedad line.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLine(BigInteger value) {
        this.line = value;
    }

    /**
     * Obtiene el valor de la propiedad clefOctaveChange.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClefOctaveChange() {
        return clefOctaveChange;
    }

    /**
     * Define el valor de la propiedad clefOctaveChange.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClefOctaveChange(BigInteger value) {
        this.clefOctaveChange = value;
    }

    /**
     * Obtiene el valor de la propiedad number.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Define el valor de la propiedad number.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

    /**
     * Obtiene el valor de la propiedad additional.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getAdditional() {
        return additional;
    }

    /**
     * Define el valor de la propiedad additional.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setAdditional(YesNo value) {
        this.additional = value;
    }

    /**
     * Obtiene el valor de la propiedad size.
     * 
     * @return
     *     possible object is
     *     {@link SymbolSize }
     *     
     */
    public SymbolSize getSize() {
        return size;
    }

    /**
     * Define el valor de la propiedad size.
     * 
     * @param value
     *     allowed object is
     *     {@link SymbolSize }
     *     
     */
    public void setSize(SymbolSize value) {
        this.size = value;
    }

    /**
     * Obtiene el valor de la propiedad afterBarline.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getAfterBarline() {
        return afterBarline;
    }

    /**
     * Define el valor de la propiedad afterBarline.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setAfterBarline(YesNo value) {
        this.afterBarline = value;
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

}

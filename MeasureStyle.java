//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.02 a las 03:52:44 PM EDT 
//


package mjaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A measure-style indicates a special way to print partial to multiple measures within a part. This includes multiple rests over several measures, repeats of beats, single, or multiple measures, and use of slash notation.
 * 
 * The multiple-rest and measure-repeat symbols indicate the number of measures covered in the element content. The beat-repeat and slash elements can cover partial measures. All but the multiple-rest element use a type attribute to indicate starting and stopping the use of the style. The optional number attribute specifies the staff number from top to bottom on the system, as with clef.
 * 
 * <p>Clase Java para measure-style complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="measure-style">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="multiple-rest" type="{}multiple-rest"/>
 *         &lt;element name="measure-repeat" type="{}measure-repeat"/>
 *         &lt;element name="beat-repeat" type="{}beat-repeat"/>
 *         &lt;element name="slash" type="{}slash"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{}font"/>
 *       &lt;attGroup ref="{}color"/>
 *       &lt;attribute name="number" type="{}staff-number" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "measure-style", propOrder = {
    "multipleRest",
    "measureRepeat",
    "beatRepeat",
    "slash"
})
public class MeasureStyle {

    @XmlElement(name = "multiple-rest")
    protected MultipleRest multipleRest;
    @XmlElement(name = "measure-repeat")
    protected MeasureRepeat measureRepeat;
    @XmlElement(name = "beat-repeat")
    protected BeatRepeat beatRepeat;
    protected Slash slash;
    @XmlAttribute(name = "number")
    protected BigInteger number;
    @XmlAttribute(name = "font-family")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String fontFamily;
    @XmlAttribute(name = "font-style")
    protected FontStyle fontStyle;
    @XmlAttribute(name = "font-size")
    protected java.lang.String fontSize;
    @XmlAttribute(name = "font-weight")
    protected FontWeight fontWeight;
    @XmlAttribute(name = "color")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String color;

    /**
     * Obtiene el valor de la propiedad multipleRest.
     * 
     * @return
     *     possible object is
     *     {@link MultipleRest }
     *     
     */
    public MultipleRest getMultipleRest() {
        return multipleRest;
    }

    /**
     * Define el valor de la propiedad multipleRest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleRest }
     *     
     */
    public void setMultipleRest(MultipleRest value) {
        this.multipleRest = value;
    }

    /**
     * Obtiene el valor de la propiedad measureRepeat.
     * 
     * @return
     *     possible object is
     *     {@link MeasureRepeat }
     *     
     */
    public MeasureRepeat getMeasureRepeat() {
        return measureRepeat;
    }

    /**
     * Define el valor de la propiedad measureRepeat.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureRepeat }
     *     
     */
    public void setMeasureRepeat(MeasureRepeat value) {
        this.measureRepeat = value;
    }

    /**
     * Obtiene el valor de la propiedad beatRepeat.
     * 
     * @return
     *     possible object is
     *     {@link BeatRepeat }
     *     
     */
    public BeatRepeat getBeatRepeat() {
        return beatRepeat;
    }

    /**
     * Define el valor de la propiedad beatRepeat.
     * 
     * @param value
     *     allowed object is
     *     {@link BeatRepeat }
     *     
     */
    public void setBeatRepeat(BeatRepeat value) {
        this.beatRepeat = value;
    }

    /**
     * Obtiene el valor de la propiedad slash.
     * 
     * @return
     *     possible object is
     *     {@link Slash }
     *     
     */
    public Slash getSlash() {
        return slash;
    }

    /**
     * Define el valor de la propiedad slash.
     * 
     * @param value
     *     allowed object is
     *     {@link Slash }
     *     
     */
    public void setSlash(Slash value) {
        this.slash = value;
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

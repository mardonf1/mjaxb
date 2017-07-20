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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Dynamics can be associated either with a note or a general musical direction. To avoid inconsistencies between and amongst the letter abbreviations for dynamics (what is sf vs. sfz, standing alone or with a trailing dynamic that is not always piano), we use the actual letters as the names of these dynamic elements. The other-dynamics element allows other dynamic marks that are not covered here, but many of those should perhaps be included in a more general musical direction element. Dynamics elements may also be combined to create marks not covered by a single element, such as sfmp.
 * 	
 * These letter dynamic symbols are separated from crescendo, decrescendo, and wedge indications. Dynamic representation is inconsistent in scores. Many things are assumed by the composer and left out, such as returns to original dynamics. Systematic representations are quite complex: for example, Humdrum has at least 3 representation formats related to dynamics. The MusicXML format captures what is in the score, but does not try to be optimal for analysis or synthesis of dynamics.
 * 
 * <p>Clase Java para dynamics complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dynamics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="p" type="{}empty"/>
 *         &lt;element name="pp" type="{}empty"/>
 *         &lt;element name="ppp" type="{}empty"/>
 *         &lt;element name="pppp" type="{}empty"/>
 *         &lt;element name="ppppp" type="{}empty"/>
 *         &lt;element name="pppppp" type="{}empty"/>
 *         &lt;element name="f" type="{}empty"/>
 *         &lt;element name="ff" type="{}empty"/>
 *         &lt;element name="fff" type="{}empty"/>
 *         &lt;element name="ffff" type="{}empty"/>
 *         &lt;element name="fffff" type="{}empty"/>
 *         &lt;element name="ffffff" type="{}empty"/>
 *         &lt;element name="mp" type="{}empty"/>
 *         &lt;element name="mf" type="{}empty"/>
 *         &lt;element name="sf" type="{}empty"/>
 *         &lt;element name="sfp" type="{}empty"/>
 *         &lt;element name="sfpp" type="{}empty"/>
 *         &lt;element name="fp" type="{}empty"/>
 *         &lt;element name="rf" type="{}empty"/>
 *         &lt;element name="rfz" type="{}empty"/>
 *         &lt;element name="sfz" type="{}empty"/>
 *         &lt;element name="sffz" type="{}empty"/>
 *         &lt;element name="fz" type="{}empty"/>
 *         &lt;element name="other-dynamics" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{}text-decoration"/>
 *       &lt;attGroup ref="{}enclosure"/>
 *       &lt;attGroup ref="{}print-style-align"/>
 *       &lt;attGroup ref="{}placement"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dynamics", propOrder = {
    "pOrPpOrPpp"
})
public class Dynamics {

    @XmlElementRefs({
        @XmlElementRef(name = "mp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ppppp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ffffff", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "f", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ppp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fff", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ffff", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mf", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rfz", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sfpp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sffz", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pppppp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fffff", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sf", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "other-dynamics", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sfp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fz", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pppp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "p", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ff", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sfz", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rf", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> pOrPpOrPpp;
    @XmlAttribute(name = "underline")
    protected Integer underline;
    @XmlAttribute(name = "overline")
    protected Integer overline;
    @XmlAttribute(name = "line-through")
    protected Integer lineThrough;
    @XmlAttribute(name = "enclosure")
    protected EnclosureShape enclosure;
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
    @XmlAttribute(name = "placement")
    protected AboveBelow placement;

    /**
     * Gets the value of the pOrPpOrPpp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pOrPpOrPpp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOrPpOrPpp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.String }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPOrPpOrPpp() {
        if (pOrPpOrPpp == null) {
            pOrPpOrPpp = new ArrayList<JAXBElement<?>>();
        }
        return this.pOrPpOrPpp;
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

}

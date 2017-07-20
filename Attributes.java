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
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The attributes element contains musical information that typically changes on measure boundaries. This includes key and time signatures, clefs, transpositions, and staving. When attributes are changed mid-measure, it affects the music in score order, not in MusicXML document order.
 * 
 * <p>Clase Java para attributes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="attributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{}editorial"/>
 *         &lt;element name="divisions" type="{}positive-divisions" minOccurs="0"/>
 *         &lt;element name="key" type="{}key" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="time" type="{}time" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="staves" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="part-symbol" type="{}part-symbol" minOccurs="0"/>
 *         &lt;element name="instruments" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="clef" type="{}clef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="staff-details" type="{}staff-details" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transpose" type="{}transpose" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="directive" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attGroup ref="{}print-style"/>
 *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="measure-style" type="{}measure-style" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attributes", propOrder = {
    "footnote",
    "level",
    "divisions",
    "key",
    "time",
    "staves",
    "partSymbol",
    "instruments",
    "clef",
    "staffDetails",
    "transpose",
    "directive",
    "measureStyle"
})
public class Attributes {

    protected FormattedText footnote;
    protected Level level;
    protected BigDecimal divisions;
    protected List<Key> key;
    protected List<Time> time;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger staves;
    @XmlElement(name = "part-symbol")
    protected PartSymbol partSymbol;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger instruments;
    protected List<Clef> clef;
    @XmlElement(name = "staff-details")
    protected List<StaffDetails> staffDetails;
    protected List<Transpose> transpose;
    protected List<Attributes.Directive> directive;
    @XmlElement(name = "measure-style")
    protected List<MeasureStyle> measureStyle;

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
     * Obtiene el valor de la propiedad divisions.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDivisions() {
        return divisions;
    }

    /**
     * Define el valor de la propiedad divisions.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDivisions(BigDecimal value) {
        this.divisions = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the key property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Key }
     * 
     * 
     */
    public List<Key> getKey() {
        if (key == null) {
            key = new ArrayList<Key>();
        }
        return this.key;
    }

    /**
     * Gets the value of the time property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the time property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Time }
     * 
     * 
     */
    public List<Time> getTime() {
        if (time == null) {
            time = new ArrayList<Time>();
        }
        return this.time;
    }

    /**
     * Obtiene el valor de la propiedad staves.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStaves() {
        return staves;
    }

    /**
     * Define el valor de la propiedad staves.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStaves(BigInteger value) {
        this.staves = value;
    }

    /**
     * Obtiene el valor de la propiedad partSymbol.
     * 
     * @return
     *     possible object is
     *     {@link PartSymbol }
     *     
     */
    public PartSymbol getPartSymbol() {
        return partSymbol;
    }

    /**
     * Define el valor de la propiedad partSymbol.
     * 
     * @param value
     *     allowed object is
     *     {@link PartSymbol }
     *     
     */
    public void setPartSymbol(PartSymbol value) {
        this.partSymbol = value;
    }

    /**
     * Obtiene el valor de la propiedad instruments.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInstruments() {
        return instruments;
    }

    /**
     * Define el valor de la propiedad instruments.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInstruments(BigInteger value) {
        this.instruments = value;
    }

    /**
     * Gets the value of the clef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Clef }
     * 
     * 
     */
    public List<Clef> getClef() {
        if (clef == null) {
            clef = new ArrayList<Clef>();
        }
        return this.clef;
    }

    /**
     * Gets the value of the staffDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staffDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaffDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StaffDetails }
     * 
     * 
     */
    public List<StaffDetails> getStaffDetails() {
        if (staffDetails == null) {
            staffDetails = new ArrayList<StaffDetails>();
        }
        return this.staffDetails;
    }

    /**
     * Gets the value of the transpose property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transpose property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranspose().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transpose }
     * 
     * 
     */
    public List<Transpose> getTranspose() {
        if (transpose == null) {
            transpose = new ArrayList<Transpose>();
        }
        return this.transpose;
    }

    /**
     * Gets the value of the directive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirective().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attributes.Directive }
     * 
     * 
     */
    public List<Attributes.Directive> getDirective() {
        if (directive == null) {
            directive = new ArrayList<Attributes.Directive>();
        }
        return this.directive;
    }

    /**
     * Gets the value of the measureStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measureStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasureStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasureStyle }
     * 
     * 
     */
    public List<MeasureStyle> getMeasureStyle() {
        if (measureStyle == null) {
            measureStyle = new ArrayList<MeasureStyle>();
        }
        return this.measureStyle;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attGroup ref="{}print-style"/>
     *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Directive {

        @XmlValue
        protected java.lang.String value;
        @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
        protected java.lang.String lang;
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

}

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


/**
 * If a barline is other than a normal single barline, it should be represented by a barline type that describes it. This includes information about repeats and multiple endings, as well as line style. Barline data is on the same level as the other musical data in a score - a child of a measure in a partwise score, or a part in a timewise score. This allows for barlines within measures, as in dotted barlines that subdivide measures in complex meters. The two fermata elements allow for fermatas on both sides of the barline (the lower one inverted).
 * 	
 * Barlines have a location attribute to make it easier to process barlines independently of the other musical data in a score. It is often easier to set up measures separately from entering notes. The location attribute must match where the barline element occurs within the rest of the musical data in the score. If location is left, it should be the first element in the measure, aside from the print, bookmark, and link elements. If location is right, it should be the last element, again with the possible exception of the print, bookmark, and link elements. If no location is specified, the right barline is the default. The segno, coda, and divisions attributes work the same way as in the sound element. They are used for playback when barline elements contain segno or coda child elements.
 * 
 * <p>Clase Java para barline complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="barline">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bar-style" type="{}bar-style-color" minOccurs="0"/>
 *         &lt;group ref="{}editorial"/>
 *         &lt;element name="wavy-line" type="{}wavy-line" minOccurs="0"/>
 *         &lt;element name="segno" type="{}empty-print-style-align" minOccurs="0"/>
 *         &lt;element name="coda" type="{}empty-print-style-align" minOccurs="0"/>
 *         &lt;element name="fermata" type="{}fermata" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="ending" type="{}ending" minOccurs="0"/>
 *         &lt;element name="repeat" type="{}repeat" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="location" type="{}right-left-middle" default="right" />
 *       &lt;attribute name="divisions" type="{}divisions" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "barline", propOrder = {
    "barStyle",
    "footnote",
    "level",
    "wavyLine",
    "segno",
    "coda",
    "fermata",
    "ending",
    "repeat"
})
public class Barline {

    @XmlElement(name = "bar-style")
    protected BarStyleColor barStyle;
    protected FormattedText footnote;
    protected Level level;
    @XmlElement(name = "wavy-line")
    protected WavyLine wavyLine;
    protected EmptyPrintStyleAlign segno;
    protected EmptyPrintStyleAlign coda;
    protected List<Fermata> fermata;
    protected Ending ending;
    protected Repeat repeat;
    @XmlAttribute(name = "location")
    protected RightLeftMiddle location;
    @XmlAttribute(name = "divisions")
    protected BigDecimal divisions;

    /**
     * Obtiene el valor de la propiedad barStyle.
     * 
     * @return
     *     possible object is
     *     {@link BarStyleColor }
     *     
     */
    public BarStyleColor getBarStyle() {
        return barStyle;
    }

    /**
     * Define el valor de la propiedad barStyle.
     * 
     * @param value
     *     allowed object is
     *     {@link BarStyleColor }
     *     
     */
    public void setBarStyle(BarStyleColor value) {
        this.barStyle = value;
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
     * Obtiene el valor de la propiedad wavyLine.
     * 
     * @return
     *     possible object is
     *     {@link WavyLine }
     *     
     */
    public WavyLine getWavyLine() {
        return wavyLine;
    }

    /**
     * Define el valor de la propiedad wavyLine.
     * 
     * @param value
     *     allowed object is
     *     {@link WavyLine }
     *     
     */
    public void setWavyLine(WavyLine value) {
        this.wavyLine = value;
    }

    /**
     * Obtiene el valor de la propiedad segno.
     * 
     * @return
     *     possible object is
     *     {@link EmptyPrintStyleAlign }
     *     
     */
    public EmptyPrintStyleAlign getSegno() {
        return segno;
    }

    /**
     * Define el valor de la propiedad segno.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyPrintStyleAlign }
     *     
     */
    public void setSegno(EmptyPrintStyleAlign value) {
        this.segno = value;
    }

    /**
     * Obtiene el valor de la propiedad coda.
     * 
     * @return
     *     possible object is
     *     {@link EmptyPrintStyleAlign }
     *     
     */
    public EmptyPrintStyleAlign getCoda() {
        return coda;
    }

    /**
     * Define el valor de la propiedad coda.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyPrintStyleAlign }
     *     
     */
    public void setCoda(EmptyPrintStyleAlign value) {
        this.coda = value;
    }

    /**
     * Gets the value of the fermata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fermata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFermata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fermata }
     * 
     * 
     */
    public List<Fermata> getFermata() {
        if (fermata == null) {
            fermata = new ArrayList<Fermata>();
        }
        return this.fermata;
    }

    /**
     * Obtiene el valor de la propiedad ending.
     * 
     * @return
     *     possible object is
     *     {@link Ending }
     *     
     */
    public Ending getEnding() {
        return ending;
    }

    /**
     * Define el valor de la propiedad ending.
     * 
     * @param value
     *     allowed object is
     *     {@link Ending }
     *     
     */
    public void setEnding(Ending value) {
        this.ending = value;
    }

    /**
     * Obtiene el valor de la propiedad repeat.
     * 
     * @return
     *     possible object is
     *     {@link Repeat }
     *     
     */
    public Repeat getRepeat() {
        return repeat;
    }

    /**
     * Define el valor de la propiedad repeat.
     * 
     * @param value
     *     allowed object is
     *     {@link Repeat }
     *     
     */
    public void setRepeat(Repeat value) {
        this.repeat = value;
    }

    /**
     * Obtiene el valor de la propiedad location.
     * 
     * @return
     *     possible object is
     *     {@link RightLeftMiddle }
     *     
     */
    public RightLeftMiddle getLocation() {
        if (location == null) {
            return RightLeftMiddle.RIGHT;
        } else {
            return location;
        }
    }

    /**
     * Define el valor de la propiedad location.
     * 
     * @param value
     *     allowed object is
     *     {@link RightLeftMiddle }
     *     
     */
    public void setLocation(RightLeftMiddle value) {
        this.location = value;
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

}

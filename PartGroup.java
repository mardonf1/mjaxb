//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.02 a las 03:52:44 PM EDT 
//


package mjaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The part-group element indicates groupings of parts in the score, usually indicated by braces and brackets. Braces that are used for multi-staff parts should be defined in the attributes element for that part. The part-group start element appears before the first score-part in the group. The part-group stop element appears after the last score-part in the group.
 * 	
 * The number attribute is used to distinguish overlapping and nested part-groups, not the sequence of groups. As with parts, groups can have a name and abbreviation. Values for the child elements are ignored at the stop of a group. 
 * 	
 * A part-group element is not needed for a single multi-staff part. By default, multi-staff parts include a brace symbol and (if appropriate given the bar-style) common barlines. The symbol formatting for a multi-staff part can be more fully specified using the part-symbol element.
 * 
 * <p>Clase Java para part-group complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="part-group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="group-name" type="{}group-name" minOccurs="0"/>
 *         &lt;element name="group-name-display" type="{}name-display" minOccurs="0"/>
 *         &lt;element name="group-abbreviation" type="{}group-name" minOccurs="0"/>
 *         &lt;element name="group-abbreviation-display" type="{}name-display" minOccurs="0"/>
 *         &lt;element name="group-symbol" type="{}group-symbol" minOccurs="0"/>
 *         &lt;element name="group-barline" type="{}group-barline" minOccurs="0"/>
 *         &lt;element name="group-time" type="{}empty" minOccurs="0"/>
 *         &lt;group ref="{}editorial"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{}start-stop" />
 *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}token" default="1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "part-group", propOrder = {
    "groupName",
    "groupNameDisplay",
    "groupAbbreviation",
    "groupAbbreviationDisplay",
    "groupSymbol",
    "groupBarline",
    "groupTime",
    "footnote",
    "level"
})
public class PartGroup {

    @XmlElement(name = "group-name")
    protected GroupName groupName;
    @XmlElement(name = "group-name-display")
    protected NameDisplay groupNameDisplay;
    @XmlElement(name = "group-abbreviation")
    protected GroupName groupAbbreviation;
    @XmlElement(name = "group-abbreviation-display")
    protected NameDisplay groupAbbreviationDisplay;
    @XmlElement(name = "group-symbol")
    protected GroupSymbol groupSymbol;
    @XmlElement(name = "group-barline")
    protected GroupBarline groupBarline;
    @XmlElement(name = "group-time")
    protected Empty groupTime;
    protected FormattedText footnote;
    protected Level level;
    @XmlAttribute(name = "type", required = true)
    protected StartStop type;
    @XmlAttribute(name = "number")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected java.lang.String number;

    /**
     * Obtiene el valor de la propiedad groupName.
     * 
     * @return
     *     possible object is
     *     {@link GroupName }
     *     
     */
    public GroupName getGroupName() {
        return groupName;
    }

    /**
     * Define el valor de la propiedad groupName.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupName }
     *     
     */
    public void setGroupName(GroupName value) {
        this.groupName = value;
    }

    /**
     * Obtiene el valor de la propiedad groupNameDisplay.
     * 
     * @return
     *     possible object is
     *     {@link NameDisplay }
     *     
     */
    public NameDisplay getGroupNameDisplay() {
        return groupNameDisplay;
    }

    /**
     * Define el valor de la propiedad groupNameDisplay.
     * 
     * @param value
     *     allowed object is
     *     {@link NameDisplay }
     *     
     */
    public void setGroupNameDisplay(NameDisplay value) {
        this.groupNameDisplay = value;
    }

    /**
     * Obtiene el valor de la propiedad groupAbbreviation.
     * 
     * @return
     *     possible object is
     *     {@link GroupName }
     *     
     */
    public GroupName getGroupAbbreviation() {
        return groupAbbreviation;
    }

    /**
     * Define el valor de la propiedad groupAbbreviation.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupName }
     *     
     */
    public void setGroupAbbreviation(GroupName value) {
        this.groupAbbreviation = value;
    }

    /**
     * Obtiene el valor de la propiedad groupAbbreviationDisplay.
     * 
     * @return
     *     possible object is
     *     {@link NameDisplay }
     *     
     */
    public NameDisplay getGroupAbbreviationDisplay() {
        return groupAbbreviationDisplay;
    }

    /**
     * Define el valor de la propiedad groupAbbreviationDisplay.
     * 
     * @param value
     *     allowed object is
     *     {@link NameDisplay }
     *     
     */
    public void setGroupAbbreviationDisplay(NameDisplay value) {
        this.groupAbbreviationDisplay = value;
    }

    /**
     * Obtiene el valor de la propiedad groupSymbol.
     * 
     * @return
     *     possible object is
     *     {@link GroupSymbol }
     *     
     */
    public GroupSymbol getGroupSymbol() {
        return groupSymbol;
    }

    /**
     * Define el valor de la propiedad groupSymbol.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupSymbol }
     *     
     */
    public void setGroupSymbol(GroupSymbol value) {
        this.groupSymbol = value;
    }

    /**
     * Obtiene el valor de la propiedad groupBarline.
     * 
     * @return
     *     possible object is
     *     {@link GroupBarline }
     *     
     */
    public GroupBarline getGroupBarline() {
        return groupBarline;
    }

    /**
     * Define el valor de la propiedad groupBarline.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupBarline }
     *     
     */
    public void setGroupBarline(GroupBarline value) {
        this.groupBarline = value;
    }

    /**
     * Obtiene el valor de la propiedad groupTime.
     * 
     * @return
     *     possible object is
     *     {@link Empty }
     *     
     */
    public Empty getGroupTime() {
        return groupTime;
    }

    /**
     * Define el valor de la propiedad groupTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Empty }
     *     
     */
    public void setGroupTime(Empty value) {
        this.groupTime = value;
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
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link StartStop }
     *     
     */
    public StartStop getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link StartStop }
     *     
     */
    public void setType(StartStop value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad number.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getNumber() {
        if (number == null) {
            return "1";
        } else {
            return number;
        }
    }

    /**
     * Define el valor de la propiedad number.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNumber(java.lang.String value) {
        this.number = value;
    }

}

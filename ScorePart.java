//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.02 a las 03:52:44 PM EDT 
//


package mjaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Each MusicXML part corresponds to a track in a Standard MIDI Format 1 file. The score-instrument elements are used when there are multiple instruments per track. The midi-device element is used to make a MIDI device or port assignment for the given track or specific MIDI instruments. Initial midi-instrument assignments may be made here as well.
 * 
 * <p>Clase Java para score-part complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="score-part">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identification" type="{}identification" minOccurs="0"/>
 *         &lt;element name="part-name" type="{}part-name"/>
 *         &lt;element name="part-name-display" type="{}name-display" minOccurs="0"/>
 *         &lt;element name="part-abbreviation" type="{}part-name" minOccurs="0"/>
 *         &lt;element name="part-abbreviation-display" type="{}name-display" minOccurs="0"/>
 *         &lt;element name="group" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="score-instrument" type="{}score-instrument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="midi-device" type="{}midi-device" minOccurs="0"/>
 *           &lt;element name="midi-instrument" type="{}midi-instrument" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "score-part", propOrder = {
    "identification",
    "partName",
    "partNameDisplay",
    "partAbbreviation",
    "partAbbreviationDisplay",
    "group",
    "scoreInstrument",
    "midiDeviceAndMidiInstrument"
})
public class ScorePart {

    protected Identification identification;
    @XmlElement(name = "part-name", required = true)
    protected PartName partName;
    @XmlElement(name = "part-name-display")
    protected NameDisplay partNameDisplay;
    @XmlElement(name = "part-abbreviation")
    protected PartName partAbbreviation;
    @XmlElement(name = "part-abbreviation-display")
    protected NameDisplay partAbbreviationDisplay;
    protected List<java.lang.String> group;
    @XmlElement(name = "score-instrument")
    protected List<ScoreInstrument> scoreInstrument;
    @XmlElements({
        @XmlElement(name = "midi-device", type = MidiDevice.class),
        @XmlElement(name = "midi-instrument", type = MidiInstrument.class)
    })
    protected List<Object> midiDeviceAndMidiInstrument;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

    /**
     * Obtiene el valor de la propiedad identification.
     * 
     * @return
     *     possible object is
     *     {@link Identification }
     *     
     */
    public Identification getIdentification() {
        return identification;
    }

    /**
     * Define el valor de la propiedad identification.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification }
     *     
     */
    public void setIdentification(Identification value) {
        this.identification = value;
    }

    /**
     * Obtiene el valor de la propiedad partName.
     * 
     * @return
     *     possible object is
     *     {@link PartName }
     *     
     */
    public PartName getPartName() {
        return partName;
    }

    /**
     * Define el valor de la propiedad partName.
     * 
     * @param value
     *     allowed object is
     *     {@link PartName }
     *     
     */
    public void setPartName(PartName value) {
        this.partName = value;
    }

    /**
     * Obtiene el valor de la propiedad partNameDisplay.
     * 
     * @return
     *     possible object is
     *     {@link NameDisplay }
     *     
     */
    public NameDisplay getPartNameDisplay() {
        return partNameDisplay;
    }

    /**
     * Define el valor de la propiedad partNameDisplay.
     * 
     * @param value
     *     allowed object is
     *     {@link NameDisplay }
     *     
     */
    public void setPartNameDisplay(NameDisplay value) {
        this.partNameDisplay = value;
    }

    /**
     * Obtiene el valor de la propiedad partAbbreviation.
     * 
     * @return
     *     possible object is
     *     {@link PartName }
     *     
     */
    public PartName getPartAbbreviation() {
        return partAbbreviation;
    }

    /**
     * Define el valor de la propiedad partAbbreviation.
     * 
     * @param value
     *     allowed object is
     *     {@link PartName }
     *     
     */
    public void setPartAbbreviation(PartName value) {
        this.partAbbreviation = value;
    }

    /**
     * Obtiene el valor de la propiedad partAbbreviationDisplay.
     * 
     * @return
     *     possible object is
     *     {@link NameDisplay }
     *     
     */
    public NameDisplay getPartAbbreviationDisplay() {
        return partAbbreviationDisplay;
    }

    /**
     * Define el valor de la propiedad partAbbreviationDisplay.
     * 
     * @param value
     *     allowed object is
     *     {@link NameDisplay }
     *     
     */
    public void setPartAbbreviationDisplay(NameDisplay value) {
        this.partAbbreviationDisplay = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the group property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getGroup() {
        if (group == null) {
            group = new ArrayList<java.lang.String>();
        }
        return this.group;
    }

    /**
     * Gets the value of the scoreInstrument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreInstrument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreInstrument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScoreInstrument }
     * 
     * 
     */
    public List<ScoreInstrument> getScoreInstrument() {
        if (scoreInstrument == null) {
            scoreInstrument = new ArrayList<ScoreInstrument>();
        }
        return this.scoreInstrument;
    }

    /**
     * Gets the value of the midiDeviceAndMidiInstrument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the midiDeviceAndMidiInstrument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMidiDeviceAndMidiInstrument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MidiDevice }
     * {@link MidiInstrument }
     * 
     * 
     */
    public List<Object> getMidiDeviceAndMidiInstrument() {
        if (midiDeviceAndMidiInstrument == null) {
            midiDeviceAndMidiInstrument = new ArrayList<Object>();
        }
        return this.midiDeviceAndMidiInstrument;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

}

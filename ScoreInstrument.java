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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The score-instrument type represents a single instrument within a score-part. As with the score-part type, each score-instrument has a required ID attribute, a name, and an optional abbreviation.
 * 	
 * A score-instrument type is also required if the score specifies MIDI 1.0 channels, banks, or programs. An initial midi-instrument assignment can also be made here. MusicXML software should be able to automatically assign reasonable channels and instruments without these elements in simple cases, such as where part names match General MIDI instrument names.
 * 
 * <p>Clase Java para score-instrument complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="score-instrument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instrument-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instrument-abbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instrument-sound" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="solo" type="{}empty"/>
 *           &lt;element name="ensemble" type="{}positive-integer-or-empty"/>
 *         &lt;/choice>
 *         &lt;element name="virtual-instrument" type="{}virtual-instrument" minOccurs="0"/>
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
@XmlType(name = "score-instrument", propOrder = {
    "instrumentName",
    "instrumentAbbreviation",
    "instrumentSound",
    "solo",
    "ensemble",
    "virtualInstrument"
})
public class ScoreInstrument {

    @XmlElement(name = "instrument-name", required = true)
    protected java.lang.String instrumentName;
    @XmlElement(name = "instrument-abbreviation")
    protected java.lang.String instrumentAbbreviation;
    @XmlElement(name = "instrument-sound")
    protected java.lang.String instrumentSound;
    protected Empty solo;
    @XmlSchemaType(name = "anySimpleType")
    protected java.lang.String ensemble;
    @XmlElement(name = "virtual-instrument")
    protected VirtualInstrument virtualInstrument;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

    /**
     * Obtiene el valor de la propiedad instrumentName.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getInstrumentName() {
        return instrumentName;
    }

    /**
     * Define el valor de la propiedad instrumentName.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setInstrumentName(java.lang.String value) {
        this.instrumentName = value;
    }

    /**
     * Obtiene el valor de la propiedad instrumentAbbreviation.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getInstrumentAbbreviation() {
        return instrumentAbbreviation;
    }

    /**
     * Define el valor de la propiedad instrumentAbbreviation.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setInstrumentAbbreviation(java.lang.String value) {
        this.instrumentAbbreviation = value;
    }

    /**
     * Obtiene el valor de la propiedad instrumentSound.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getInstrumentSound() {
        return instrumentSound;
    }

    /**
     * Define el valor de la propiedad instrumentSound.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setInstrumentSound(java.lang.String value) {
        this.instrumentSound = value;
    }

    /**
     * Obtiene el valor de la propiedad solo.
     * 
     * @return
     *     possible object is
     *     {@link Empty }
     *     
     */
    public Empty getSolo() {
        return solo;
    }

    /**
     * Define el valor de la propiedad solo.
     * 
     * @param value
     *     allowed object is
     *     {@link Empty }
     *     
     */
    public void setSolo(Empty value) {
        this.solo = value;
    }

    /**
     * Obtiene el valor de la propiedad ensemble.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getEnsemble() {
        return ensemble;
    }

    /**
     * Define el valor de la propiedad ensemble.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setEnsemble(java.lang.String value) {
        this.ensemble = value;
    }

    /**
     * Obtiene el valor de la propiedad virtualInstrument.
     * 
     * @return
     *     possible object is
     *     {@link VirtualInstrument }
     *     
     */
    public VirtualInstrument getVirtualInstrument() {
        return virtualInstrument;
    }

    /**
     * Define el valor de la propiedad virtualInstrument.
     * 
     * @param value
     *     allowed object is
     *     {@link VirtualInstrument }
     *     
     */
    public void setVirtualInstrument(VirtualInstrument value) {
        this.virtualInstrument = value;
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

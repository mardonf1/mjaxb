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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The metronome-note type defines the appearance of a note within a metric relationship mark.
 * 
 * <p>Clase Java para metronome-note complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="metronome-note">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="metronome-type" type="{}note-type-value"/>
 *         &lt;element name="metronome-dot" type="{}empty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="metronome-beam" type="{}metronome-beam" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="metronome-tuplet" type="{}metronome-tuplet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metronome-note", propOrder = {
    "metronomeType",
    "metronomeDot",
    "metronomeBeam",
    "metronomeTuplet"
})
public class MetronomeNote {

    @XmlElement(name = "metronome-type", required = true)
    protected java.lang.String metronomeType;
    @XmlElement(name = "metronome-dot")
    protected List<Empty> metronomeDot;
    @XmlElement(name = "metronome-beam")
    protected List<MetronomeBeam> metronomeBeam;
    @XmlElement(name = "metronome-tuplet")
    protected MetronomeTuplet metronomeTuplet;

    /**
     * Obtiene el valor de la propiedad metronomeType.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getMetronomeType() {
        return metronomeType;
    }

    /**
     * Define el valor de la propiedad metronomeType.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setMetronomeType(java.lang.String value) {
        this.metronomeType = value;
    }

    /**
     * Gets the value of the metronomeDot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metronomeDot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetronomeDot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Empty }
     * 
     * 
     */
    public List<Empty> getMetronomeDot() {
        if (metronomeDot == null) {
            metronomeDot = new ArrayList<Empty>();
        }
        return this.metronomeDot;
    }

    /**
     * Gets the value of the metronomeBeam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metronomeBeam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetronomeBeam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetronomeBeam }
     * 
     * 
     */
    public List<MetronomeBeam> getMetronomeBeam() {
        if (metronomeBeam == null) {
            metronomeBeam = new ArrayList<MetronomeBeam>();
        }
        return this.metronomeBeam;
    }

    /**
     * Obtiene el valor de la propiedad metronomeTuplet.
     * 
     * @return
     *     possible object is
     *     {@link MetronomeTuplet }
     *     
     */
    public MetronomeTuplet getMetronomeTuplet() {
        return metronomeTuplet;
    }

    /**
     * Define el valor de la propiedad metronomeTuplet.
     * 
     * @param value
     *     allowed object is
     *     {@link MetronomeTuplet }
     *     
     */
    public void setMetronomeTuplet(MetronomeTuplet value) {
        this.metronomeTuplet = value;
    }

}

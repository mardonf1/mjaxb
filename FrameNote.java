//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.02 a las 03:52:44 PM EDT 
//


package mjaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The frame-note type represents each note included in the frame. An open string will have a fret value of 0, while a muted string will not be associated with a frame-note element.
 * 
 * <p>Clase Java para frame-note complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="frame-note">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="string" type="{}string"/>
 *         &lt;element name="fret" type="{}fret"/>
 *         &lt;element name="fingering" type="{}fingering" minOccurs="0"/>
 *         &lt;element name="barre" type="{}barre" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "frame-note", propOrder = {
    "string",
    "fret",
    "fingering",
    "barre"
})
public class FrameNote {

    @XmlElement(required = true)
    protected String string;
    @XmlElement(required = true)
    protected Fret fret;
    protected Fingering fingering;
    protected Barre barre;

    /**
     * Obtiene el valor de la propiedad string.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString() {
        return string;
    }

    /**
     * Define el valor de la propiedad string.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString(String value) {
        this.string = value;
    }

    /**
     * Obtiene el valor de la propiedad fret.
     * 
     * @return
     *     possible object is
     *     {@link Fret }
     *     
     */
    public Fret getFret() {
        return fret;
    }

    /**
     * Define el valor de la propiedad fret.
     * 
     * @param value
     *     allowed object is
     *     {@link Fret }
     *     
     */
    public void setFret(Fret value) {
        this.fret = value;
    }

    /**
     * Obtiene el valor de la propiedad fingering.
     * 
     * @return
     *     possible object is
     *     {@link Fingering }
     *     
     */
    public Fingering getFingering() {
        return fingering;
    }

    /**
     * Define el valor de la propiedad fingering.
     * 
     * @param value
     *     allowed object is
     *     {@link Fingering }
     *     
     */
    public void setFingering(Fingering value) {
        this.fingering = value;
    }

    /**
     * Obtiene el valor de la propiedad barre.
     * 
     * @return
     *     possible object is
     *     {@link Barre }
     *     
     */
    public Barre getBarre() {
        return barre;
    }

    /**
     * Define el valor de la propiedad barre.
     * 
     * @param value
     *     allowed object is
     *     {@link Barre }
     *     
     */
    public void setBarre(Barre value) {
        this.barre = value;
    }

}

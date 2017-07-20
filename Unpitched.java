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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The unpitched type represents musical elements that are notated on the staff but lack definite pitch, such as unpitched percussion and speaking voice.
 * 
 * <p>Clase Java para unpitched complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="unpitched">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{}display-step-octave" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unpitched", propOrder = {
    "displayStep",
    "displayOctave"
})
public class Unpitched {

    @XmlElement(name = "display-step")
    @XmlSchemaType(name = "string")
    protected Step displayStep;
    @XmlElement(name = "display-octave")
    @XmlSchemaType(name = "integer")
    protected Integer displayOctave;

    /**
     * Obtiene el valor de la propiedad displayStep.
     * 
     * @return
     *     possible object is
     *     {@link Step }
     *     
     */
    public Step getDisplayStep() {
        return displayStep;
    }

    /**
     * Define el valor de la propiedad displayStep.
     * 
     * @param value
     *     allowed object is
     *     {@link Step }
     *     
     */
    public void setDisplayStep(Step value) {
        this.displayStep = value;
    }

    /**
     * Obtiene el valor de la propiedad displayOctave.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayOctave() {
        return displayOctave;
    }

    /**
     * Define el valor de la propiedad displayOctave.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayOctave(Integer value) {
        this.displayOctave = value;
    }

}

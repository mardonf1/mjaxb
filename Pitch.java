//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.02 a las 03:52:44 PM EDT 
//


package mjaxb;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Pitch is represented as a combination of the step of the diatonic scale, the chromatic alteration, and the octave.
 * 
 * <p>Clase Java para pitch complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pitch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="step" type="{}step"/>
 *         &lt;element name="alter" type="{}semitones" minOccurs="0"/>
 *         &lt;element name="octave" type="{}octave"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pitch", propOrder = {
    "step",
    "alter",
    "octave"
})
public class Pitch {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Step step;
    protected BigDecimal alter;
    @XmlSchemaType(name = "integer")
    protected int octave;

    /**
     * Obtiene el valor de la propiedad step.
     * 
     * @return
     *     possible object is
     *     {@link Step }
     *     
     */
    public Step getStep() {
        return step;
    }

    /**
     * Define el valor de la propiedad step.
     * 
     * @param value
     *     allowed object is
     *     {@link Step }
     *     
     */
    public void setStep(Step value) {
        this.step = value;
    }

    /**
     * Obtiene el valor de la propiedad alter.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAlter() {
        return alter;
    }

    /**
     * Define el valor de la propiedad alter.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAlter(BigDecimal value) {
        this.alter = value;
    }

    /**
     * Obtiene el valor de la propiedad octave.
     * 
     */
    public int getOctave() {
        return octave;
    }

    /**
     * Define el valor de la propiedad octave.
     * 
     */
    public void setOctave(int value) {
        this.octave = value;
    }

}

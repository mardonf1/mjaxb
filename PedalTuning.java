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
 * The pedal-tuning type specifies the tuning of a single harp pedal.
 * 
 * <p>Clase Java para pedal-tuning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pedal-tuning">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pedal-step" type="{}step"/>
 *         &lt;element name="pedal-alter" type="{}semitones"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pedal-tuning", propOrder = {
    "pedalStep",
    "pedalAlter"
})
public class PedalTuning {

    @XmlElement(name = "pedal-step", required = true)
    @XmlSchemaType(name = "string")
    protected Step pedalStep;
    @XmlElement(name = "pedal-alter", required = true)
    protected BigDecimal pedalAlter;

    /**
     * Obtiene el valor de la propiedad pedalStep.
     * 
     * @return
     *     possible object is
     *     {@link Step }
     *     
     */
    public Step getPedalStep() {
        return pedalStep;
    }

    /**
     * Define el valor de la propiedad pedalStep.
     * 
     * @param value
     *     allowed object is
     *     {@link Step }
     *     
     */
    public void setPedalStep(Step value) {
        this.pedalStep = value;
    }

    /**
     * Obtiene el valor de la propiedad pedalAlter.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPedalAlter() {
        return pedalAlter;
    }

    /**
     * Define el valor de la propiedad pedalAlter.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPedalAlter(BigDecimal value) {
        this.pedalAlter = value;
    }

}

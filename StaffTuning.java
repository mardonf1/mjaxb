//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.02 a las 03:52:44 PM EDT 
//


package mjaxb;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The staff-tuning type specifies the open, non-capo tuning of the lines on a tablature staff.
 * 
 * <p>Clase Java para staff-tuning complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="staff-tuning">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{}tuning"/>
 *       &lt;attribute name="line" type="{}staff-line" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "staff-tuning", propOrder = {
    "tuningStep",
    "tuningAlter",
    "tuningOctave"
})
public class StaffTuning {

    @XmlElement(name = "tuning-step", required = true)
    @XmlSchemaType(name = "string")
    protected Step tuningStep;
    @XmlElement(name = "tuning-alter")
    protected BigDecimal tuningAlter;
    @XmlElement(name = "tuning-octave")
    @XmlSchemaType(name = "integer")
    protected int tuningOctave;
    @XmlAttribute(name = "line")
    protected BigInteger line;

    /**
     * Obtiene el valor de la propiedad tuningStep.
     * 
     * @return
     *     possible object is
     *     {@link Step }
     *     
     */
    public Step getTuningStep() {
        return tuningStep;
    }

    /**
     * Define el valor de la propiedad tuningStep.
     * 
     * @param value
     *     allowed object is
     *     {@link Step }
     *     
     */
    public void setTuningStep(Step value) {
        this.tuningStep = value;
    }

    /**
     * Obtiene el valor de la propiedad tuningAlter.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTuningAlter() {
        return tuningAlter;
    }

    /**
     * Define el valor de la propiedad tuningAlter.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTuningAlter(BigDecimal value) {
        this.tuningAlter = value;
    }

    /**
     * Obtiene el valor de la propiedad tuningOctave.
     * 
     */
    public int getTuningOctave() {
        return tuningOctave;
    }

    /**
     * Define el valor de la propiedad tuningOctave.
     * 
     */
    public void setTuningOctave(int value) {
        this.tuningOctave = value;
    }

    /**
     * Obtiene el valor de la propiedad line.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLine() {
        return line;
    }

    /**
     * Define el valor de la propiedad line.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLine(BigInteger value) {
        this.line = value;
    }

}

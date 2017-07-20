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


/**
 * The rest element indicates notated rests or silences. Rest elements are usually empty, but placement on the staff can be specified using display-step and display-octave elements. If the measure attribute is set to yes, this indicates this is a complete measure rest.
 * 
 * <p>Clase Java para rest complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{}display-step-octave" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="measure" type="{}yes-no" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rest", propOrder = {
    "displayStep",
    "displayOctave"
})
public class Rest {

    @XmlElement(name = "display-step")
    @XmlSchemaType(name = "string")
    protected Step displayStep;
    @XmlElement(name = "display-octave")
    @XmlSchemaType(name = "integer")
    protected Integer displayOctave;
    @XmlAttribute(name = "measure")
    protected YesNo measure;

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

    /**
     * Obtiene el valor de la propiedad measure.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getMeasure() {
        return measure;
    }

    /**
     * Define el valor de la propiedad measure.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setMeasure(YesNo value) {
        this.measure = value;
    }

}

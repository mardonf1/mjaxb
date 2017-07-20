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
 * The bass type is used to indicate a bass note in popular music chord symbols, e.g. G/C. It is generally not used in functional harmony, as inversion is generally not used in pop chord symbols. As with root, it is divided into step and alter elements, similar to pitches.
 * 
 * <p>Clase Java para bass complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bass-step" type="{}bass-step"/>
 *         &lt;element name="bass-alter" type="{}bass-alter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bass", propOrder = {
    "bassStep",
    "bassAlter"
})
public class Bass {

    @XmlElement(name = "bass-step", required = true)
    protected BassStep bassStep;
    @XmlElement(name = "bass-alter")
    protected BassAlter bassAlter;

    /**
     * Obtiene el valor de la propiedad bassStep.
     * 
     * @return
     *     possible object is
     *     {@link BassStep }
     *     
     */
    public BassStep getBassStep() {
        return bassStep;
    }

    /**
     * Define el valor de la propiedad bassStep.
     * 
     * @param value
     *     allowed object is
     *     {@link BassStep }
     *     
     */
    public void setBassStep(BassStep value) {
        this.bassStep = value;
    }

    /**
     * Obtiene el valor de la propiedad bassAlter.
     * 
     * @return
     *     possible object is
     *     {@link BassAlter }
     *     
     */
    public BassAlter getBassAlter() {
        return bassAlter;
    }

    /**
     * Define el valor de la propiedad bassAlter.
     * 
     * @param value
     *     allowed object is
     *     {@link BassAlter }
     *     
     */
    public void setBassAlter(BassAlter value) {
        this.bassAlter = value;
    }

}

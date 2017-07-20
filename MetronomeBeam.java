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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * The metronome-beam type works like the beam type in defining metric relationships, but does not include all the attributes available in the beam type.
 * 
 * <p>Clase Java para metronome-beam complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="metronome-beam">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>beam-value">
 *       &lt;attribute name="number" type="{}beam-level" default="1" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metronome-beam", propOrder = {
    "value"
})
public class MetronomeBeam {

    @XmlValue
    protected BeamValue value;
    @XmlAttribute(name = "number")
    protected Integer number;

    /**
     * The beam-value type represents the type of beam associated with each of 8 beam levels (up to 1024th notes) available for each note.
     * 
     * @return
     *     possible object is
     *     {@link BeamValue }
     *     
     */
    public BeamValue getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link BeamValue }
     *     
     */
    public void setValue(BeamValue value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad number.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getNumber() {
        if (number == null) {
            return  1;
        } else {
            return number;
        }
    }

    /**
     * Define el valor de la propiedad number.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumber(Integer value) {
        this.number = value;
    }

}

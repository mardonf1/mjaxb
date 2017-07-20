//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.02 a las 03:52:44 PM EDT 
//


package mjaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The repeat type represents repeat marks. The start of the repeat has a forward direction while the end of the repeat has a backward direction. Backward repeats that are not part of an ending can use the times attribute to indicate the number of times the repeated section is played.
 * 
 * <p>Clase Java para repeat complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="repeat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="direction" use="required" type="{}backward-forward" />
 *       &lt;attribute name="times" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="winged" type="{}winged" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repeat")
public class Repeat {

    @XmlAttribute(name = "direction", required = true)
    protected BackwardForward direction;
    @XmlAttribute(name = "times")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger times;
    @XmlAttribute(name = "winged")
    protected Winged winged;

    /**
     * Obtiene el valor de la propiedad direction.
     * 
     * @return
     *     possible object is
     *     {@link BackwardForward }
     *     
     */
    public BackwardForward getDirection() {
        return direction;
    }

    /**
     * Define el valor de la propiedad direction.
     * 
     * @param value
     *     allowed object is
     *     {@link BackwardForward }
     *     
     */
    public void setDirection(BackwardForward value) {
        this.direction = value;
    }

    /**
     * Obtiene el valor de la propiedad times.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimes() {
        return times;
    }

    /**
     * Define el valor de la propiedad times.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimes(BigInteger value) {
        this.times = value;
    }

    /**
     * Obtiene el valor de la propiedad winged.
     * 
     * @return
     *     possible object is
     *     {@link Winged }
     *     
     */
    public Winged getWinged() {
        return winged;
    }

    /**
     * Define el valor de la propiedad winged.
     * 
     * @param value
     *     allowed object is
     *     {@link Winged }
     *     
     */
    public void setWinged(Winged value) {
        this.winged = value;
    }

}

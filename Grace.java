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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The grace type indicates the presence of a grace note. The slash attribute for a grace note is yes for slashed eighth notes. The other grace note attributes come from MuseData sound suggestions. The steal-time-previous attribute indicates the percentage of time to steal from the previous note for the grace note. The steal-time-following attribute indicates the percentage of time to steal from the following note for the grace note, as for appoggiaturas. The make-time attribute indicates to make time, not steal time; the units are in real-time divisions for the grace note.
 * 
 * <p>Clase Java para grace complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="grace">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="steal-time-previous" type="{}percent" />
 *       &lt;attribute name="steal-time-following" type="{}percent" />
 *       &lt;attribute name="make-time" type="{}divisions" />
 *       &lt;attribute name="slash" type="{}yes-no" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "grace")
public class Grace {

    @XmlAttribute(name = "steal-time-previous")
    protected BigDecimal stealTimePrevious;
    @XmlAttribute(name = "steal-time-following")
    protected BigDecimal stealTimeFollowing;
    @XmlAttribute(name = "make-time")
    protected BigDecimal makeTime;
    @XmlAttribute(name = "slash")
    protected YesNo slash;

    /**
     * Obtiene el valor de la propiedad stealTimePrevious.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStealTimePrevious() {
        return stealTimePrevious;
    }

    /**
     * Define el valor de la propiedad stealTimePrevious.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStealTimePrevious(BigDecimal value) {
        this.stealTimePrevious = value;
    }

    /**
     * Obtiene el valor de la propiedad stealTimeFollowing.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStealTimeFollowing() {
        return stealTimeFollowing;
    }

    /**
     * Define el valor de la propiedad stealTimeFollowing.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStealTimeFollowing(BigDecimal value) {
        this.stealTimeFollowing = value;
    }

    /**
     * Obtiene el valor de la propiedad makeTime.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMakeTime() {
        return makeTime;
    }

    /**
     * Define el valor de la propiedad makeTime.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMakeTime(BigDecimal value) {
        this.makeTime = value;
    }

    /**
     * Obtiene el valor de la propiedad slash.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getSlash() {
        return slash;
    }

    /**
     * Define el valor de la propiedad slash.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setSlash(YesNo value) {
        this.slash = value;
    }

}

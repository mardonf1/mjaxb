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
 * The hole-closed type represents whether the hole is closed, open, or half-open. The optional location attribute indicates which portion of the hole is filled in when the element value is half.
 * 
 * <p>Clase Java para hole-closed complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="hole-closed">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>hole-closed-value">
 *       &lt;attribute name="location" type="{}hole-closed-location" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hole-closed", propOrder = {
    "value"
})
public class HoleClosed {

    @XmlValue
    protected HoleClosedValue value;
    @XmlAttribute(name = "location")
    protected HoleClosedLocation location;

    /**
     * The hole-closed-value type represents whether the hole is closed, open, or half-open.
     * 
     * @return
     *     possible object is
     *     {@link HoleClosedValue }
     *     
     */
    public HoleClosedValue getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link HoleClosedValue }
     *     
     */
    public void setValue(HoleClosedValue value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad location.
     * 
     * @return
     *     possible object is
     *     {@link HoleClosedLocation }
     *     
     */
    public HoleClosedLocation getLocation() {
        return location;
    }

    /**
     * Define el valor de la propiedad location.
     * 
     * @param value
     *     allowed object is
     *     {@link HoleClosedLocation }
     *     
     */
    public void setLocation(HoleClosedLocation value) {
        this.location = value;
    }

}

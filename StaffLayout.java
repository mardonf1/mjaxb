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
import javax.xml.bind.annotation.XmlType;


/**
 * Staff layout includes the vertical distance from the bottom line of the previous staff in this system to the top line of the staff specified by the number attribute. The optional number attribute refers to staff numbers within the part, from top to bottom on the system. A value of 1 is assumed if not present. When used in the defaults element, the values apply to all parts. This value is ignored for the first staff in a system.
 * 
 * <p>Clase Java para staff-layout complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="staff-layout">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="staff-distance" type="{}tenths" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="number" type="{}staff-number" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "staff-layout", propOrder = {
    "staffDistance"
})
public class StaffLayout {

    @XmlElement(name = "staff-distance")
    protected BigDecimal staffDistance;
    @XmlAttribute(name = "number")
    protected BigInteger number;

    /**
     * Obtiene el valor de la propiedad staffDistance.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStaffDistance() {
        return staffDistance;
    }

    /**
     * Define el valor de la propiedad staffDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStaffDistance(BigDecimal value) {
        this.staffDistance = value;
    }

    /**
     * Obtiene el valor de la propiedad number.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Define el valor de la propiedad number.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

}

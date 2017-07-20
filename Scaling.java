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
import javax.xml.bind.annotation.XmlType;


/**
 * Margins, page sizes, and distances are all measured in tenths to keep MusicXML data in a consistent coordinate system as much as possible. The translation to absolute units is done with the scaling type, which specifies how many millimeters are equal to how many tenths. For a staff height of 7 mm, millimeters would be set to 7 while tenths is set to 40. The ability to set a formula rather than a single scaling factor helps avoid roundoff errors.
 * 
 * <p>Clase Java para scaling complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="scaling">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="millimeters" type="{}millimeters"/>
 *         &lt;element name="tenths" type="{}tenths"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scaling", propOrder = {
    "millimeters",
    "tenths"
})
public class Scaling {

    @XmlElement(required = true)
    protected BigDecimal millimeters;
    @XmlElement(required = true)
    protected BigDecimal tenths;

    /**
     * Obtiene el valor de la propiedad millimeters.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMillimeters() {
        return millimeters;
    }

    /**
     * Define el valor de la propiedad millimeters.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMillimeters(BigDecimal value) {
        this.millimeters = value;
    }

    /**
     * Obtiene el valor de la propiedad tenths.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTenths() {
        return tenths;
    }

    /**
     * Define el valor de la propiedad tenths.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTenths(BigDecimal value) {
        this.tenths = value;
    }

}

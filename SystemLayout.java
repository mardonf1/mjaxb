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
 * A system is a group of staves that are read and played simultaneously. System layout includes left and right margins and the vertical distance from the previous system. The system distance is measured from the bottom line of the previous system to the top line of the current system. It is ignored for the first system on a page. The top system distance is measured from the page's top margin to the top line of the first system. It is ignored for all but the first system on a page.
 * 	
 * Sometimes the sum of measure widths in a system may not equal the system width specified by the layout elements due to roundoff or other errors. The behavior when reading MusicXML files in these cases is application-dependent. For instance, applications may find that the system layout data is more reliable than the sum of the measure widths, and adjust the measure widths accordingly.
 * 
 * <p>Clase Java para system-layout complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="system-layout">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="system-margins" type="{}system-margins" minOccurs="0"/>
 *         &lt;element name="system-distance" type="{}tenths" minOccurs="0"/>
 *         &lt;element name="top-system-distance" type="{}tenths" minOccurs="0"/>
 *         &lt;element name="system-dividers" type="{}system-dividers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "system-layout", propOrder = {
    "systemMargins",
    "systemDistance",
    "topSystemDistance",
    "systemDividers"
})
public class SystemLayout {

    @XmlElement(name = "system-margins")
    protected SystemMargins systemMargins;
    @XmlElement(name = "system-distance")
    protected BigDecimal systemDistance;
    @XmlElement(name = "top-system-distance")
    protected BigDecimal topSystemDistance;
    @XmlElement(name = "system-dividers")
    protected SystemDividers systemDividers;

    /**
     * Obtiene el valor de la propiedad systemMargins.
     * 
     * @return
     *     possible object is
     *     {@link SystemMargins }
     *     
     */
    public SystemMargins getSystemMargins() {
        return systemMargins;
    }

    /**
     * Define el valor de la propiedad systemMargins.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemMargins }
     *     
     */
    public void setSystemMargins(SystemMargins value) {
        this.systemMargins = value;
    }

    /**
     * Obtiene el valor de la propiedad systemDistance.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSystemDistance() {
        return systemDistance;
    }

    /**
     * Define el valor de la propiedad systemDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSystemDistance(BigDecimal value) {
        this.systemDistance = value;
    }

    /**
     * Obtiene el valor de la propiedad topSystemDistance.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTopSystemDistance() {
        return topSystemDistance;
    }

    /**
     * Define el valor de la propiedad topSystemDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTopSystemDistance(BigDecimal value) {
        this.topSystemDistance = value;
    }

    /**
     * Obtiene el valor de la propiedad systemDividers.
     * 
     * @return
     *     possible object is
     *     {@link SystemDividers }
     *     
     */
    public SystemDividers getSystemDividers() {
        return systemDividers;
    }

    /**
     * Define el valor de la propiedad systemDividers.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDividers }
     *     
     */
    public void setSystemDividers(SystemDividers value) {
        this.systemDividers = value;
    }

}

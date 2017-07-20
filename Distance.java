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
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The distance element represents standard distances between notation elements in tenths. The type attribute defines what type of distance is being defined. Valid values include hyphen (for hyphens in lyrics) and beam.
 * 
 * <p>Clase Java para distance complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="distance">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>tenths">
 *       &lt;attribute name="type" use="required" type="{}distance-type" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "distance", propOrder = {
    "value"
})
public class Distance {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String type;

    /**
     * The tenths type is a number representing tenths of interline staff space (positive or negative). Both integer and decimal values are allowed, such as 5 for a half space and 2.5 for a quarter space. Interline space is measured from the middle of a staff line.
     * 
     * Distances in a MusicXML file are measured in tenths of staff space. Tenths are then scaled to millimeters within the scaling element, used in the defaults element at the start of a score. Individual staves can apply a scaling factor to adjust staff size. When a MusicXML element or attribute refers to tenths, it means the global tenths defined by the scaling element, not the local tenths as adjusted by the staff-size element.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setType(java.lang.String value) {
        this.type = value;
    }

}

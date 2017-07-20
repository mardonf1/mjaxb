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
 * System margins are relative to the page margins. Positive values indent and negative values reduce the margin size.
 * 
 * <p>Clase Java para system-margins complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="system-margins">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{}left-right-margins"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "system-margins", propOrder = {
    "leftMargin",
    "rightMargin"
})
public class SystemMargins {

    @XmlElement(name = "left-margin", required = true)
    protected BigDecimal leftMargin;
    @XmlElement(name = "right-margin", required = true)
    protected BigDecimal rightMargin;

    /**
     * Obtiene el valor de la propiedad leftMargin.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLeftMargin() {
        return leftMargin;
    }

    /**
     * Define el valor de la propiedad leftMargin.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLeftMargin(BigDecimal value) {
        this.leftMargin = value;
    }

    /**
     * Obtiene el valor de la propiedad rightMargin.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRightMargin() {
        return rightMargin;
    }

    /**
     * Define el valor de la propiedad rightMargin.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRightMargin(BigDecimal value) {
        this.rightMargin = value;
    }

}

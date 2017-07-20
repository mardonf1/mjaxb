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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Page margins are specified either for both even and odd pages, or via separate odd and even page number values. The type attribute is not needed when used as part of a print element. If omitted when the page-margins type is used in the defaults element, "both" is the default value.
 * 
 * <p>Clase Java para page-margins complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="page-margins">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{}all-margins"/>
 *       &lt;attribute name="type" type="{}margin-type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "page-margins", propOrder = {
    "leftMargin",
    "rightMargin",
    "topMargin",
    "bottomMargin"
})
public class PageMargins {

    @XmlElement(name = "left-margin", required = true)
    protected BigDecimal leftMargin;
    @XmlElement(name = "right-margin", required = true)
    protected BigDecimal rightMargin;
    @XmlElement(name = "top-margin", required = true)
    protected BigDecimal topMargin;
    @XmlElement(name = "bottom-margin", required = true)
    protected BigDecimal bottomMargin;
    @XmlAttribute(name = "type")
    protected MarginType type;

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

    /**
     * Obtiene el valor de la propiedad topMargin.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTopMargin() {
        return topMargin;
    }

    /**
     * Define el valor de la propiedad topMargin.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTopMargin(BigDecimal value) {
        this.topMargin = value;
    }

    /**
     * Obtiene el valor de la propiedad bottomMargin.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBottomMargin() {
        return bottomMargin;
    }

    /**
     * Define el valor de la propiedad bottomMargin.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBottomMargin(BigDecimal value) {
        this.bottomMargin = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link MarginType }
     *     
     */
    public MarginType getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginType }
     *     
     */
    public void setType(MarginType value) {
        this.type = value;
    }

}

//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.02 a las 03:52:44 PM EDT 
//


package mjaxb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Page layout can be defined both in score-wide defaults and in the print element. Page margins are specified either for both even and odd pages, or via separate odd and even page number values. The type is not needed when used as part of a print element. If omitted when used in the defaults element, "both" is the default.
 * 
 * <p>Clase Java para page-layout complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="page-layout">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="page-height" type="{}tenths"/>
 *           &lt;element name="page-width" type="{}tenths"/>
 *         &lt;/sequence>
 *         &lt;element name="page-margins" type="{}page-margins" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "page-layout", propOrder = {
    "pageHeight",
    "pageWidth",
    "pageMargins"
})
public class PageLayout {

    @XmlElement(name = "page-height")
    protected BigDecimal pageHeight;
    @XmlElement(name = "page-width")
    protected BigDecimal pageWidth;
    @XmlElement(name = "page-margins")
    protected List<PageMargins> pageMargins;

    /**
     * Obtiene el valor de la propiedad pageHeight.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPageHeight() {
        return pageHeight;
    }

    /**
     * Define el valor de la propiedad pageHeight.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPageHeight(BigDecimal value) {
        this.pageHeight = value;
    }

    /**
     * Obtiene el valor de la propiedad pageWidth.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPageWidth() {
        return pageWidth;
    }

    /**
     * Define el valor de la propiedad pageWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPageWidth(BigDecimal value) {
        this.pageWidth = value;
    }

    /**
     * Gets the value of the pageMargins property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pageMargins property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPageMargins().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PageMargins }
     * 
     * 
     */
    public List<PageMargins> getPageMargins() {
        if (pageMargins == null) {
            pageMargins = new ArrayList<PageMargins>();
        }
        return this.pageMargins;
    }

}

//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.02 a las 03:52:44 PM EDT 
//


package mjaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Works are optionally identified by number and title. The work type also may indicate a link to the opus document that composes multiple scores into a collection.
 * 
 * <p>Clase Java para work complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="work">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="work-number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="work-title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opus" type="{}opus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "work", propOrder = {
    "workNumber",
    "workTitle",
    "opus"
})
public class Work {

    @XmlElement(name = "work-number")
    protected java.lang.String workNumber;
    @XmlElement(name = "work-title")
    protected java.lang.String workTitle;
    protected Opus opus;

    /**
     * Obtiene el valor de la propiedad workNumber.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getWorkNumber() {
        return workNumber;
    }

    /**
     * Define el valor de la propiedad workNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setWorkNumber(java.lang.String value) {
        this.workNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad workTitle.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getWorkTitle() {
        return workTitle;
    }

    /**
     * Define el valor de la propiedad workTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setWorkTitle(java.lang.String value) {
        this.workTitle = value;
    }

    /**
     * Obtiene el valor de la propiedad opus.
     * 
     * @return
     *     possible object is
     *     {@link Opus }
     *     
     */
    public Opus getOpus() {
        return opus;
    }

    /**
     * Define el valor de la propiedad opus.
     * 
     * @param value
     *     allowed object is
     *     {@link Opus }
     *     
     */
    public void setOpus(Opus value) {
        this.opus = value;
    }

}
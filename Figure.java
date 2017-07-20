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
 * The figure type represents a single figure within a figured-bass element.
 * 
 * <p>Clase Java para figure complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="figure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prefix" type="{}style-text" minOccurs="0"/>
 *         &lt;element name="figure-number" type="{}style-text" minOccurs="0"/>
 *         &lt;element name="suffix" type="{}style-text" minOccurs="0"/>
 *         &lt;element name="extend" type="{}extend" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "figure", propOrder = {
    "prefix",
    "figureNumber",
    "suffix",
    "extend"
})
public class Figure {

    protected StyleText prefix;
    @XmlElement(name = "figure-number")
    protected StyleText figureNumber;
    protected StyleText suffix;
    protected Extend extend;

    /**
     * Obtiene el valor de la propiedad prefix.
     * 
     * @return
     *     possible object is
     *     {@link StyleText }
     *     
     */
    public StyleText getPrefix() {
        return prefix;
    }

    /**
     * Define el valor de la propiedad prefix.
     * 
     * @param value
     *     allowed object is
     *     {@link StyleText }
     *     
     */
    public void setPrefix(StyleText value) {
        this.prefix = value;
    }

    /**
     * Obtiene el valor de la propiedad figureNumber.
     * 
     * @return
     *     possible object is
     *     {@link StyleText }
     *     
     */
    public StyleText getFigureNumber() {
        return figureNumber;
    }

    /**
     * Define el valor de la propiedad figureNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link StyleText }
     *     
     */
    public void setFigureNumber(StyleText value) {
        this.figureNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad suffix.
     * 
     * @return
     *     possible object is
     *     {@link StyleText }
     *     
     */
    public StyleText getSuffix() {
        return suffix;
    }

    /**
     * Define el valor de la propiedad suffix.
     * 
     * @param value
     *     allowed object is
     *     {@link StyleText }
     *     
     */
    public void setSuffix(StyleText value) {
        this.suffix = value;
    }

    /**
     * Obtiene el valor de la propiedad extend.
     * 
     * @return
     *     possible object is
     *     {@link Extend }
     *     
     */
    public Extend getExtend() {
        return extend;
    }

    /**
     * Define el valor de la propiedad extend.
     * 
     * @param value
     *     allowed object is
     *     {@link Extend }
     *     
     */
    public void setExtend(Extend value) {
        this.extend = value;
    }

}

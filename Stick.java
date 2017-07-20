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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The stick type represents pictograms where the material of the stick, mallet, or beater is included.
 * 
 * <p>Clase Java para stick complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="stick">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stick-type" type="{}stick-type"/>
 *         &lt;element name="stick-material" type="{}stick-material"/>
 *       &lt;/sequence>
 *       &lt;attribute name="tip" type="{}tip-direction" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stick", propOrder = {
    "stickType",
    "stickMaterial"
})
public class Stick {

    @XmlElement(name = "stick-type", required = true)
    @XmlSchemaType(name = "string")
    protected StickType stickType;
    @XmlElement(name = "stick-material", required = true)
    @XmlSchemaType(name = "string")
    protected StickMaterial stickMaterial;
    @XmlAttribute(name = "tip")
    protected TipDirection tip;

    /**
     * Obtiene el valor de la propiedad stickType.
     * 
     * @return
     *     possible object is
     *     {@link StickType }
     *     
     */
    public StickType getStickType() {
        return stickType;
    }

    /**
     * Define el valor de la propiedad stickType.
     * 
     * @param value
     *     allowed object is
     *     {@link StickType }
     *     
     */
    public void setStickType(StickType value) {
        this.stickType = value;
    }

    /**
     * Obtiene el valor de la propiedad stickMaterial.
     * 
     * @return
     *     possible object is
     *     {@link StickMaterial }
     *     
     */
    public StickMaterial getStickMaterial() {
        return stickMaterial;
    }

    /**
     * Define el valor de la propiedad stickMaterial.
     * 
     * @param value
     *     allowed object is
     *     {@link StickMaterial }
     *     
     */
    public void setStickMaterial(StickMaterial value) {
        this.stickMaterial = value;
    }

    /**
     * Obtiene el valor de la propiedad tip.
     * 
     * @return
     *     possible object is
     *     {@link TipDirection }
     *     
     */
    public TipDirection getTip() {
        return tip;
    }

    /**
     * Define el valor de la propiedad tip.
     * 
     * @param value
     *     allowed object is
     *     {@link TipDirection }
     *     
     */
    public void setTip(TipDirection value) {
        this.tip = value;
    }

}

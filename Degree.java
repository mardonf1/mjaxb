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
import javax.xml.bind.annotation.XmlType;


/**
 * The degree type is used to add, alter, or subtract individual notes in the chord. The print-object attribute can be used to keep the degree from printing separately when it has already taken into account in the text attribute of the kind element. The degree-value and degree-type text attributes specify how the value and type of the degree should be displayed.
 * 	
 * A harmony of kind "other" can be spelled explicitly by using a series of degree elements together with a root.
 * 
 * <p>Clase Java para degree complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="degree">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="degree-value" type="{}degree-value"/>
 *         &lt;element name="degree-alter" type="{}degree-alter"/>
 *         &lt;element name="degree-type" type="{}degree-type"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}print-object"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "degree", propOrder = {
    "degreeValue",
    "degreeAlter",
    "degreeType"
})
public class Degree {

    @XmlElement(name = "degree-value", required = true)
    protected DegreeValue degreeValue;
    @XmlElement(name = "degree-alter", required = true)
    protected DegreeAlter degreeAlter;
    @XmlElement(name = "degree-type", required = true)
    protected DegreeType degreeType;
    @XmlAttribute(name = "print-object")
    protected YesNo printObject;

    /**
     * Obtiene el valor de la propiedad degreeValue.
     * 
     * @return
     *     possible object is
     *     {@link DegreeValue }
     *     
     */
    public DegreeValue getDegreeValue() {
        return degreeValue;
    }

    /**
     * Define el valor de la propiedad degreeValue.
     * 
     * @param value
     *     allowed object is
     *     {@link DegreeValue }
     *     
     */
    public void setDegreeValue(DegreeValue value) {
        this.degreeValue = value;
    }

    /**
     * Obtiene el valor de la propiedad degreeAlter.
     * 
     * @return
     *     possible object is
     *     {@link DegreeAlter }
     *     
     */
    public DegreeAlter getDegreeAlter() {
        return degreeAlter;
    }

    /**
     * Define el valor de la propiedad degreeAlter.
     * 
     * @param value
     *     allowed object is
     *     {@link DegreeAlter }
     *     
     */
    public void setDegreeAlter(DegreeAlter value) {
        this.degreeAlter = value;
    }

    /**
     * Obtiene el valor de la propiedad degreeType.
     * 
     * @return
     *     possible object is
     *     {@link DegreeType }
     *     
     */
    public DegreeType getDegreeType() {
        return degreeType;
    }

    /**
     * Define el valor de la propiedad degreeType.
     * 
     * @param value
     *     allowed object is
     *     {@link DegreeType }
     *     
     */
    public void setDegreeType(DegreeType value) {
        this.degreeType = value;
    }

    /**
     * Obtiene el valor de la propiedad printObject.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getPrintObject() {
        return printObject;
    }

    /**
     * Define el valor de la propiedad printObject.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setPrintObject(YesNo value) {
        this.printObject = value;
    }

}

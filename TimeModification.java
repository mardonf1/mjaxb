//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.02 a las 03:52:44 PM EDT 
//


package mjaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Time modification indicates tuplets, double-note tremolos, and other durational changes. A time-modification element shows how the cumulative, sounding effect of tuplets and double-note tremolos compare to the written note type represented by the type and dot elements. Nested tuplets and other notations that use more detailed information need both the time-modification and tuplet elements to be represented accurately.
 * 
 * <p>Clase Java para time-modification complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="time-modification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actual-notes" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="normal-notes" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="normal-type" type="{}note-type-value"/>
 *           &lt;element name="normal-dot" type="{}empty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "time-modification", propOrder = {
    "actualNotes",
    "normalNotes",
    "normalType",
    "normalDot"
})
@XmlSeeAlso({
    MetronomeTuplet.class
})
public class TimeModification {

    @XmlElement(name = "actual-notes", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger actualNotes;
    @XmlElement(name = "normal-notes", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger normalNotes;
    @XmlElement(name = "normal-type")
    protected java.lang.String normalType;
    @XmlElement(name = "normal-dot")
    protected List<Empty> normalDot;

    /**
     * Obtiene el valor de la propiedad actualNotes.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActualNotes() {
        return actualNotes;
    }

    /**
     * Define el valor de la propiedad actualNotes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActualNotes(BigInteger value) {
        this.actualNotes = value;
    }

    /**
     * Obtiene el valor de la propiedad normalNotes.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNormalNotes() {
        return normalNotes;
    }

    /**
     * Define el valor de la propiedad normalNotes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNormalNotes(BigInteger value) {
        this.normalNotes = value;
    }

    /**
     * Obtiene el valor de la propiedad normalType.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getNormalType() {
        return normalType;
    }

    /**
     * Define el valor de la propiedad normalType.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNormalType(java.lang.String value) {
        this.normalType = value;
    }

    /**
     * Gets the value of the normalDot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the normalDot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNormalDot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Empty }
     * 
     * 
     */
    public List<Empty> getNormalDot() {
        if (normalDot == null) {
            normalDot = new ArrayList<Empty>();
        }
        return this.normalDot;
    }

}

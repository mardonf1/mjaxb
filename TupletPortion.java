//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.02 a las 03:52:44 PM EDT 
//


package mjaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The tuplet-portion type provides optional full control over tuplet specifications. It allows the number and note type (including dots) to be set for the actual and normal portions of a single tuplet. If any of these elements are absent, their values are based on the time-modification element.
 * 
 * <p>Clase Java para tuplet-portion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tuplet-portion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tuplet-number" type="{}tuplet-number" minOccurs="0"/>
 *         &lt;element name="tuplet-type" type="{}tuplet-type" minOccurs="0"/>
 *         &lt;element name="tuplet-dot" type="{}tuplet-dot" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tuplet-portion", propOrder = {
    "tupletNumber",
    "tupletType",
    "tupletDot"
})
public class TupletPortion {

    @XmlElement(name = "tuplet-number")
    protected TupletNumber tupletNumber;
    @XmlElement(name = "tuplet-type")
    protected TupletType tupletType;
    @XmlElement(name = "tuplet-dot")
    protected List<TupletDot> tupletDot;

    /**
     * Obtiene el valor de la propiedad tupletNumber.
     * 
     * @return
     *     possible object is
     *     {@link TupletNumber }
     *     
     */
    public TupletNumber getTupletNumber() {
        return tupletNumber;
    }

    /**
     * Define el valor de la propiedad tupletNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link TupletNumber }
     *     
     */
    public void setTupletNumber(TupletNumber value) {
        this.tupletNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad tupletType.
     * 
     * @return
     *     possible object is
     *     {@link TupletType }
     *     
     */
    public TupletType getTupletType() {
        return tupletType;
    }

    /**
     * Define el valor de la propiedad tupletType.
     * 
     * @param value
     *     allowed object is
     *     {@link TupletType }
     *     
     */
    public void setTupletType(TupletType value) {
        this.tupletType = value;
    }

    /**
     * Gets the value of the tupletDot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tupletDot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTupletDot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TupletDot }
     * 
     * 
     */
    public List<TupletDot> getTupletDot() {
        if (tupletDot == null) {
            tupletDot = new ArrayList<TupletDot>();
        }
        return this.tupletDot;
    }

}

//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.02 a las 03:52:44 PM EDT 
//


package mjaxb;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The transpose type represents what must be added to a written pitch to get a correct sounding pitch. The optional number attribute refers to staff numbers, from top to bottom on the system. If absent, the transposition applies to all staves in the part. Per-staff transposition is most often used in parts that represent multiple instruments.
 * 
 * <p>Clase Java para transpose complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="transpose">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diatonic" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="chromatic" type="{}semitones"/>
 *         &lt;element name="octave-change" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="double" type="{}empty" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="number" type="{}staff-number" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transpose", propOrder = {
    "diatonic",
    "chromatic",
    "octaveChange",
    "_double"
})
public class Transpose {

    protected BigInteger diatonic;
    @XmlElement(required = true)
    protected BigDecimal chromatic;
    @XmlElement(name = "octave-change")
    protected BigInteger octaveChange;
    @XmlElement(name = "double")
    protected Empty _double;
    @XmlAttribute(name = "number")
    protected BigInteger number;

    /**
     * Obtiene el valor de la propiedad diatonic.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiatonic() {
        return diatonic;
    }

    /**
     * Define el valor de la propiedad diatonic.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiatonic(BigInteger value) {
        this.diatonic = value;
    }

    /**
     * Obtiene el valor de la propiedad chromatic.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChromatic() {
        return chromatic;
    }

    /**
     * Define el valor de la propiedad chromatic.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChromatic(BigDecimal value) {
        this.chromatic = value;
    }

    /**
     * Obtiene el valor de la propiedad octaveChange.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOctaveChange() {
        return octaveChange;
    }

    /**
     * Define el valor de la propiedad octaveChange.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOctaveChange(BigInteger value) {
        this.octaveChange = value;
    }

    /**
     * Obtiene el valor de la propiedad double.
     * 
     * @return
     *     possible object is
     *     {@link Empty }
     *     
     */
    public Empty getDouble() {
        return _double;
    }

    /**
     * Define el valor de la propiedad double.
     * 
     * @param value
     *     allowed object is
     *     {@link Empty }
     *     
     */
    public void setDouble(Empty value) {
        this._double = value;
    }

    /**
     * Obtiene el valor de la propiedad number.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Define el valor de la propiedad number.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

}

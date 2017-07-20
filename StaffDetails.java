//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.02 a las 03:52:44 PM EDT 
//


package mjaxb;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The staff-details element is used to indicate different types of staves. The optional number attribute specifies the staff number from top to bottom on the system, as with clef. The print-object attribute is used to indicate when a staff is not printed in a part, usually in large scores where empty parts are omitted. It is yes by default. If print-spacing is yes while print-object is no, the score is printed in cutaway format where vertical space is left for the empty part.
 * 
 * <p>Clase Java para staff-details complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="staff-details">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="staff-type" type="{}staff-type" minOccurs="0"/>
 *         &lt;element name="staff-lines" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="staff-tuning" type="{}staff-tuning" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="capo" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="staff-size" type="{}non-negative-decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}print-object"/>
 *       &lt;attGroup ref="{}print-spacing"/>
 *       &lt;attribute name="number" type="{}staff-number" />
 *       &lt;attribute name="show-frets" type="{}show-frets" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "staff-details", propOrder = {
    "staffType",
    "staffLines",
    "staffTuning",
    "capo",
    "staffSize"
})
public class StaffDetails {

    @XmlElement(name = "staff-type")
    @XmlSchemaType(name = "string")
    protected StaffType staffType;
    @XmlElement(name = "staff-lines")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger staffLines;
    @XmlElement(name = "staff-tuning")
    protected List<StaffTuning> staffTuning;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger capo;
    @XmlElement(name = "staff-size")
    protected BigDecimal staffSize;
    @XmlAttribute(name = "number")
    protected BigInteger number;
    @XmlAttribute(name = "show-frets")
    protected ShowFrets showFrets;
    @XmlAttribute(name = "print-object")
    protected YesNo printObject;
    @XmlAttribute(name = "print-spacing")
    protected YesNo printSpacing;

    /**
     * Obtiene el valor de la propiedad staffType.
     * 
     * @return
     *     possible object is
     *     {@link StaffType }
     *     
     */
    public StaffType getStaffType() {
        return staffType;
    }

    /**
     * Define el valor de la propiedad staffType.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffType }
     *     
     */
    public void setStaffType(StaffType value) {
        this.staffType = value;
    }

    /**
     * Obtiene el valor de la propiedad staffLines.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStaffLines() {
        return staffLines;
    }

    /**
     * Define el valor de la propiedad staffLines.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStaffLines(BigInteger value) {
        this.staffLines = value;
    }

    /**
     * Gets the value of the staffTuning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staffTuning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaffTuning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StaffTuning }
     * 
     * 
     */
    public List<StaffTuning> getStaffTuning() {
        if (staffTuning == null) {
            staffTuning = new ArrayList<StaffTuning>();
        }
        return this.staffTuning;
    }

    /**
     * Obtiene el valor de la propiedad capo.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCapo() {
        return capo;
    }

    /**
     * Define el valor de la propiedad capo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCapo(BigInteger value) {
        this.capo = value;
    }

    /**
     * Obtiene el valor de la propiedad staffSize.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStaffSize() {
        return staffSize;
    }

    /**
     * Define el valor de la propiedad staffSize.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStaffSize(BigDecimal value) {
        this.staffSize = value;
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

    /**
     * Obtiene el valor de la propiedad showFrets.
     * 
     * @return
     *     possible object is
     *     {@link ShowFrets }
     *     
     */
    public ShowFrets getShowFrets() {
        return showFrets;
    }

    /**
     * Define el valor de la propiedad showFrets.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowFrets }
     *     
     */
    public void setShowFrets(ShowFrets value) {
        this.showFrets = value;
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

    /**
     * Obtiene el valor de la propiedad printSpacing.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getPrintSpacing() {
        return printSpacing;
    }

    /**
     * Define el valor de la propiedad printSpacing.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setPrintSpacing(YesNo value) {
        this.printSpacing = value;
    }

}

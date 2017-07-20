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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The backup and forward elements are required to coordinate multiple voices in one part, including music on multiple staves. The forward element is generally used within voices and staves. Duration values should always be positive, and should not cross measure boundaries or mid-measure changes in the divisions value.
 * 
 * <p>Clase Java para forward complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="forward">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{}duration"/>
 *         &lt;group ref="{}editorial-voice"/>
 *         &lt;group ref="{}staff" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "forward", propOrder = {
    "duration",
    "footnote",
    "level",
    "voice",
    "staff"
})
public class Forward {

    @XmlElement(required = true)
    protected BigDecimal duration;
    protected FormattedText footnote;
    protected Level level;
    protected java.lang.String voice;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger staff;

    /**
     * Obtiene el valor de la propiedad duration.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDuration() {
        return duration;
    }

    /**
     * Define el valor de la propiedad duration.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDuration(BigDecimal value) {
        this.duration = value;
    }

    /**
     * Obtiene el valor de la propiedad footnote.
     * 
     * @return
     *     possible object is
     *     {@link FormattedText }
     *     
     */
    public FormattedText getFootnote() {
        return footnote;
    }

    /**
     * Define el valor de la propiedad footnote.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedText }
     *     
     */
    public void setFootnote(FormattedText value) {
        this.footnote = value;
    }

    /**
     * Obtiene el valor de la propiedad level.
     * 
     * @return
     *     possible object is
     *     {@link Level }
     *     
     */
    public Level getLevel() {
        return level;
    }

    /**
     * Define el valor de la propiedad level.
     * 
     * @param value
     *     allowed object is
     *     {@link Level }
     *     
     */
    public void setLevel(Level value) {
        this.level = value;
    }

    /**
     * Obtiene el valor de la propiedad voice.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getVoice() {
        return voice;
    }

    /**
     * Define el valor de la propiedad voice.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setVoice(java.lang.String value) {
        this.voice = value;
    }

    /**
     * Obtiene el valor de la propiedad staff.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStaff() {
        return staff;
    }

    /**
     * Define el valor de la propiedad staff.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStaff(BigInteger value) {
        this.staff = value;
    }

}

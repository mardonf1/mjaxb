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
import javax.xml.bind.annotation.XmlType;


/**
 * The mordent type is used for both represents the mordent sign with the vertical line and the inverted-mordent sign without the line. The long attribute is "no" by default. The approach and departure attributes are used for compound ornaments, indicating how the beginning and ending of the ornament look relative to the main part of the mordent.
 * 
 * <p>Clase Java para mordent complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mordent">
 *   &lt;complexContent>
 *     &lt;extension base="{}empty-trill-sound">
 *       &lt;attribute name="long" type="{}yes-no" />
 *       &lt;attribute name="approach" type="{}above-below" />
 *       &lt;attribute name="departure" type="{}above-below" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mordent")
public class Mordent
    extends EmptyTrillSound
{

    @XmlAttribute(name = "long")
    protected YesNo _long;
    @XmlAttribute(name = "approach")
    protected AboveBelow approach;
    @XmlAttribute(name = "departure")
    protected AboveBelow departure;

    /**
     * Obtiene el valor de la propiedad long.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getLong() {
        return _long;
    }

    /**
     * Define el valor de la propiedad long.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setLong(YesNo value) {
        this._long = value;
    }

    /**
     * Obtiene el valor de la propiedad approach.
     * 
     * @return
     *     possible object is
     *     {@link AboveBelow }
     *     
     */
    public AboveBelow getApproach() {
        return approach;
    }

    /**
     * Define el valor de la propiedad approach.
     * 
     * @param value
     *     allowed object is
     *     {@link AboveBelow }
     *     
     */
    public void setApproach(AboveBelow value) {
        this.approach = value;
    }

    /**
     * Obtiene el valor de la propiedad departure.
     * 
     * @return
     *     possible object is
     *     {@link AboveBelow }
     *     
     */
    public AboveBelow getDeparture() {
        return departure;
    }

    /**
     * Define el valor de la propiedad departure.
     * 
     * @param value
     *     allowed object is
     *     {@link AboveBelow }
     *     
     */
    public void setDeparture(AboveBelow value) {
        this.departure = value;
    }

}

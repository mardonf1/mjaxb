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
 * The metronome-tuplet type uses the same element structure as the time-modification element along with some attributes from the tuplet element.
 * 
 * <p>Clase Java para metronome-tuplet complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="metronome-tuplet">
 *   &lt;complexContent>
 *     &lt;extension base="{}time-modification">
 *       &lt;attribute name="type" use="required" type="{}start-stop" />
 *       &lt;attribute name="bracket" type="{}yes-no" />
 *       &lt;attribute name="show-number" type="{}show-tuplet" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metronome-tuplet")
public class MetronomeTuplet
    extends TimeModification
{

    @XmlAttribute(name = "type", required = true)
    protected StartStop type;
    @XmlAttribute(name = "bracket")
    protected YesNo bracket;
    @XmlAttribute(name = "show-number")
    protected ShowTuplet showNumber;

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link StartStop }
     *     
     */
    public StartStop getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link StartStop }
     *     
     */
    public void setType(StartStop value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad bracket.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getBracket() {
        return bracket;
    }

    /**
     * Define el valor de la propiedad bracket.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setBracket(YesNo value) {
        this.bracket = value;
    }

    /**
     * Obtiene el valor de la propiedad showNumber.
     * 
     * @return
     *     possible object is
     *     {@link ShowTuplet }
     *     
     */
    public ShowTuplet getShowNumber() {
        return showNumber;
    }

    /**
     * Define el valor de la propiedad showNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowTuplet }
     *     
     */
    public void setShowNumber(ShowTuplet value) {
        this.showNumber = value;
    }

}

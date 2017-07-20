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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * The part-list identifies the different musical parts in this movement. Each part has an ID that is used later within the musical data. Since parts may be encoded separately and combined later, identification elements are present at both the score and score-part levels. There must be at least one score-part, combined as desired with part-group elements that indicate braces and brackets. Parts are ordered from top to bottom in a score based on the order in which they appear in the part-list.
 * 
 * <p>Clase Java para part-list complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="part-list">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{}part-group" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{}score-part"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;group ref="{}part-group"/>
 *           &lt;group ref="{}score-part"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "part-list", propOrder = {
    "partGroup",
    "scorePart",
    "partGroupOrScorePart"
})
public class PartList {

    @XmlElement(name = "part-group")
    protected List<PartGroup> partGroup;
    @XmlElement(name = "score-part", required = true)
    protected ScorePart scorePart;
    @XmlElements({
        @XmlElement(name = "part-group", type = PartGroup.class),
        @XmlElement(name = "score-part", type = ScorePart.class)
    })
    protected List<Object> partGroupOrScorePart;

    /**
     * Gets the value of the partGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartGroup }
     * 
     * 
     */
    public List<PartGroup> getPartGroup() {
        if (partGroup == null) {
            partGroup = new ArrayList<PartGroup>();
        }
        return this.partGroup;
    }

    /**
     * Obtiene el valor de la propiedad scorePart.
     * 
     * @return
     *     possible object is
     *     {@link ScorePart }
     *     
     */
    public ScorePart getScorePart() {
        return scorePart;
    }

    /**
     * Define el valor de la propiedad scorePart.
     * 
     * @param value
     *     allowed object is
     *     {@link ScorePart }
     *     
     */
    public void setScorePart(ScorePart value) {
        this.scorePart = value;
    }

    /**
     * Gets the value of the partGroupOrScorePart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partGroupOrScorePart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartGroupOrScorePart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartGroup }
     * {@link ScorePart }
     * 
     * 
     */
    public List<Object> getPartGroupOrScorePart() {
        if (partGroupOrScorePart == null) {
            partGroupOrScorePart = new ArrayList<Object>();
        }
        return this.partGroupOrScorePart;
    }

}

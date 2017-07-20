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
import javax.xml.bind.annotation.XmlType;


/**
 * Identification contains basic metadata about the score. It includes the information in MuseData headers that may apply at a score-wide, movement-wide, or part-wide level. The creator, rights, source, and relation elements are based on Dublin Core.
 * 
 * <p>Clase Java para identification complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="identification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creator" type="{}typed-text" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rights" type="{}typed-text" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="encoding" type="{}encoding" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relation" type="{}typed-text" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="miscellaneous" type="{}miscellaneous" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identification", propOrder = {
    "creator",
    "rights",
    "encoding",
    "source",
    "relation",
    "miscellaneous"
})
public class Identification {

    protected List<TypedText> creator;
    protected List<TypedText> rights;
    protected Encoding encoding;
    protected java.lang.String source;
    protected List<TypedText> relation;
    protected Miscellaneous miscellaneous;

    /**
     * Gets the value of the creator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypedText }
     * 
     * 
     */
    public List<TypedText> getCreator() {
        if (creator == null) {
            creator = new ArrayList<TypedText>();
        }
        return this.creator;
    }

    /**
     * Gets the value of the rights property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rights property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRights().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypedText }
     * 
     * 
     */
    public List<TypedText> getRights() {
        if (rights == null) {
            rights = new ArrayList<TypedText>();
        }
        return this.rights;
    }

    /**
     * Obtiene el valor de la propiedad encoding.
     * 
     * @return
     *     possible object is
     *     {@link Encoding }
     *     
     */
    public Encoding getEncoding() {
        return encoding;
    }

    /**
     * Define el valor de la propiedad encoding.
     * 
     * @param value
     *     allowed object is
     *     {@link Encoding }
     *     
     */
    public void setEncoding(Encoding value) {
        this.encoding = value;
    }

    /**
     * Obtiene el valor de la propiedad source.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSource() {
        return source;
    }

    /**
     * Define el valor de la propiedad source.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSource(java.lang.String value) {
        this.source = value;
    }

    /**
     * Gets the value of the relation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypedText }
     * 
     * 
     */
    public List<TypedText> getRelation() {
        if (relation == null) {
            relation = new ArrayList<TypedText>();
        }
        return this.relation;
    }

    /**
     * Obtiene el valor de la propiedad miscellaneous.
     * 
     * @return
     *     possible object is
     *     {@link Miscellaneous }
     *     
     */
    public Miscellaneous getMiscellaneous() {
        return miscellaneous;
    }

    /**
     * Define el valor de la propiedad miscellaneous.
     * 
     * @param value
     *     allowed object is
     *     {@link Miscellaneous }
     *     
     */
    public void setMiscellaneous(Miscellaneous value) {
        this.miscellaneous = value;
    }

}

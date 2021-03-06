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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The credit type represents the appearance of the title, composer, arranger, lyricist, copyright, dedication, and other text and graphics that commonly appears on the first page of a score. The credit-words and credit-image elements are similar to the words and image elements for directions. However, since the credit is not part of a measure, the default-x and default-y attributes adjust the origin relative to the bottom left-hand corner of the first page. The enclosure for credit-words is none by default.
 * 	
 * By default, a series of credit-words elements within a single credit element follow one another in sequence visually. Non-positional formatting attributes are carried over from the previous element by default.
 * 	
 * The page attribute for the credit element, new in Version 2.0, specifies the page number where the credit should appear. This is an integer value that starts with 1 for the first page. Its value is 1 by default. Since credits occur before the music, these page numbers do not refer to the page numbering specified by the print element's page-number attribute.
 * 
 * The credit-type element, new in Version 3.0, indicates the purpose behind a credit. Multiple types of data may be combined in a single credit, so multiple elements may be used. Standard values include page number, title, subtitle, composer, arranger, lyricist, and rights.
 * 
 * 
 * <p>Clase Java para credit complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="credit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="credit-type" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="credit-image" type="{}image"/>
 *           &lt;sequence>
 *             &lt;element name="credit-words" type="{}formatted-text"/>
 *             &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *               &lt;element name="link" type="{}link" maxOccurs="unbounded" minOccurs="0"/>
 *               &lt;element name="bookmark" type="{}bookmark" maxOccurs="unbounded" minOccurs="0"/>
 *               &lt;element name="credit-words" type="{}formatted-text"/>
 *             &lt;/sequence>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "credit", propOrder = {
    "creditType",
    "creditImage",
    "creditWords",
    "linkAndBookmarkAndCreditWords"
})
public class Credit {

    @XmlElement(name = "credit-type")
    protected List<java.lang.String> creditType;
    @XmlElement(name = "credit-image")
    protected Image creditImage;
    @XmlElement(name = "credit-words")
    protected FormattedText creditWords;
    @XmlElements({
        @XmlElement(name = "link", type = Link.class),
        @XmlElement(name = "bookmark", type = Bookmark.class),
        @XmlElement(name = "credit-words", type = FormattedText.class)
    })
    protected List<Object> linkAndBookmarkAndCreditWords;
    @XmlAttribute(name = "page")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger page;

    /**
     * Gets the value of the creditType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getCreditType() {
        if (creditType == null) {
            creditType = new ArrayList<java.lang.String>();
        }
        return this.creditType;
    }

    /**
     * Obtiene el valor de la propiedad creditImage.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getCreditImage() {
        return creditImage;
    }

    /**
     * Define el valor de la propiedad creditImage.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setCreditImage(Image value) {
        this.creditImage = value;
    }

    /**
     * Obtiene el valor de la propiedad creditWords.
     * 
     * @return
     *     possible object is
     *     {@link FormattedText }
     *     
     */
    public FormattedText getCreditWords() {
        return creditWords;
    }

    /**
     * Define el valor de la propiedad creditWords.
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedText }
     *     
     */
    public void setCreditWords(FormattedText value) {
        this.creditWords = value;
    }

    /**
     * Gets the value of the linkAndBookmarkAndCreditWords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkAndBookmarkAndCreditWords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkAndBookmarkAndCreditWords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Link }
     * {@link Bookmark }
     * {@link FormattedText }
     * 
     * 
     */
    public List<Object> getLinkAndBookmarkAndCreditWords() {
        if (linkAndBookmarkAndCreditWords == null) {
            linkAndBookmarkAndCreditWords = new ArrayList<Object>();
        }
        return this.linkAndBookmarkAndCreditWords;
    }

    /**
     * Obtiene el valor de la propiedad page.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPage() {
        return page;
    }

    /**
     * Define el valor de la propiedad page.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPage(BigInteger value) {
        this.page = value;
    }

}

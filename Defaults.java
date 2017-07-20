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
 * The defaults type specifies score-wide defaults for scaling, layout, and appearance.
 * 
 * <p>Clase Java para defaults complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="defaults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scaling" type="{}scaling" minOccurs="0"/>
 *         &lt;group ref="{}layout"/>
 *         &lt;element name="appearance" type="{}appearance" minOccurs="0"/>
 *         &lt;element name="music-font" type="{}empty-font" minOccurs="0"/>
 *         &lt;element name="word-font" type="{}empty-font" minOccurs="0"/>
 *         &lt;element name="lyric-font" type="{}lyric-font" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lyric-language" type="{}lyric-language" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "defaults", propOrder = {
    "scaling",
    "pageLayout",
    "systemLayout",
    "staffLayout",
    "appearance",
    "musicFont",
    "wordFont",
    "lyricFont",
    "lyricLanguage"
})
public class Defaults {

    protected Scaling scaling;
    @XmlElement(name = "page-layout")
    protected PageLayout pageLayout;
    @XmlElement(name = "system-layout")
    protected SystemLayout systemLayout;
    @XmlElement(name = "staff-layout")
    protected List<StaffLayout> staffLayout;
    protected Appearance appearance;
    @XmlElement(name = "music-font")
    protected EmptyFont musicFont;
    @XmlElement(name = "word-font")
    protected EmptyFont wordFont;
    @XmlElement(name = "lyric-font")
    protected List<LyricFont> lyricFont;
    @XmlElement(name = "lyric-language")
    protected List<LyricLanguage> lyricLanguage;

    /**
     * Obtiene el valor de la propiedad scaling.
     * 
     * @return
     *     possible object is
     *     {@link Scaling }
     *     
     */
    public Scaling getScaling() {
        return scaling;
    }

    /**
     * Define el valor de la propiedad scaling.
     * 
     * @param value
     *     allowed object is
     *     {@link Scaling }
     *     
     */
    public void setScaling(Scaling value) {
        this.scaling = value;
    }

    /**
     * Obtiene el valor de la propiedad pageLayout.
     * 
     * @return
     *     possible object is
     *     {@link PageLayout }
     *     
     */
    public PageLayout getPageLayout() {
        return pageLayout;
    }

    /**
     * Define el valor de la propiedad pageLayout.
     * 
     * @param value
     *     allowed object is
     *     {@link PageLayout }
     *     
     */
    public void setPageLayout(PageLayout value) {
        this.pageLayout = value;
    }

    /**
     * Obtiene el valor de la propiedad systemLayout.
     * 
     * @return
     *     possible object is
     *     {@link SystemLayout }
     *     
     */
    public SystemLayout getSystemLayout() {
        return systemLayout;
    }

    /**
     * Define el valor de la propiedad systemLayout.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemLayout }
     *     
     */
    public void setSystemLayout(SystemLayout value) {
        this.systemLayout = value;
    }

    /**
     * Gets the value of the staffLayout property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staffLayout property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaffLayout().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StaffLayout }
     * 
     * 
     */
    public List<StaffLayout> getStaffLayout() {
        if (staffLayout == null) {
            staffLayout = new ArrayList<StaffLayout>();
        }
        return this.staffLayout;
    }

    /**
     * Obtiene el valor de la propiedad appearance.
     * 
     * @return
     *     possible object is
     *     {@link Appearance }
     *     
     */
    public Appearance getAppearance() {
        return appearance;
    }

    /**
     * Define el valor de la propiedad appearance.
     * 
     * @param value
     *     allowed object is
     *     {@link Appearance }
     *     
     */
    public void setAppearance(Appearance value) {
        this.appearance = value;
    }

    /**
     * Obtiene el valor de la propiedad musicFont.
     * 
     * @return
     *     possible object is
     *     {@link EmptyFont }
     *     
     */
    public EmptyFont getMusicFont() {
        return musicFont;
    }

    /**
     * Define el valor de la propiedad musicFont.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyFont }
     *     
     */
    public void setMusicFont(EmptyFont value) {
        this.musicFont = value;
    }

    /**
     * Obtiene el valor de la propiedad wordFont.
     * 
     * @return
     *     possible object is
     *     {@link EmptyFont }
     *     
     */
    public EmptyFont getWordFont() {
        return wordFont;
    }

    /**
     * Define el valor de la propiedad wordFont.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyFont }
     *     
     */
    public void setWordFont(EmptyFont value) {
        this.wordFont = value;
    }

    /**
     * Gets the value of the lyricFont property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lyricFont property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLyricFont().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LyricFont }
     * 
     * 
     */
    public List<LyricFont> getLyricFont() {
        if (lyricFont == null) {
            lyricFont = new ArrayList<LyricFont>();
        }
        return this.lyricFont;
    }

    /**
     * Gets the value of the lyricLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lyricLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLyricLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LyricLanguage }
     * 
     * 
     */
    public List<LyricLanguage> getLyricLanguage() {
        if (lyricLanguage == null) {
            lyricLanguage = new ArrayList<LyricLanguage>();
        }
        return this.lyricLanguage;
    }

}

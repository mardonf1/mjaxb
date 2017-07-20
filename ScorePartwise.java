//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.02 a las 03:52:44 PM EDT 
//


package mjaxb;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{}score-header"/>
 *         &lt;element name="part" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="measure" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;group ref="{}music-data"/>
 *                           &lt;attGroup ref="{}measure-attributes"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{}part-attributes"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}document-attributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "work",
    "movementNumber",
    "movementTitle",
    "identification",
    "defaults",
    "credit",
    "partList",
    "part"
})
@XmlRootElement(name = "score-partwise")
public class ScorePartwise {

    protected Work work;
    @XmlElement(name = "movement-number")
    protected java.lang.String movementNumber;
    @XmlElement(name = "movement-title")
    protected java.lang.String movementTitle;
    protected Identification identification;
    protected Defaults defaults;
    protected List<Credit> credit;
    @XmlElement(name = "part-list", required = true)
    protected PartList partList;
    @XmlElement(required = true)
    protected List<ScorePartwise.Part> part;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected java.lang.String version;

    /**
     * Obtiene el valor de la propiedad work.
     * 
     * @return
     *     possible object is
     *     {@link Work }
     *     
     */
    public Work getWork() {
        return work;
    }

    /**
     * Define el valor de la propiedad work.
     * 
     * @param value
     *     allowed object is
     *     {@link Work }
     *     
     */
    public void setWork(Work value) {
        this.work = value;
    }

    /**
     * Obtiene el valor de la propiedad movementNumber.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getMovementNumber() {
        return movementNumber;
    }

    /**
     * Define el valor de la propiedad movementNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setMovementNumber(java.lang.String value) {
        this.movementNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad movementTitle.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getMovementTitle() {
        return movementTitle;
    }

    /**
     * Define el valor de la propiedad movementTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setMovementTitle(java.lang.String value) {
        this.movementTitle = value;
    }

    /**
     * Obtiene el valor de la propiedad identification.
     * 
     * @return
     *     possible object is
     *     {@link Identification }
     *     
     */
    public Identification getIdentification() {
        return identification;
    }

    /**
     * Define el valor de la propiedad identification.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification }
     *     
     */
    public void setIdentification(Identification value) {
        this.identification = value;
    }

    /**
     * Obtiene el valor de la propiedad defaults.
     * 
     * @return
     *     possible object is
     *     {@link Defaults }
     *     
     */
    public Defaults getDefaults() {
        return defaults;
    }

    /**
     * Define el valor de la propiedad defaults.
     * 
     * @param value
     *     allowed object is
     *     {@link Defaults }
     *     
     */
    public void setDefaults(Defaults value) {
        this.defaults = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the credit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCredit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Credit }
     * 
     * 
     */
    public List<Credit> getCredit() {
        if (credit == null) {
            credit = new ArrayList<Credit>();
        }
        return this.credit;
    }

    /**
     * Obtiene el valor de la propiedad partList.
     * 
     * @return
     *     possible object is
     *     {@link PartList }
     *     
     */
    public PartList getPartList() {
        return partList;
    }

    /**
     * Define el valor de la propiedad partList.
     * 
     * @param value
     *     allowed object is
     *     {@link PartList }
     *     
     */
    public void setPartList(PartList value) {
        this.partList = value;
    }

    /**
     * Gets the value of the part property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the part property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScorePartwise.Part }
     * 
     * 
     */
    public List<ScorePartwise.Part> getPart() {
        if (part == null) {
            part = new ArrayList<ScorePartwise.Part>();
        }
        return this.part;
    }

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setVersion(java.lang.String value) {
        this.version = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="measure" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;group ref="{}music-data"/>
     *                 &lt;attGroup ref="{}measure-attributes"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{}part-attributes"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "measure"
    })
    public static class Part {

        @XmlElement(required = true)
        protected List<ScorePartwise.Part.Measure> measure;
        @XmlAttribute(name = "id", required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object id;

        /**
         * Gets the value of the measure property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the measure property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMeasure().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ScorePartwise.Part.Measure }
         * 
         * 
         */
        public List<ScorePartwise.Part.Measure> getMeasure() {
            if (measure == null) {
                measure = new ArrayList<ScorePartwise.Part.Measure>();
            }
            return this.measure;
        }

        /**
         * Obtiene el valor de la propiedad id.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setId(Object value) {
            this.id = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;group ref="{}music-data"/>
         *       &lt;attGroup ref="{}measure-attributes"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "noteOrBackupOrForward"
        })
        public static class Measure {

            @XmlElements({
                @XmlElement(name = "note", type = Note.class),
                @XmlElement(name = "backup", type = Backup.class),
                @XmlElement(name = "forward", type = Forward.class),
                @XmlElement(name = "direction", type = Direction.class),
                @XmlElement(name = "attributes", type = Attributes.class),
                @XmlElement(name = "harmony", type = Harmony.class),
                @XmlElement(name = "figured-bass", type = FiguredBass.class),
                @XmlElement(name = "print", type = Print.class),
                @XmlElement(name = "sound", type = Sound.class),
                @XmlElement(name = "barline", type = Barline.class),
                @XmlElement(name = "grouping", type = Grouping.class),
                @XmlElement(name = "link", type = Link.class),
                @XmlElement(name = "bookmark", type = Bookmark.class)
            })
            protected List<Object> noteOrBackupOrForward;
            @XmlAttribute(name = "number", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected java.lang.String number;
            @XmlAttribute(name = "implicit")
            protected YesNo implicit;
            @XmlAttribute(name = "non-controlling")
            protected YesNo nonControlling;
            @XmlAttribute(name = "width")
            protected BigDecimal width;

            /**
             * Gets the value of the noteOrBackupOrForward property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the noteOrBackupOrForward property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNoteOrBackupOrForward().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Note }
             * {@link Backup }
             * {@link Forward }
             * {@link Direction }
             * {@link Attributes }
             * {@link Harmony }
             * {@link FiguredBass }
             * {@link Print }
             * {@link Sound }
             * {@link Barline }
             * {@link Grouping }
             * {@link Link }
             * {@link Bookmark }
             * 
             * 
             */
            public List<Object> getNoteOrBackupOrForward() {
                if (noteOrBackupOrForward == null) {
                    noteOrBackupOrForward = new ArrayList<Object>();
                }
                return this.noteOrBackupOrForward;
            }

            /**
             * Obtiene el valor de la propiedad number.
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String }
             *     
             */
            public java.lang.String getNumber() {
                return number;
            }

            /**
             * Define el valor de la propiedad number.
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String }
             *     
             */
            public void setNumber(java.lang.String value) {
                this.number = value;
            }

            /**
             * Obtiene el valor de la propiedad implicit.
             * 
             * @return
             *     possible object is
             *     {@link YesNo }
             *     
             */
            public YesNo getImplicit() {
                return implicit;
            }

            /**
             * Define el valor de la propiedad implicit.
             * 
             * @param value
             *     allowed object is
             *     {@link YesNo }
             *     
             */
            public void setImplicit(YesNo value) {
                this.implicit = value;
            }

            /**
             * Obtiene el valor de la propiedad nonControlling.
             * 
             * @return
             *     possible object is
             *     {@link YesNo }
             *     
             */
            public YesNo getNonControlling() {
                return nonControlling;
            }

            /**
             * Define el valor de la propiedad nonControlling.
             * 
             * @param value
             *     allowed object is
             *     {@link YesNo }
             *     
             */
            public void setNonControlling(YesNo value) {
                this.nonControlling = value;
            }

            /**
             * Obtiene el valor de la propiedad width.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getWidth() {
                return width;
            }

            /**
             * Define el valor de la propiedad width.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setWidth(BigDecimal value) {
                this.width = value;
            }

        }

    }

}

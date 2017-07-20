//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.02 a las 03:52:44 PM EDT 
//


package mjaxb;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Brackets are combined with words in a variety of modern directions. The line-end attribute specifies if there is a jog up or down (or both), an arrow, or nothing at the start or end of the bracket. If the line-end is up or down, the length of the jog can be specified using the end-length attribute. The line-type is solid by default.
 * 
 * <p>Clase Java para bracket complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bracket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{}position"/>
 *       &lt;attGroup ref="{}color"/>
 *       &lt;attGroup ref="{}dashed-formatting"/>
 *       &lt;attGroup ref="{}line-type"/>
 *       &lt;attribute name="type" use="required" type="{}start-stop-continue" />
 *       &lt;attribute name="number" type="{}number-level" />
 *       &lt;attribute name="line-end" use="required" type="{}line-end" />
 *       &lt;attribute name="end-length" type="{}tenths" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bracket")
public class Bracket {

    @XmlAttribute(name = "type", required = true)
    protected StartStopContinue type;
    @XmlAttribute(name = "number")
    protected Integer number;
    @XmlAttribute(name = "line-end", required = true)
    protected LineEnd lineEnd;
    @XmlAttribute(name = "end-length")
    protected BigDecimal endLength;
    @XmlAttribute(name = "default-x")
    protected BigDecimal defaultX;
    @XmlAttribute(name = "default-y")
    protected BigDecimal defaultY;
    @XmlAttribute(name = "relative-x")
    protected BigDecimal relativeX;
    @XmlAttribute(name = "relative-y")
    protected BigDecimal relativeY;
    @XmlAttribute(name = "color")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String color;
    @XmlAttribute(name = "dash-length")
    protected BigDecimal dashLength;
    @XmlAttribute(name = "space-length")
    protected BigDecimal spaceLength;
    @XmlAttribute(name = "line-type")
    protected LineType lineType;

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link StartStopContinue }
     *     
     */
    public StartStopContinue getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link StartStopContinue }
     *     
     */
    public void setType(StartStopContinue value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad number.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Define el valor de la propiedad number.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumber(Integer value) {
        this.number = value;
    }

    /**
     * Obtiene el valor de la propiedad lineEnd.
     * 
     * @return
     *     possible object is
     *     {@link LineEnd }
     *     
     */
    public LineEnd getLineEnd() {
        return lineEnd;
    }

    /**
     * Define el valor de la propiedad lineEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link LineEnd }
     *     
     */
    public void setLineEnd(LineEnd value) {
        this.lineEnd = value;
    }

    /**
     * Obtiene el valor de la propiedad endLength.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndLength() {
        return endLength;
    }

    /**
     * Define el valor de la propiedad endLength.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndLength(BigDecimal value) {
        this.endLength = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultX.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultX() {
        return defaultX;
    }

    /**
     * Define el valor de la propiedad defaultX.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultX(BigDecimal value) {
        this.defaultX = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultY.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultY() {
        return defaultY;
    }

    /**
     * Define el valor de la propiedad defaultY.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultY(BigDecimal value) {
        this.defaultY = value;
    }

    /**
     * Obtiene el valor de la propiedad relativeX.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRelativeX() {
        return relativeX;
    }

    /**
     * Define el valor de la propiedad relativeX.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRelativeX(BigDecimal value) {
        this.relativeX = value;
    }

    /**
     * Obtiene el valor de la propiedad relativeY.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRelativeY() {
        return relativeY;
    }

    /**
     * Define el valor de la propiedad relativeY.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRelativeY(BigDecimal value) {
        this.relativeY = value;
    }

    /**
     * Obtiene el valor de la propiedad color.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getColor() {
        return color;
    }

    /**
     * Define el valor de la propiedad color.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setColor(java.lang.String value) {
        this.color = value;
    }

    /**
     * Obtiene el valor de la propiedad dashLength.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDashLength() {
        return dashLength;
    }

    /**
     * Define el valor de la propiedad dashLength.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDashLength(BigDecimal value) {
        this.dashLength = value;
    }

    /**
     * Obtiene el valor de la propiedad spaceLength.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpaceLength() {
        return spaceLength;
    }

    /**
     * Define el valor de la propiedad spaceLength.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpaceLength(BigDecimal value) {
        this.spaceLength = value;
    }

    /**
     * Obtiene el valor de la propiedad lineType.
     * 
     * @return
     *     possible object is
     *     {@link LineType }
     *     
     */
    public LineType getLineType() {
        return lineType;
    }

    /**
     * Define el valor de la propiedad lineType.
     * 
     * @param value
     *     allowed object is
     *     {@link LineType }
     *     
     */
    public void setLineType(LineType value) {
        this.lineType = value;
    }

}

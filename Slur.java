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
 * Slur types are empty. Most slurs are represented with two elements: one with a start type, and one with a stop type. Slurs can add more elements using a continue type. This is typically used to specify the formatting of cross-system slurs, or to specify the shape of very complex slurs.
 * 
 * <p>Clase Java para slur complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="slur">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{}color"/>
 *       &lt;attGroup ref="{}placement"/>
 *       &lt;attGroup ref="{}orientation"/>
 *       &lt;attGroup ref="{}dashed-formatting"/>
 *       &lt;attGroup ref="{}line-type"/>
 *       &lt;attGroup ref="{}bezier"/>
 *       &lt;attGroup ref="{}position"/>
 *       &lt;attribute name="type" use="required" type="{}start-stop-continue" />
 *       &lt;attribute name="number" type="{}number-level" default="1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "slur")
public class Slur {

    @XmlAttribute(name = "type", required = true)
    protected StartStopContinue type;
    @XmlAttribute(name = "number")
    protected Integer number;
    @XmlAttribute(name = "color")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String color;
    @XmlAttribute(name = "placement")
    protected AboveBelow placement;
    @XmlAttribute(name = "orientation")
    protected OverUnder orientation;
    @XmlAttribute(name = "dash-length")
    protected BigDecimal dashLength;
    @XmlAttribute(name = "space-length")
    protected BigDecimal spaceLength;
    @XmlAttribute(name = "line-type")
    protected LineType lineType;
    @XmlAttribute(name = "bezier-offset")
    protected BigDecimal bezierOffset;
    @XmlAttribute(name = "bezier-offset2")
    protected BigDecimal bezierOffset2;
    @XmlAttribute(name = "bezier-x")
    protected BigDecimal bezierX;
    @XmlAttribute(name = "bezier-y")
    protected BigDecimal bezierY;
    @XmlAttribute(name = "bezier-x2")
    protected BigDecimal bezierX2;
    @XmlAttribute(name = "bezier-y2")
    protected BigDecimal bezierY2;
    @XmlAttribute(name = "default-x")
    protected BigDecimal defaultX;
    @XmlAttribute(name = "default-y")
    protected BigDecimal defaultY;
    @XmlAttribute(name = "relative-x")
    protected BigDecimal relativeX;
    @XmlAttribute(name = "relative-y")
    protected BigDecimal relativeY;

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
    public int getNumber() {
        if (number == null) {
            return  1;
        } else {
            return number;
        }
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
     * Obtiene el valor de la propiedad placement.
     * 
     * @return
     *     possible object is
     *     {@link AboveBelow }
     *     
     */
    public AboveBelow getPlacement() {
        return placement;
    }

    /**
     * Define el valor de la propiedad placement.
     * 
     * @param value
     *     allowed object is
     *     {@link AboveBelow }
     *     
     */
    public void setPlacement(AboveBelow value) {
        this.placement = value;
    }

    /**
     * Obtiene el valor de la propiedad orientation.
     * 
     * @return
     *     possible object is
     *     {@link OverUnder }
     *     
     */
    public OverUnder getOrientation() {
        return orientation;
    }

    /**
     * Define el valor de la propiedad orientation.
     * 
     * @param value
     *     allowed object is
     *     {@link OverUnder }
     *     
     */
    public void setOrientation(OverUnder value) {
        this.orientation = value;
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

    /**
     * Obtiene el valor de la propiedad bezierOffset.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBezierOffset() {
        return bezierOffset;
    }

    /**
     * Define el valor de la propiedad bezierOffset.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBezierOffset(BigDecimal value) {
        this.bezierOffset = value;
    }

    /**
     * Obtiene el valor de la propiedad bezierOffset2.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBezierOffset2() {
        return bezierOffset2;
    }

    /**
     * Define el valor de la propiedad bezierOffset2.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBezierOffset2(BigDecimal value) {
        this.bezierOffset2 = value;
    }

    /**
     * Obtiene el valor de la propiedad bezierX.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBezierX() {
        return bezierX;
    }

    /**
     * Define el valor de la propiedad bezierX.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBezierX(BigDecimal value) {
        this.bezierX = value;
    }

    /**
     * Obtiene el valor de la propiedad bezierY.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBezierY() {
        return bezierY;
    }

    /**
     * Define el valor de la propiedad bezierY.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBezierY(BigDecimal value) {
        this.bezierY = value;
    }

    /**
     * Obtiene el valor de la propiedad bezierX2.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBezierX2() {
        return bezierX2;
    }

    /**
     * Define el valor de la propiedad bezierX2.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBezierX2(BigDecimal value) {
        this.bezierX2 = value;
    }

    /**
     * Obtiene el valor de la propiedad bezierY2.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBezierY2() {
        return bezierY2;
    }

    /**
     * Define el valor de la propiedad bezierY2.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBezierY2(BigDecimal value) {
        this.bezierY2 = value;
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

}

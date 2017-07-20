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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A tuplet element is present when a tuplet is to be displayed graphically, in addition to the sound data provided by the time-modification elements. The number attribute is used to distinguish nested tuplets. The bracket attribute is used to indicate the presence of a bracket. If unspecified, the results are implementation-dependent. The line-shape attribute is used to specify whether the bracket is straight or in the older curved or slurred style. It is straight by default.
 * 	
 * Whereas a time-modification element shows how the cumulative, sounding effect of tuplets and double-note tremolos compare to the written note type, the tuplet element describes how this is displayed. The tuplet element also provides more detailed representation information than the time-modification element, and is needed to represent nested tuplets and other complex tuplets accurately. 
 * 	
 * The show-number attribute is used to display either the number of actual notes, the number of both actual and normal notes, or neither. It is actual by default. The show-type attribute is used to display either the actual type, both the actual and normal types, or neither. It is none by default.
 * 
 * <p>Clase Java para tuplet complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tuplet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tuplet-actual" type="{}tuplet-portion" minOccurs="0"/>
 *         &lt;element name="tuplet-normal" type="{}tuplet-portion" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{}position"/>
 *       &lt;attGroup ref="{}placement"/>
 *       &lt;attGroup ref="{}line-shape"/>
 *       &lt;attribute name="type" use="required" type="{}start-stop" />
 *       &lt;attribute name="number" type="{}number-level" />
 *       &lt;attribute name="bracket" type="{}yes-no" />
 *       &lt;attribute name="show-number" type="{}show-tuplet" />
 *       &lt;attribute name="show-type" type="{}show-tuplet" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tuplet", propOrder = {
    "tupletActual",
    "tupletNormal"
})
public class Tuplet {

    @XmlElement(name = "tuplet-actual")
    protected TupletPortion tupletActual;
    @XmlElement(name = "tuplet-normal")
    protected TupletPortion tupletNormal;
    @XmlAttribute(name = "type", required = true)
    protected StartStop type;
    @XmlAttribute(name = "number")
    protected Integer number;
    @XmlAttribute(name = "bracket")
    protected YesNo bracket;
    @XmlAttribute(name = "show-number")
    protected ShowTuplet showNumber;
    @XmlAttribute(name = "show-type")
    protected ShowTuplet showType;
    @XmlAttribute(name = "default-x")
    protected BigDecimal defaultX;
    @XmlAttribute(name = "default-y")
    protected BigDecimal defaultY;
    @XmlAttribute(name = "relative-x")
    protected BigDecimal relativeX;
    @XmlAttribute(name = "relative-y")
    protected BigDecimal relativeY;
    @XmlAttribute(name = "placement")
    protected AboveBelow placement;
    @XmlAttribute(name = "line-shape")
    protected LineShape lineShape;

    /**
     * Obtiene el valor de la propiedad tupletActual.
     * 
     * @return
     *     possible object is
     *     {@link TupletPortion }
     *     
     */
    public TupletPortion getTupletActual() {
        return tupletActual;
    }

    /**
     * Define el valor de la propiedad tupletActual.
     * 
     * @param value
     *     allowed object is
     *     {@link TupletPortion }
     *     
     */
    public void setTupletActual(TupletPortion value) {
        this.tupletActual = value;
    }

    /**
     * Obtiene el valor de la propiedad tupletNormal.
     * 
     * @return
     *     possible object is
     *     {@link TupletPortion }
     *     
     */
    public TupletPortion getTupletNormal() {
        return tupletNormal;
    }

    /**
     * Define el valor de la propiedad tupletNormal.
     * 
     * @param value
     *     allowed object is
     *     {@link TupletPortion }
     *     
     */
    public void setTupletNormal(TupletPortion value) {
        this.tupletNormal = value;
    }

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

    /**
     * Obtiene el valor de la propiedad showType.
     * 
     * @return
     *     possible object is
     *     {@link ShowTuplet }
     *     
     */
    public ShowTuplet getShowType() {
        return showType;
    }

    /**
     * Define el valor de la propiedad showType.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowTuplet }
     *     
     */
    public void setShowType(ShowTuplet value) {
        this.showType = value;
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
     * Obtiene el valor de la propiedad lineShape.
     * 
     * @return
     *     possible object is
     *     {@link LineShape }
     *     
     */
    public LineShape getLineShape() {
        return lineShape;
    }

    /**
     * Define el valor de la propiedad lineShape.
     * 
     * @param value
     *     allowed object is
     *     {@link LineShape }
     *     
     */
    public void setLineShape(LineShape value) {
        this.lineShape = value;
    }

}

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
 * Wavy lines are one way to indicate trills. When used with a measure element, they should always have type="continue" set.
 * 
 * <p>Clase Java para wavy-line complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="wavy-line">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{}trill-sound"/>
 *       &lt;attGroup ref="{}position"/>
 *       &lt;attGroup ref="{}color"/>
 *       &lt;attGroup ref="{}placement"/>
 *       &lt;attribute name="type" use="required" type="{}start-stop-continue" />
 *       &lt;attribute name="number" type="{}number-level" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wavy-line")
public class WavyLine {

    @XmlAttribute(name = "type", required = true)
    protected StartStopContinue type;
    @XmlAttribute(name = "number")
    protected Integer number;
    @XmlAttribute(name = "start-note")
    protected StartNote startNote;
    @XmlAttribute(name = "trill-step")
    protected TrillStep trillStep;
    @XmlAttribute(name = "two-note-turn")
    protected TwoNoteTurn twoNoteTurn;
    @XmlAttribute(name = "accelerate")
    protected YesNo accelerate;
    @XmlAttribute(name = "beats")
    protected BigDecimal beats;
    @XmlAttribute(name = "second-beat")
    protected BigDecimal secondBeat;
    @XmlAttribute(name = "last-beat")
    protected BigDecimal lastBeat;
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
    @XmlAttribute(name = "placement")
    protected AboveBelow placement;

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
     * Obtiene el valor de la propiedad startNote.
     * 
     * @return
     *     possible object is
     *     {@link StartNote }
     *     
     */
    public StartNote getStartNote() {
        return startNote;
    }

    /**
     * Define el valor de la propiedad startNote.
     * 
     * @param value
     *     allowed object is
     *     {@link StartNote }
     *     
     */
    public void setStartNote(StartNote value) {
        this.startNote = value;
    }

    /**
     * Obtiene el valor de la propiedad trillStep.
     * 
     * @return
     *     possible object is
     *     {@link TrillStep }
     *     
     */
    public TrillStep getTrillStep() {
        return trillStep;
    }

    /**
     * Define el valor de la propiedad trillStep.
     * 
     * @param value
     *     allowed object is
     *     {@link TrillStep }
     *     
     */
    public void setTrillStep(TrillStep value) {
        this.trillStep = value;
    }

    /**
     * Obtiene el valor de la propiedad twoNoteTurn.
     * 
     * @return
     *     possible object is
     *     {@link TwoNoteTurn }
     *     
     */
    public TwoNoteTurn getTwoNoteTurn() {
        return twoNoteTurn;
    }

    /**
     * Define el valor de la propiedad twoNoteTurn.
     * 
     * @param value
     *     allowed object is
     *     {@link TwoNoteTurn }
     *     
     */
    public void setTwoNoteTurn(TwoNoteTurn value) {
        this.twoNoteTurn = value;
    }

    /**
     * Obtiene el valor de la propiedad accelerate.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getAccelerate() {
        return accelerate;
    }

    /**
     * Define el valor de la propiedad accelerate.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setAccelerate(YesNo value) {
        this.accelerate = value;
    }

    /**
     * Obtiene el valor de la propiedad beats.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBeats() {
        return beats;
    }

    /**
     * Define el valor de la propiedad beats.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBeats(BigDecimal value) {
        this.beats = value;
    }

    /**
     * Obtiene el valor de la propiedad secondBeat.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSecondBeat() {
        return secondBeat;
    }

    /**
     * Define el valor de la propiedad secondBeat.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSecondBeat(BigDecimal value) {
        this.secondBeat = value;
    }

    /**
     * Obtiene el valor de la propiedad lastBeat.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastBeat() {
        return lastBeat;
    }

    /**
     * Define el valor de la propiedad lastBeat.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastBeat(BigDecimal value) {
        this.lastBeat = value;
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

}

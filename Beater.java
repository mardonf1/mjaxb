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
import javax.xml.bind.annotation.XmlValue;


/**
 * The beater type represents pictograms for beaters, mallets, and sticks that do not have different materials represented in the pictogram.
 * 
 * <p>Clase Java para beater complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="beater">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;>beater-value">
 *       &lt;attribute name="tip" type="{}tip-direction" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beater", propOrder = {
    "value"
})
public class Beater {

    @XmlValue
    protected BeaterValue value;
    @XmlAttribute(name = "tip")
    protected TipDirection tip;

    /**
     * The beater-value type represents pictograms for beaters, mallets, and sticks that do not have different materials represented in the pictogram. The finger and hammer values are in addition to Stone's list.
     * 
     * @return
     *     possible object is
     *     {@link BeaterValue }
     *     
     */
    public BeaterValue getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link BeaterValue }
     *     
     */
    public void setValue(BeaterValue value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad tip.
     * 
     * @return
     *     possible object is
     *     {@link TipDirection }
     *     
     */
    public TipDirection getTip() {
        return tip;
    }

    /**
     * Define el valor de la propiedad tip.
     * 
     * @param value
     *     allowed object is
     *     {@link TipDirection }
     *     
     */
    public void setTip(TipDirection value) {
        this.tip = value;
    }

}

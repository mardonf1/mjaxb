//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.02 a las 03:52:44 PM EDT 
//


package mjaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The system-dividers element indicates the presence or absence of system dividers (also known as system separation marks) between systems displayed on the same page. Dividers on the left and right side of the page are controlled by the left-divider and right-divider elements respectively. The default vertical position is half the system-distance value from the top of the system that is below the divider. The default horizontal position is the left and right system margin, respectively.
 * 
 * When used in the print element, the system-dividers element affects the dividers that would appear between the current system and the previous system.
 * 
 * <p>Clase Java para system-dividers complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="system-dividers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="left-divider" type="{}empty-print-object-style-align"/>
 *         &lt;element name="right-divider" type="{}empty-print-object-style-align"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "system-dividers", propOrder = {
    "leftDivider",
    "rightDivider"
})
public class SystemDividers {

    @XmlElement(name = "left-divider", required = true)
    protected EmptyPrintObjectStyleAlign leftDivider;
    @XmlElement(name = "right-divider", required = true)
    protected EmptyPrintObjectStyleAlign rightDivider;

    /**
     * Obtiene el valor de la propiedad leftDivider.
     * 
     * @return
     *     possible object is
     *     {@link EmptyPrintObjectStyleAlign }
     *     
     */
    public EmptyPrintObjectStyleAlign getLeftDivider() {
        return leftDivider;
    }

    /**
     * Define el valor de la propiedad leftDivider.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyPrintObjectStyleAlign }
     *     
     */
    public void setLeftDivider(EmptyPrintObjectStyleAlign value) {
        this.leftDivider = value;
    }

    /**
     * Obtiene el valor de la propiedad rightDivider.
     * 
     * @return
     *     possible object is
     *     {@link EmptyPrintObjectStyleAlign }
     *     
     */
    public EmptyPrintObjectStyleAlign getRightDivider() {
        return rightDivider;
    }

    /**
     * Define el valor de la propiedad rightDivider.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyPrintObjectStyleAlign }
     *     
     */
    public void setRightDivider(EmptyPrintObjectStyleAlign value) {
        this.rightDivider = value;
    }

}

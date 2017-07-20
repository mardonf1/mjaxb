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
 * The root type indicates a pitch like C, D, E vs. a function indication like I, II, III. It is used with chord symbols in popular music. The root element has a root-step and optional root-alter element similar to the step and alter elements, but renamed to distinguish the different musical meanings.
 * 
 * <p>Clase Java para root complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="root">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="root-step" type="{}root-step"/>
 *         &lt;element name="root-alter" type="{}root-alter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "root", propOrder = {
    "rootStep",
    "rootAlter"
})
public class Root {

    @XmlElement(name = "root-step", required = true)
    protected RootStep rootStep;
    @XmlElement(name = "root-alter")
    protected RootAlter rootAlter;

    /**
     * Obtiene el valor de la propiedad rootStep.
     * 
     * @return
     *     possible object is
     *     {@link RootStep }
     *     
     */
    public RootStep getRootStep() {
        return rootStep;
    }

    /**
     * Define el valor de la propiedad rootStep.
     * 
     * @param value
     *     allowed object is
     *     {@link RootStep }
     *     
     */
    public void setRootStep(RootStep value) {
        this.rootStep = value;
    }

    /**
     * Obtiene el valor de la propiedad rootAlter.
     * 
     * @return
     *     possible object is
     *     {@link RootAlter }
     *     
     */
    public RootAlter getRootAlter() {
        return rootAlter;
    }

    /**
     * Define el valor de la propiedad rootAlter.
     * 
     * @param value
     *     allowed object is
     *     {@link RootAlter }
     *     
     */
    public void setRootAlter(RootAlter value) {
        this.rootAlter = value;
    }

}

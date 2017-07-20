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
 * The virtual-instrument element defines a specific virtual instrument used for an instrument sound.
 * 
 * <p>Clase Java para virtual-instrument complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="virtual-instrument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="virtual-library" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="virtual-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "virtual-instrument", propOrder = {
    "virtualLibrary",
    "virtualName"
})
public class VirtualInstrument {

    @XmlElement(name = "virtual-library")
    protected java.lang.String virtualLibrary;
    @XmlElement(name = "virtual-name")
    protected java.lang.String virtualName;

    /**
     * Obtiene el valor de la propiedad virtualLibrary.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getVirtualLibrary() {
        return virtualLibrary;
    }

    /**
     * Define el valor de la propiedad virtualLibrary.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setVirtualLibrary(java.lang.String value) {
        this.virtualLibrary = value;
    }

    /**
     * Obtiene el valor de la propiedad virtualName.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getVirtualName() {
        return virtualName;
    }

    /**
     * Define el valor de la propiedad virtualName.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setVirtualName(java.lang.String value) {
        this.virtualName = value;
    }

}

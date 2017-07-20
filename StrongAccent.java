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


/**
 * The strong-accent type indicates a vertical accent mark. The type attribute indicates if the point of the accent is down or up.
 * 
 * <p>Clase Java para strong-accent complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="strong-accent">
 *   &lt;complexContent>
 *     &lt;extension base="{}empty-placement">
 *       &lt;attribute name="type" type="{}up-down" default="up" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "strong-accent")
public class StrongAccent
    extends EmptyPlacement
{

    @XmlAttribute(name = "type")
    protected UpDown type;

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link UpDown }
     *     
     */
    public UpDown getType() {
        if (type == null) {
            return UpDown.UP;
        } else {
            return type;
        }
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link UpDown }
     *     
     */
    public void setType(UpDown value) {
        this.type = value;
    }

}

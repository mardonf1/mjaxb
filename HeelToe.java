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
 * The heel and toe elements are used with organ pedals. The substitution value is "no" if the attribute is not present.
 * 
 * <p>Clase Java para heel-toe complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="heel-toe">
 *   &lt;complexContent>
 *     &lt;extension base="{}empty-placement">
 *       &lt;attribute name="substitution" type="{}yes-no" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "heel-toe")
public class HeelToe
    extends EmptyPlacement
{

    @XmlAttribute(name = "substitution")
    protected YesNo substitution;

    /**
     * Obtiene el valor de la propiedad substitution.
     * 
     * @return
     *     possible object is
     *     {@link YesNo }
     *     
     */
    public YesNo getSubstitution() {
        return substitution;
    }

    /**
     * Define el valor de la propiedad substitution.
     * 
     * @param value
     *     allowed object is
     *     {@link YesNo }
     *     
     */
    public void setSubstitution(YesNo value) {
        this.substitution = value;
    }

}

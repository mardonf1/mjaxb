//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.02 a las 03:52:44 PM EDT 
//


package mjaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * Ornaments can be any of several types, followed optionally by accidentals. The accidental-mark element's content is represented the same as an accidental element, but with a different name to reflect the different musical meaning.
 * 
 * <p>Clase Java para ornaments complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ornaments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;choice>
 *           &lt;element name="trill-mark" type="{}empty-trill-sound"/>
 *           &lt;element name="turn" type="{}horizontal-turn"/>
 *           &lt;element name="delayed-turn" type="{}horizontal-turn"/>
 *           &lt;element name="inverted-turn" type="{}horizontal-turn"/>
 *           &lt;element name="delayed-inverted-turn" type="{}horizontal-turn"/>
 *           &lt;element name="vertical-turn" type="{}empty-trill-sound"/>
 *           &lt;element name="shake" type="{}empty-trill-sound"/>
 *           &lt;element name="wavy-line" type="{}wavy-line"/>
 *           &lt;element name="mordent" type="{}mordent"/>
 *           &lt;element name="inverted-mordent" type="{}mordent"/>
 *           &lt;element name="schleifer" type="{}empty-placement"/>
 *           &lt;element name="tremolo" type="{}tremolo"/>
 *           &lt;element name="other-ornament" type="{}placement-text"/>
 *         &lt;/choice>
 *         &lt;element name="accidental-mark" type="{}accidental-mark" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ornaments", propOrder = {
    "trillMarkOrTurnOrDelayedTurn"
})
public class Ornaments {

    @XmlElementRefs({
        @XmlElementRef(name = "shake", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "accidental-mark", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mordent", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "schleifer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "delayed-turn", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "trill-mark", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "other-ornament", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "vertical-turn", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "inverted-turn", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "inverted-mordent", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "turn", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "delayed-inverted-turn", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "wavy-line", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tremolo", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> trillMarkOrTurnOrDelayedTurn;

    /**
     * Gets the value of the trillMarkOrTurnOrDelayedTurn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trillMarkOrTurnOrDelayedTurn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrillMarkOrTurnOrDelayedTurn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link EmptyTrillSound }{@code >}
     * {@link JAXBElement }{@code <}{@link AccidentalMark }{@code >}
     * {@link JAXBElement }{@code <}{@link Mordent }{@code >}
     * {@link JAXBElement }{@code <}{@link EmptyPlacement }{@code >}
     * {@link JAXBElement }{@code <}{@link HorizontalTurn }{@code >}
     * {@link JAXBElement }{@code <}{@link EmptyTrillSound }{@code >}
     * {@link JAXBElement }{@code <}{@link PlacementText }{@code >}
     * {@link JAXBElement }{@code <}{@link EmptyTrillSound }{@code >}
     * {@link JAXBElement }{@code <}{@link HorizontalTurn }{@code >}
     * {@link JAXBElement }{@code <}{@link Mordent }{@code >}
     * {@link JAXBElement }{@code <}{@link HorizontalTurn }{@code >}
     * {@link JAXBElement }{@code <}{@link HorizontalTurn }{@code >}
     * {@link JAXBElement }{@code <}{@link WavyLine }{@code >}
     * {@link JAXBElement }{@code <}{@link Tremolo }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getTrillMarkOrTurnOrDelayedTurn() {
        if (trillMarkOrTurnOrDelayedTurn == null) {
            trillMarkOrTurnOrDelayedTurn = new ArrayList<JAXBElement<?>>();
        }
        return this.trillMarkOrTurnOrDelayedTurn;
    }

}

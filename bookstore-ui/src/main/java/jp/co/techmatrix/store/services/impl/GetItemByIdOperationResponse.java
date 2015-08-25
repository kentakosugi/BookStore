
package jp.co.techmatrix.store.services.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getItemByIdOperationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getItemByIdOperationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getItemByIdReturn" type="{http://impl.services.store.techmatrix.co.jp/}book" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getItemByIdOperationResponse", propOrder = {
    "getItemByIdReturn"
})
public class GetItemByIdOperationResponse {

    protected Book getItemByIdReturn;

    /**
     * Gets the value of the getItemByIdReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Book }
     *     
     */
    public Book getGetItemByIdReturn() {
        return getItemByIdReturn;
    }

    /**
     * Sets the value of the getItemByIdReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Book }
     *     
     */
    public void setGetItemByIdReturn(Book value) {
        this.getItemByIdReturn = value;
    }

}

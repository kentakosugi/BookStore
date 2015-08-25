
package jp.co.techmatrix.store.services.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getItemByTitleOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getItemByTitleOperation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getItemByTitleRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getItemByTitleOperation", propOrder = {
    "getItemByTitleRequest"
})
public class GetItemByTitleOperation {

    protected String getItemByTitleRequest;

    /**
     * Gets the value of the getItemByTitleRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetItemByTitleRequest() {
        return getItemByTitleRequest;
    }

    /**
     * Sets the value of the getItemByTitleRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetItemByTitleRequest(String value) {
        this.getItemByTitleRequest = value;
    }

}

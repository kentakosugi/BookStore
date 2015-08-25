
package jp.co.techmatrix.store.services.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getItemByIdOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getItemByIdOperation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getItemByIdRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getItemByIdOperation", propOrder = {
    "getItemByIdRequest"
})
public class GetItemByIdOperation {

    protected int getItemByIdRequest;

    /**
     * Gets the value of the getItemByIdRequest property.
     * 
     */
    public int getGetItemByIdRequest() {
        return getItemByIdRequest;
    }

    /**
     * Sets the value of the getItemByIdRequest property.
     * 
     */
    public void setGetItemByIdRequest(int value) {
        this.getItemByIdRequest = value;
    }

}

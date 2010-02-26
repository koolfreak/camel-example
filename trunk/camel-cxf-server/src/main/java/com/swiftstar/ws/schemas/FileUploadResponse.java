
package com.swiftstar.ws.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://swiftstar.com/ws/schemas}FileUploadResponseCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fileUploadResponseCode"
})
@XmlRootElement(name = "FileUploadResponse")
public class FileUploadResponse {

    @XmlElement(name = "FileUploadResponseCode", required = true)
    protected String fileUploadResponseCode;

    /**
     * Gets the value of the fileUploadResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileUploadResponseCode() {
        return fileUploadResponseCode;
    }

    /**
     * Sets the value of the fileUploadResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileUploadResponseCode(String value) {
        this.fileUploadResponseCode = value;
    }

}

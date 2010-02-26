
package com.swiftstar.ws.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://swiftstar.com/ws/schemas}FileUploadDetails"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fileUploadDetails"
})
@XmlRootElement(name = "FileUploadRequest")
public class FileUploadRequest {

    @XmlElement(name = "FileUploadDetails", required = true)
    protected FileUploadDetails fileUploadDetails;
    @XmlAttribute
    protected String version;

    /**
     * Gets the value of the fileUploadDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FileUploadDetails }
     *     
     */
    public FileUploadDetails getFileUploadDetails() {
        return fileUploadDetails;
    }

    /**
     * Sets the value of the fileUploadDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileUploadDetails }
     *     
     */
    public void setFileUploadDetails(FileUploadDetails value) {
        this.fileUploadDetails = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}

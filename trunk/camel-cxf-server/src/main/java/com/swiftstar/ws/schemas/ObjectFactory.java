
package com.swiftstar.ws.schemas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.swiftstar.ws.schemas package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FileUploadResponseCode_QNAME = new QName("http://swiftstar.com/ws/schemas", "FileUploadResponseCode");
    private final static QName _MiddleName_QNAME = new QName("http://swiftstar.com/ws/schemas", "MiddleName");
    private final static QName _Email_QNAME = new QName("http://swiftstar.com/ws/schemas", "Email");
    private final static QName _FirstName_QNAME = new QName("http://swiftstar.com/ws/schemas", "FirstName");
    private final static QName _LastName_QNAME = new QName("http://swiftstar.com/ws/schemas", "LastName");
    private final static QName _BinaryFile_QNAME = new QName("http://swiftstar.com/ws/schemas", "BinaryFile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.swiftstar.ws.schemas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FileUploadRequest }
     * 
     */
    public FileUploadRequest createFileUploadRequest() {
        return new FileUploadRequest();
    }

    /**
     * Create an instance of {@link FileUploadDetails }
     * 
     */
    public FileUploadDetails createFileUploadDetails() {
        return new FileUploadDetails();
    }

    /**
     * Create an instance of {@link FileUploadResponse }
     * 
     */
    public FileUploadResponse createFileUploadResponse() {
        return new FileUploadResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swiftstar.com/ws/schemas", name = "FileUploadResponseCode")
    public JAXBElement<String> createFileUploadResponseCode(String value) {
        return new JAXBElement<String>(_FileUploadResponseCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swiftstar.com/ws/schemas", name = "MiddleName")
    public JAXBElement<String> createMiddleName(String value) {
        return new JAXBElement<String>(_MiddleName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swiftstar.com/ws/schemas", name = "Email")
    public JAXBElement<String> createEmail(String value) {
        return new JAXBElement<String>(_Email_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swiftstar.com/ws/schemas", name = "FirstName")
    public JAXBElement<String> createFirstName(String value) {
        return new JAXBElement<String>(_FirstName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swiftstar.com/ws/schemas", name = "LastName")
    public JAXBElement<String> createLastName(String value) {
        return new JAXBElement<String>(_LastName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://swiftstar.com/ws/schemas", name = "BinaryFile")
    public JAXBElement<byte[]> createBinaryFile(byte[] value) {
        return new JAXBElement<byte[]>(_BinaryFile_QNAME, byte[].class, null, ((byte[]) value));
    }

}

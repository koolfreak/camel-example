package com.swiftstar.ws.definitions;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2.2
 * Fri Feb 26 15:37:44 PHT 2010
 * Generated source version: 2.2.2
 * 
 */
 
@WebService(targetNamespace = "http://swiftstar.com/ws/definitions", name = "UploadResource")
@XmlSeeAlso({com.swiftstar.ws.schemas.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface UploadResource {

    @WebResult(name = "FileUploadResponse", targetNamespace = "http://swiftstar.com/ws/schemas", partName = "FileUploadResponse")
    @WebMethod(operationName = "FileUpload")
    public com.swiftstar.ws.schemas.FileUploadResponse fileUpload(
        @WebParam(partName = "FileUploadRequest", name = "FileUploadRequest", targetNamespace = "http://swiftstar.com/ws/schemas")
        com.swiftstar.ws.schemas.FileUploadRequest fileUploadRequest
    );
}

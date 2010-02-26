package com.g2ix.prototype.impl;

import com.swiftstar.ws.definitions.UploadResource;
import com.swiftstar.ws.schemas.FileUploadRequest;
import com.swiftstar.ws.schemas.FileUploadResponse;



public class UploadRequestServiceImpl implements UploadResource
{

	public FileUploadResponse fileUpload(FileUploadRequest fileUploadRequest)
	{
		System.out.println("********************** HERE IN CAMEL SERVER **************************");
		
		return null;
	}

	

}

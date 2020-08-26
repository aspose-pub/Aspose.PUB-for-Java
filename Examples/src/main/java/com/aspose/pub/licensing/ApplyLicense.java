package com.aspose.pub.licensing;

import java.io.FileNotFoundException;

public class ApplyLicense {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		SetLicenseFromFile();
		
		SetLicenseFromStream();
	}
	
	public static void SetLicenseFromFile() throws Exception
	{
		//ExStart: 1
		com.aspose.pub.License license = new com.aspose.pub.License();
		
		license.setLicense("Aspose.Pub.Java.lic");
		//ExEnd: 1
	}
	
	public static void SetLicenseFromStream() throws FileNotFoundException, Exception
	{
		//ExStart: 2
		com.aspose.pub.License license = new com.aspose.pub.License();
		
		license.setLicense(new java.io.FileInputStream("Aspose.Pub.Java.lic"));		
		//ExEnd: 2
	}

}

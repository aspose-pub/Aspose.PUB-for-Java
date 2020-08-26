package com.aspose.pub.conversion;

import com.aspose.pub.utilities.Utils;
import com.aspose.pub.Document;
import com.aspose.pub.IPubParser;
import com.aspose.pub.PubFactory;

public class ConvertPUBtoPDF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ExStart: 1
		// The path to the documents directory.
        String dataDir = Utils.getDataDir();
        
        String fileName = dataDir + "halloween-flyer.pub";
        
		IPubParser parser = PubFactory.createParser(fileName);

		Document doc = parser.parse();

		com.aspose.pub.PubFactory.createPdfConverter().convertToPdf(doc, dataDir + "halloween-flyer_out.pdf");
		
		System.out.println("Execution done.");
		//ExEnd: 1
	}

}

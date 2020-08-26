package com.aspose.pub.programming.documents;

import com.aspose.pub.Document;
import com.aspose.pub.IPubParser;
import com.aspose.pub.PubFactory;
import com.aspose.pub.utilities.Utils;

public class ManipulatePUBMetaData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// The path to the documents directory.
        String dataDir = Utils.getDataDir();
        
        String fileName = dataDir + "halloween-flyer.pub";
		//ExStart:1
		IPubParser parser = PubFactory.createParser(fileName);
		Document document = parser.parse();

		document.getDocumentSummaryInfo().setCategory("category");
		document.getDocumentSummaryInfo().setCompany("company");
		document.getDocumentSummaryInfo().setLanguage("language");

		document.getSummaryInfo().setComments("comments");
		document.getSummaryInfo().setKeywords("keywords");
		document.getSummaryInfo().setLastAuthor("last author");
		document.getSummaryInfo().setTitle("title");
		document.getSummaryInfo().setSubject("subject");
		
		System.out.println("Execution done.");
		//ExEnd:1
	}

}

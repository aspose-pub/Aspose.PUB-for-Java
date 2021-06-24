![GitHub](https://img.shields.io/github/license/aspose-pub/Aspose.pub-for-java)
# Process PUB files via Java API

[Aspose.PUB for Java](https://products.aspose.com/pub/java) is a Java API that can read, manipulate and convert Microsoft Publisher (.pub) files to PDF. You can use the API in your Java applications to work with .pub files without worrying about the underlying filie format. The API can be used in Java desktop as well as web applications using JSP. The API is light, easy to use and simplifies your application with simple lines of code in your application.

Directory | Description
--------- | -----------
[Examples](Examples) | A collection of Java examples that help you learn the product features.

<p align="center">
  <a title="Download Examples ZIP" href="https://github.com/aspose-pub/Aspose.pub-for-Java/archive/master.zip">
	<img src="https://raw.github.com/AsposeExamples/java-examples-dashboard/master/images/downloadZip-Button-Large.png" />
  </a>
</p>

## PUB Java API Features

- Read Microsoft Publisher (PUB) files for conversion to PDF format.
- Working with Metadata of PUB files.

## Read PUB Files

**Microsoft Publisher:** PUB

## Save PUB As

**Fixed Layout:** PDF

## Supported Environments

- **Microsoft Windows:** Windows Desktop & Server (x86, x64)
- **macOS:** Mac OS X
- **Linux:** Ubuntu, CentOS, and others
- **Java Versions:** `J2SE 8.0 (1.8)` or above

## Get Started with Aspose.PUB for Java

Aspose hosts all Java APIs at the [Aspose Repository](https://repository.aspose.com/webapp/#/artifacts/browse/tree/General/repo/com/aspose/aspose-pub). You can easily use Aspose.PUB for Java API directly in your Maven projects with simple configurations. For the detailed instructions please visit [Installing Aspose.PUB for Java from Aspose Repository](https://docs.aspose.com/pub/java/installation/) documentation page.

## Edit Metadata of Microsoft Publisher Files using Java

```java
// For complete examples and data files, please go to https://github.com/aspose-pub/Aspose.PUB-for-Java
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
```

[Home](https://www.aspose.com/) | [Product Page](https://products.aspose.com/pub/java) | [Docs](https://docs.aspose.com/pub/java/) | [API Reference](https://apireference.aspose.com/pub/java) | [Examples](https://github.com/aspose-pub/Aspose.PUB-for-Java/tree/master/Examples) | [Blog](https://blog.aspose.com/category/pub/) | [Search](https://search.aspose.com/) | [Free Support](https://forum.aspose.com/c/pub) | [Temporary License](https://purchase.aspose.com/temporary-license)

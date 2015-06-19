package com.imooc.dmtest.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.xml.sax.DocumentHandler;

public class DOM4JTest {

	// 可以用list保存读取的book信息

	public void parserXML() {
		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read(new File("src/res/books.xml"));

			Element bookstore = document.getRootElement();
			Iterator<Element> it = bookstore.elementIterator();
			while (it.hasNext()) {

				Element book = (Element) it.next();

				List<Attribute> bookAttrs = book.attributes();// Attribute
				for (Attribute attr : bookAttrs) {
					System.out
							.println(attr.getName() + " : " + attr.getValue());
				}

				Iterator itt = book.elementIterator();
				while (itt.hasNext()) {
					Element bookChild = (Element) itt.next();
					System.out.println("  " + bookChild.getName() + ":"
							+ bookChild.getStringValue());
				}

			}

		} catch (DocumentException e) {
			e.printStackTrace();
		}

	}

	public void createXML(){
		Document document=DocumentHelper.createDocument();
		Element rss=document.addElement("rss");
		rss.addAttribute("Version", "2.0");
		Element channel=rss.addElement("channel");
		Element title=channel.addElement("title");
		title.setText("<国内最新新闻>");
		
		
		OutputFormat format=OutputFormat.createPrettyPrint();
		File file=new File("rssnews.xml");
		XMLWriter writer;
		try {
			writer=new XMLWriter(new FileOutputStream(file),format);
			writer.setEscapeText(false);//不转义，<>
			writer.write(document);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		DOM4JTest d4j=new DOM4JTest();
		d4j.createXML();
	}

}

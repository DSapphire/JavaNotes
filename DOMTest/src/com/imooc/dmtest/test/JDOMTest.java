package com.imooc.dmtest.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class JDOMTest {

	// 可以用list保存读取的book信息

	public void parserXML() {
		SAXBuilder saxBuilder = new SAXBuilder();
		InputStream in;
		try {
			in = new FileInputStream("src/res/books.xml");
			Document document = saxBuilder.build(in);
			Element rootElement = document.getRootElement();

			List<Element> bookList = rootElement.getChildren();

			for (Element book : bookList) {
				System.out.println("start :" + (bookList.indexOf(book) + 1)
						+ " book");

				List<Attribute> attrList = book.getAttributes();// Attributes
																// 的name和属性，id和1
				for (Attribute attr : attrList) {
					String attrName = attr.getName();
					String attrValue = attr.getValue();
					System.out.println(attrName + " : " + attrValue);

				}

				List<Element> bookChilds = book.getChildren();
				for (Element child : bookChilds) {
					System.out.println(child.getName() + " : "
							+ child.getValue());// 节点的名字和中间的属性
				}
				System.out.println("end :" + (bookList.indexOf(book) + 1)
						+ " book");
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JDOMException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void createXML(){
		Element rss=new Element("rss");
		rss.setAttribute("Version","2.0");
		Document document=new Document(rss);
		Element channel=new Element("channel");
		rss.addContent(channel);
		Element title=new Element("title");
		title.setText("<国内最新新闻>");//???
		channel.addContent(title);
		
		Format format=Format.getCompactFormat();
		format.setIndent("");
		//format.setEncoding("UTF-8");
		
		XMLOutputter outputter=new XMLOutputter(format);
		try {
			outputter.output(document, new FileOutputStream(new File("jdrssnews.xml")));
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		JDOMTest jmt=new JDOMTest();
		jmt.createXML();
	}

}

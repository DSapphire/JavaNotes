package com.imooc.dmtest.test;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMTest {

	public DocumentBuilder getDocumentBuilder(){
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		DocumentBuilder db=null;
		try {
			db=dbf.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return db;
	}
	public  void xmlParser(){

		try {
			Document document=getDocumentBuilder().parse("books.xml");
			NodeList bookList= document.getElementsByTagName("book");
			System.out.println(bookList.getLength());
			for(int i=0;i<bookList.getLength();i++){
				System.out.println((i+1)+"book");
				Node book= bookList.item(i);
				
				NamedNodeMap attrs=book.getAttributes();
				
				for(int j=0;j<attrs.getLength();j++){
					Node attr= attrs.item(j);
					System.out.print("NodeName:"+attr.getNodeName()+"\t");
					System.out.println("NodeValue:"+attr.getNodeValue());
				}
				
				NodeList childNode =book.getChildNodes();// 换行也是子节点！
				for(int j=0;j<childNode.getLength();j++){
					if(childNode.item(j).getNodeType()==Node.ELEMENT_NODE){//去掉#text
						System.out.print(childNode.item(j).getNodeName()+"\t");
						System.out.print(childNode.item(j).getFirstChild().getNodeValue()+"\t");
						System.out.println(childNode.item(j).getTextContent());
					}
				}
				
			}
		}catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void createXML(){
		Document document=getDocumentBuilder().newDocument();
		document.setXmlStandalone(true);
		Element bookstore=document.createElement("bookstore");
		Element book=document.createElement("book");
		Element name=document.createElement("name");
		//name.setNodeValue("xiaowangzi");
		name.setTextContent("Xiaowangzi");
		book.appendChild(name);
		book.setAttribute("id","1");
		bookstore.appendChild(book);
		document.appendChild(bookstore);
		
		TransformerFactory tff=TransformerFactory.newInstance();
		try {
			Transformer tf=tff.newTransformer();
			tf.setOutputProperty(OutputKeys.INDENT, "yes");
			tf.transform(new DOMSource(document),
					new StreamResult(new File("books1.xml")));
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		DOMTest dtest=new DOMTest();
		dtest.createXML();
	}

}

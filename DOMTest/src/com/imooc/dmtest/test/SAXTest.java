package com.imooc.dmtest.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

import com.imooc.entity.Book;
import com.imooc.handler.SAXParserHandler;

public class SAXTest {

	public ArrayList<Book> parserXML(){
		SAXParserFactory factory=SAXParserFactory.newInstance();
		SAXParserHandler handler=null;
		try {
			SAXParser parser=factory.newSAXParser();
			handler =new SAXParserHandler();
			parser.parse("books.xml", handler);
			System.out.println("~~~"+handler.getBookList().size()+" books");
			for(Book book:handler.getBookList()){
				System.out.println(book);
			}
		} catch (ParserConfigurationException | SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return handler.getBookList();
	}
	public void createXML(ArrayList<Book> bookList){
		SAXTransformerFactory tff=(SAXTransformerFactory)SAXTransformerFactory
				.newInstance();
		try {
			TransformerHandler handler=tff.newTransformerHandler();
			Transformer tr=handler.getTransformer();
			
			tr.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			tr.setOutputProperty(OutputKeys.INDENT, "yes");
			
			File f=new File("src/res/newbooks.xml");
			if(!f.exists())
				f.createNewFile();
			
			Result result=new StreamResult(new FileOutputStream(f));
			handler.setResult(result);


			handler.startDocument();
			AttributesImpl attr=new AttributesImpl();
			handler.startElement("", "", "bookstore", attr);
			for(Book book:bookList){
				attr.clear();
				attr.addAttribute("", "","id","", book.getId());
				handler.startElement("", "", "book", attr);
				
				attr.clear();
				handler.startElement("", "", "name", attr);
				handler.characters(book.getName().toCharArray(),0,book
						.getName().length());
				handler.endElement("", "", "name");
				
				handler.endElement("", "", "book");
			}
			
			handler.endElement("", "", "bookstore");
			handler.endDocument();
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		SAXTest st=new SAXTest();
		st.createXML(st.parserXML());
	}

}

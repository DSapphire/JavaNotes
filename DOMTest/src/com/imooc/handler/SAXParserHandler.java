package com.imooc.handler;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.imooc.entity.Book;

public class SAXParserHandler extends DefaultHandler {

	int bookIndex=0;
	String value="";
	Book book=null;
	private ArrayList<Book> bookList=new ArrayList<Book>();
	public ArrayList<Book> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(uri, localName, qName, attributes);
		//开始解析book属性
		if(qName.equals("book")){
			//String value=attributes.getValue("id");//已知id属性
			//System.out.println(value);
			bookIndex++;
			book=new Book();
			int num=attributes.getLength();
			for(int i=0;i<num;i++){
				System.out.print(attributes.getQName(i)+"\t");
				System.out.println(attributes.getValue(i));
				if(attributes.getQName(i).equals("id")){
					book.setId(attributes.getValue(i));
				}
			}
		}else if(!qName.equals("bookstore")){
			System.out.print(qName+"\t");
			
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
		value=new String(ch, start, length);
		if(!value.trim().equals("")){
			System.out.println(value);
		}
		
	}
	
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
		if(qName.equals("book")){
			bookList.add(book);
			book=null;
			System.out.println(bookIndex+"==========over=========");
		}else if(qName.equals("name")){
			book.setName(value);
		}else if(qName.equals("year")){
			book.setYear(value);
		}else if(qName.equals("author")){
			book.setAuthor(value);
		}else if(qName.equals("price")){
			book.setPrice(value);
		}else if(qName.equals("language")){
			book.setLanguage(value);
		}
	}
	
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
		System.out.println("SAX Start");
	}
	
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
		System.out.println("SAX End");
	}
	
}

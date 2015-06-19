import java.io.*;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class TestXML{
	private final String httpStr="http://www.w3.org/2001/XMLSchema";
	public void test(File xml,File xsd){
		MyHandler handler=new MyHandler();
		try{
			SchemaFactory factory=SchemaFactory.newInstance(httpStr);
			Schema schema=factory.newSchema(xsd);
			Validator validator=schema.newValidator();
			validator.setErrorHandler(handler);
			validator.validate(new StreamSource(xml));
		}catch (Exception e) {
			e.printStackTrace();
		}
		if(handler.errorMessage==null){
			System.out.println("File "+xml.getName()+" is validated.");
		}else{
			System.out.println("File "+xml.getName()+" is not validated.");
		}
	}
	public static void main(String[] args) {
		
	}
}
class MyHandler extends DefaultHandler{
	String errorMessage=null;
	public void error(SAXParseException e)throws SAXException{
		errorMessage=e.getMessage();
		int row=e.getLineNumber();
		System.out.println("Error :"+errorMessage+" located in "+
			row+" line.");
	}
	public void fatalError(SAXParseException e)throws SAXException{
		errorMessage=e.getMessage();
		int row=e.getLineNumber();
		System.out.println("FatalError :"+errorMessage+" located in "+
			row+" line.");
	}
}
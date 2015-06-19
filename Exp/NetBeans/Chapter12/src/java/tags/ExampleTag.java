package tags;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;

public class ExampleTag extends TagSupport{
    public int doStartTag(){
	try{
            JspWriter out=pageContext.getOut ();			out.print((int)(Math.random ()*100));
            out.print(" My first tag test!");	
	}
	catch(IOException ioe){
            System.out.println("Error in ExampleTag:"+ioe);
	}
	return(SKIP_BODY);
    }
}

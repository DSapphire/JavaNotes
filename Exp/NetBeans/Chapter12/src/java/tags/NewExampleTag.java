package tags;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
public class NewExampleTag extends TagSupport{
    protected int range=100;
    public int doStartTag(){
        try
        {
            JspWriter out=pageContext.getOut ();
            out.print((int)(Math.random ()*range));
            out.print(" Tag test with attribute! ");
        }
        catch(IOException ioe)
        {
            System.out.println("Error in ExampleTag:"+ioe);
        }
        return(SKIP_BODY);
    }
    public void setRange(String range){
    try
    {
	this.range=Integer.parseInt (range);
    }
    catch(NumberFormatException nfe)
    {
	this.range=100;
    }
}
}
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ShoppingServlet extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
	HttpSession session=req.getSession();
	Vector buyList=(Vector)session.getAttribute("shoppingcart");
	String action=req.getParameter("action");
	if(action.equals("ADD"))
	{
            boolean match=false;
            String name=req.getParameter ("name");
            String quantity=req.getParameter ("quantity");
            String author=req.getParameter ("author");
            String publisher=req.getParameter ("publisher");
            String price=req.getParameter ("price");
            myBeans.BookBean bk=new myBeans.BookBean();
            bk.setName(name);
            bk.setAuthor(author);
            bk.setPublisher(publisher);
            bk.setPrice(Float.parseFloat (price));
            bk.setQuantity(Integer.parseInt (quantity));
            if(buyList==null)
            {
                buyList=new Vector();
                buyList.addElement(bk);
            }
            else
            {
                for(int i=0;i<buyList.size();i++)
                {
                    myBeans.BookBean book=(myBeans.BookBean)buyList.elementAt(i);
                    if(book.getName().equals(bk.getName()))
                    {
                        book.setQuantity(book.getQuantity()+bk.getQuantity());
                        buyList.setElementAt(book,i);
                        match=true;
                    }
                }
                if(!match) buyList.addElement(bk);
            }
            session.setAttribute("shoppingcart",buyList);
            String url="/Shopping.jsp";
            RequestDispatcher rd=req.getRequestDispatcher(url);
            rd.forward(req,res);				
	}
	else if(action.equals ("CHECKOUT"))
	{
            float total=0;
            for(int i=0;i<buyList.size();i++)
            {
                myBeans.BookBean order=(myBeans.BookBean)buyList.elementAt(i);
                float price=order.getPrice();
                int quantity=order.getQuantity();
                total+=(price*quantity);
            }
            session.setAttribute("amount",""+total);
            String url="/Checkout.jsp";
            RequestDispatcher rd=req.getRequestDispatcher (url);
            rd.forward(req,res);
	}
    }
}
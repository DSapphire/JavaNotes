import java.io.*;
public class ex3_2
{
   public static void main(String[ ] args)throws IOException
   {
      int x,y;
      BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in));
      System.out.println("Enter x and y:");
      x=(new Integer(in.readLine())).intValue();
      y=(new Integer(in.readLine())).intValue();
      if (x!=y)
        if (x>y)   System.out.println("x>y");
        else        System.out.println("x<y");
      else   System.out.println("x=y");
   }
}

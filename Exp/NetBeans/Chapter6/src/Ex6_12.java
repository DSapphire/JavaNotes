import java.io.*;
public class Ex6_12
{
	public static void main(String[] args) throws IOException
	{
	FileInputStream s=new FileInputStream("c:/Hello.txt");
          int c;
          while ((c = s.read()) != -1)  System.out.write(c);     
          s.close();
        }
}

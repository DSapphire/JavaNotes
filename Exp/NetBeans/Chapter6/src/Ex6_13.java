import java.io.*;
public class Ex6_13
{
	public static void main(String[] args)
	{
		File f=new File("c:"+File.separator+"Hello.txt"); //调用File类的静态属性
		if(f.exists())
			f.delete();
		else
		try
		{
			f.createNewFile();
		}
		catch(Exception e)
		{ 	System.out.println(e.getMessage());
		}
	}
}

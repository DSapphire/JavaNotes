import java.io.*;
public class Ex6_13
{
	public static void main(String[] args)
	{
		File f=new File("c:"+File.separator+"Hello.txt"); //����File��ľ�̬����
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

import java.io.*;
public class Ex8_12
{
	public static void main(String[] args) throws IOException
	{
		TestThread t=new TestThread();
	    t.start();
		new BufferedReader(new InputStreamReader(System.in)).readLine(); //等待键盘输入
		t.stopme();   //调用stopme方法结束t线程
	}
}
class TestThread extends Thread
{
	private boolean flag=true;
	public void stopme()    //在此方法中控制循环条件
	{
		flag=false;
	}
	public void run()
	{
		int i=0;
		while(flag)   
		{
			System.out.println(i++);  //如果flag为真则一直显示递增整数
		}
	}
}
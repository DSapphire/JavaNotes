import java.io.*;
public class Ex8_12
{
	public static void main(String[] args) throws IOException
	{
		TestThread t=new TestThread();
	    t.start();
		new BufferedReader(new InputStreamReader(System.in)).readLine(); //�ȴ���������
		t.stopme();   //����stopme��������t�߳�
	}
}
class TestThread extends Thread
{
	private boolean flag=true;
	public void stopme()    //�ڴ˷����п���ѭ������
	{
		flag=false;
	}
	public void run()
	{
		int i=0;
		while(flag)   
		{
			System.out.println(i++);  //���flagΪ����һֱ��ʾ��������
		}
	}
}
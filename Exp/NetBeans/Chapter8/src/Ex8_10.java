public class Ex8_10
{
	public static void main(String[] args)
	{
		ThreadTest t=new ThreadTest();
		t.setDaemon(true);
		t.start();
	}
}
class ThreadTest extends Thread
{
	public void run()
	{
		while(true){}
	}
}

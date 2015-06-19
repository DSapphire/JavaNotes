public class Ex8_6
{
	public static void main(String[] args)
	{
		SellTickets t=new SellTickets();   //新建一个售票类的对象
		new Thread(t).start();      //用此对象作为参数创建3个新线程并启动
		new Thread(t).start();
		new Thread(t).start();
	}
}
class SellTickets implements Runnable
{
	private int tickets=200;   //将共享的资源作为私有变量
	public void run()
	{
		while(tickets>0)   //直到没有票可售为止
		{
			System.out.println(Thread.currentThread().getName()
			+" is selling ticket "+tickets--);
		}
	}
}

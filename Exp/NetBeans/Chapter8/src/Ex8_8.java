public class Ex8_8
{
	public static void main(String[] args)
	{
	Tickets t=new Tickets(10);
	new Producer(t).start();
	new Consumer(t).start();
	}
}
class Tickets
{
	int size;  //票总数
	int number=0;  //存票序号
	int i=0;   //售票序号
	boolean available=false;  //是否有待售的票
	public Tickets(int size)
	{
	this.size=size;
	}
	public synchronized void put()   //同步方法，实现存票的功能
	{
	System.out.println("Producer puts ticket "+(++number));
	available=true;		
	}	
	public synchronized void sell()   //同步方法，实现售票的功能
	{
	if(available==true && i<=number)
	System.out.println("Consumer buys ticket "+(++i));			
	if(i==number)   available=false;	
	}	
}
class Producer extends Thread
{
	Tickets t=null;
	public Producer(Tickets t)  //构造函数，使两线程共享票类对象
	{
	this.t=t;
	}
	public void run()
	{
	while(t.number<t.size)  //如果存票数小于限定总量，则不断往入存票
	t.put();
	}	
}

class Consumer extends Thread
{
	Tickets t=null;
	public Consumer(Tickets t)  //构造函数，使两线程共享票类对象
	{
	this.t=t;
	}
	public void run()
	{
	while(t.i<t.size)  //如果售票数小于限定总量，则不断售票
	t.sell();
	}
}

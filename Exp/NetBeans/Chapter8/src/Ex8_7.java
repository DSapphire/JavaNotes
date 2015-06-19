public class Ex8_7
{
	public static void main(String[] args)
	{
		Tickets t=new Tickets(10); //新建一个票类对象，总票数作为参数
                new Consumer(t).start(); //以同一个票类对象为参数创建售票线程，并启动
		new Producer(t).start();  //以票类对象为参数创建存票线程对象，并启动		
	}
}

class Tickets    //票类
{
	int number=0;          //票号
	int size;               //总票数
	boolean available=false;  //表示目前是否有票可售
	public Tickets(int size)  //构造函数，传入总票数参数
	{
		this.size=size;     
	}		
}

class Producer extends Thread  //存票线程
{
	Tickets t=null;
	public Producer(Tickets t)  //构造函数以一个票类对象为参数
	{
		this.t=t;
	}
	public void run()
	{
		while( t.number < t.size)  //限制循环条件为存票序号小于总票数
		{
			System.out.println("Producer puts ticket "+(++t.number));
			t.available=true;  //可以卖票
		}			
	}
}

class Consumer extends Thread  //售票线程
{
	Tickets t=null;
	int i=0;
	public Consumer(Tickets t)  //构造函数以一个票类对象为参数
	{
		this.t=t;
	}
	public void run()
	{
		while(i<t.size)   //循环条件为售票序号小于总票数
		{
			if(t.available==true && i<=t.number)  //有票可售且小于目前票序号
			  System.out.println("Consumer buys ticket "+(++i));
			if(i==t.number)  //如果票已售到当前序号，则不可售
                      {
 //                           try{
 //                               Thread.sleep(1);
 //                           }
//                            catch ( InterruptedException exception ) {};
			    t.available=false;
                        }
		}				
	}
}

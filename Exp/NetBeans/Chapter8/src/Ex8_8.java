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
	int size;  //Ʊ����
	int number=0;  //��Ʊ���
	int i=0;   //��Ʊ���
	boolean available=false;  //�Ƿ��д��۵�Ʊ
	public Tickets(int size)
	{
	this.size=size;
	}
	public synchronized void put()   //ͬ��������ʵ�ִ�Ʊ�Ĺ���
	{
	System.out.println("Producer puts ticket "+(++number));
	available=true;		
	}	
	public synchronized void sell()   //ͬ��������ʵ����Ʊ�Ĺ���
	{
	if(available==true && i<=number)
	System.out.println("Consumer buys ticket "+(++i));			
	if(i==number)   available=false;	
	}	
}
class Producer extends Thread
{
	Tickets t=null;
	public Producer(Tickets t)  //���캯����ʹ���̹߳���Ʊ�����
	{
	this.t=t;
	}
	public void run()
	{
	while(t.number<t.size)  //�����Ʊ��С���޶��������򲻶������Ʊ
	t.put();
	}	
}

class Consumer extends Thread
{
	Tickets t=null;
	public Consumer(Tickets t)  //���캯����ʹ���̹߳���Ʊ�����
	{
	this.t=t;
	}
	public void run()
	{
	while(t.i<t.size)  //�����Ʊ��С���޶��������򲻶���Ʊ
	t.sell();
	}
}

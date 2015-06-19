public class Ex8_7
{
	public static void main(String[] args)
	{
		Tickets t=new Tickets(10); //�½�һ��Ʊ�������Ʊ����Ϊ����
                new Consumer(t).start(); //��ͬһ��Ʊ�����Ϊ����������Ʊ�̣߳�������
		new Producer(t).start();  //��Ʊ�����Ϊ����������Ʊ�̶߳��󣬲�����		
	}
}

class Tickets    //Ʊ��
{
	int number=0;          //Ʊ��
	int size;               //��Ʊ��
	boolean available=false;  //��ʾĿǰ�Ƿ���Ʊ����
	public Tickets(int size)  //���캯����������Ʊ������
	{
		this.size=size;     
	}		
}

class Producer extends Thread  //��Ʊ�߳�
{
	Tickets t=null;
	public Producer(Tickets t)  //���캯����һ��Ʊ�����Ϊ����
	{
		this.t=t;
	}
	public void run()
	{
		while( t.number < t.size)  //����ѭ������Ϊ��Ʊ���С����Ʊ��
		{
			System.out.println("Producer puts ticket "+(++t.number));
			t.available=true;  //������Ʊ
		}			
	}
}

class Consumer extends Thread  //��Ʊ�߳�
{
	Tickets t=null;
	int i=0;
	public Consumer(Tickets t)  //���캯����һ��Ʊ�����Ϊ����
	{
		this.t=t;
	}
	public void run()
	{
		while(i<t.size)   //ѭ������Ϊ��Ʊ���С����Ʊ��
		{
			if(t.available==true && i<=t.number)  //��Ʊ������С��ĿǰƱ���
			  System.out.println("Consumer buys ticket "+(++i));
			if(i==t.number)  //���Ʊ���۵���ǰ��ţ��򲻿���
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

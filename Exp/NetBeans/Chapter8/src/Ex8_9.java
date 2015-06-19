public class Ex8_9
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
		int size;
		int number=0;
		boolean available=false;
		public Tickets(int size)
		{
			this.size=size;
		}
		public synchronized void put()
		{
			if(available)  //������д�Ʊ���ۣ����Ʊ�̵߳ȴ�
			try{wait();} catch(Exception e){}
			System.out.println("Producer puts ticket "+(++number));
			available=true;	
			notify();	//��Ʊ������Ʊ�߳̿�ʼ��Ʊ
		}	
		public synchronized void sell()
		{
			if(!available)   //���û�д�Ʊ������Ʊ�̵߳ȴ�
			try{wait();} catch(Exception e){}		
			System.out.println("Consumer buys ticket "+(number));			
			available=false;
			notify();	   //��Ʊ���Ѵ�Ʊ�߳̿�ʼ��Ʊ
          if (number==size) number=size+1 ; //���������һ��Ʊ������һ��������־
            // number>size��ʾ��Ʊ����
		}	
}

class Producer extends Thread
{
		Tickets t=null;
		public Producer(Tickets t)
		{
		this.t=t;
		}
		public void run()
		{
			while(t.number<t.size)		
				t.put();							
		}	
}

class Consumer extends Thread
{
		Tickets t=null;
		public Consumer(Tickets t)
		{
			this.t=t;
		}
		public void run()
		{
			while(t.number<=t.size)
            t.sell();				
		}	
	}

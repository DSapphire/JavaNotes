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
			if(available)  //如果还有存票待售，则存票线程等待
			try{wait();} catch(Exception e){}
			System.out.println("Producer puts ticket "+(++number));
			available=true;	
			notify();	//存票后唤醒售票线程开始售票
		}	
		public synchronized void sell()
		{
			if(!available)   //如果没有存票，则售票线程等待
			try{wait();} catch(Exception e){}		
			System.out.println("Consumer buys ticket "+(number));			
			available=false;
			notify();	   //售票后唤醒存票线程开始存票
          if (number==size) number=size+1 ; //在售完最后一张票后，设置一个结束标志
            // number>size表示售票结束
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

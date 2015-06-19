public class Ex8_5
{
   public static void main( String [] args )
   {
      //ֻ����1��ʵ��Runnable�ӿ���Ķ���
      TestThread threadobj = new TestThread();        
      System.out.println( "Starting threads" );
      //ֻ��һ��Runnable���Ͷ���Ϊ���������������̣߳��ֱ�����������֮  
      new Thread(threadobj,"Thread1").start();  
      new Thread(threadobj,"Thread2").start();
      new Thread(threadobj,"Thread3").start();        
      System.out.println( "Threads started, main ends\n" );        
   }     
}

class TestThread implements Runnable {
   private int sleepTime;   
   public TestThread()//���캯��
   {
      sleepTime = ( int ) ( Math.random() * 6000 );//��������Ϣ������
   }       
   public void run() //run�������߳���������ʼ���к�Ҫִ�еķ���
   {      
      try {
         System.out.println( 
            Thread.currentThread().getName() + " going to sleep for " + sleepTime );            
         Thread.sleep( sleepTime ); //�߳�����
      } 
      catch ( InterruptedException exception ) {};
      System.out.println( Thread.currentThread().getName() + " finished" );
      //���н�����������ʾ��Ϣ    
   }     
}

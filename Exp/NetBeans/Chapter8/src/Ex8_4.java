public class Ex8_4
{
   public static void main( String [] args )
   {
   	  //����3��ʵ��Runnable�ӿ���Ķ���
      TestThread thread1 = new TestThread();
      TestThread thread2 = new TestThread();
      TestThread thread3 = new TestThread();
        
      System.out.println( "Starting threads" );
      //�ֱ�����������Ϊ���������������̣߳��ڶ�������Ϊ���߳�����������֮  
      new Thread(thread1,"Thread1").start();  
      new Thread(thread2,"Thread2").start();
      new Thread(thread3,"Thread3").start();
        
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
       //��������8_2����Ϊ���Ǽ̳�Thread�࣬��������ȵ���currentThread����
         Thread.sleep( sleepTime ); //�߳�����
      } 
      catch ( InterruptedException exception ) {};
System.out.println( Thread.currentThread().getName() + " finished" );
//���н�����������ʾ��Ϣ    
   }     
}

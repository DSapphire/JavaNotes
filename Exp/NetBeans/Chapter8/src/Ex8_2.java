public class Ex8_2
{
   public static void main( String [] args )
   {
      //����������ÿ���߳�
      TestThread thread1 = new TestThread( "thread1" );
      TestThread thread2 = new TestThread( "thread2" );
      TestThread thread3 = new TestThread( "thread3" );
        
      System.out.println( "Starting threads" );
        
      thread1.start(); // �����߳�1
      thread2.start(); // �����߳�2
      thread3.start(); // �����߳�3
        
      System.out.println( "Threads started, main ends\n" );        
   }     
}
class TestThread extends Thread {
   private int sleepTime;   
   public TestThread( String name )//���캯��
   {
      super( name );  //���û��๹�캯��Ϊ�߳�����
      sleepTime = ( int ) ( Math.random() * 6000 );//��������Ϣ������
   }       
   public void run() //run�������߳���������ʼ���к�Ҫִ�еķ���
   {      
      try {
         System.out.println( 
            getName() + " going to sleep for " + sleepTime );
            
         Thread.sleep( sleepTime ); //�߳�����
      } 
      catch ( InterruptedException exception ) {};
      System.out.println( getName() + " finished" );//���н�����������ʾ��Ϣ    
   }     
}

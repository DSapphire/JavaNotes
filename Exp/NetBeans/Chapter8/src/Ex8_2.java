public class Ex8_2
{
   public static void main( String [] args )
   {
      //创建并命名每个线程
      TestThread thread1 = new TestThread( "thread1" );
      TestThread thread2 = new TestThread( "thread2" );
      TestThread thread3 = new TestThread( "thread3" );
        
      System.out.println( "Starting threads" );
        
      thread1.start(); // 启动线程1
      thread2.start(); // 启动线程2
      thread3.start(); // 启动线程3
        
      System.out.println( "Threads started, main ends\n" );        
   }     
}
class TestThread extends Thread {
   private int sleepTime;   
   public TestThread( String name )//构造函数
   {
      super( name );  //调用基类构造函数为线程命名
      sleepTime = ( int ) ( Math.random() * 6000 );//获得随机休息毫秒数
   }       
   public void run() //run方法是线程启动并开始运行后要执行的方法
   {      
      try {
         System.out.println( 
            getName() + " going to sleep for " + sleepTime );
            
         Thread.sleep( sleepTime ); //线程休眠
      } 
      catch ( InterruptedException exception ) {};
      System.out.println( getName() + " finished" );//运行结束，给出提示信息    
   }     
}

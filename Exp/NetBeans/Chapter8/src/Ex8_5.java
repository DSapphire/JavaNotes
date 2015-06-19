public class Ex8_5
{
   public static void main( String [] args )
   {
      //只创建1个实现Runnable接口类的对象
      TestThread threadobj = new TestThread();        
      System.out.println( "Starting threads" );
      //只用一个Runnable类型对象为参数创建三个新线程，分别命名并启动之  
      new Thread(threadobj,"Thread1").start();  
      new Thread(threadobj,"Thread2").start();
      new Thread(threadobj,"Thread3").start();        
      System.out.println( "Threads started, main ends\n" );        
   }     
}

class TestThread implements Runnable {
   private int sleepTime;   
   public TestThread()//构造函数
   {
      sleepTime = ( int ) ( Math.random() * 6000 );//获得随机休息毫秒数
   }       
   public void run() //run方法是线程启动并开始运行后要执行的方法
   {      
      try {
         System.out.println( 
            Thread.currentThread().getName() + " going to sleep for " + sleepTime );            
         Thread.sleep( sleepTime ); //线程休眠
      } 
      catch ( InterruptedException exception ) {};
      System.out.println( Thread.currentThread().getName() + " finished" );
      //运行结束，给出提示信息    
   }     
}

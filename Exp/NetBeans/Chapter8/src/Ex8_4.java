public class Ex8_4
{
   public static void main( String [] args )
   {
   	  //创建3个实现Runnable接口类的对象
      TestThread thread1 = new TestThread();
      TestThread thread2 = new TestThread();
      TestThread thread3 = new TestThread();
        
      System.out.println( "Starting threads" );
      //分别以三个对象为参数创建三个新线程，第二个参数为新线程命名并启动之  
      new Thread(thread1,"Thread1").start();  
      new Thread(thread2,"Thread2").start();
      new Thread(thread3,"Thread3").start();
        
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
       //区别于例8_2，因为不是继承Thread类，因而必须先调用currentThread方法
         Thread.sleep( sleepTime ); //线程休眠
      } 
      catch ( InterruptedException exception ) {};
System.out.println( Thread.currentThread().getName() + " finished" );
//运行结束，给出提示信息    
   }     
}

public class Ex8_3
{
   public static void main( String [] args )
   {
      System.out.println("main thread starts");
      FactorialThread t=new FactorialThread(10);
      new Thread(t).start();
      System.out.println("new thread started,main thread ends " );   
   } // end main    
} 

// class FactorialThread controls thread execution
class FactorialThread implements Runnable
{
   private int num;  
   public FactorialThread( int num )
   {
      this.num=num;
   } 
   public void run()
   {  
      int i=num; 
      int result=1;   
      while(i>0)
      {
      	result=result*i;
      	i=i-1;
      }
      System.out.println("The factorial of "+num+" is "+result);  
      System.out.println("new thread ends");  
   }     
} 

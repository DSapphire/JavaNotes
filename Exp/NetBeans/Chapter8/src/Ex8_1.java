public class Ex8_1
{
   public static void main( String [] args )
   {
        System.out.println("main thread starts");
        FactorialThread thread=new FactorialThread(10);
        thread.start();        
        System.out.println("main thread ends " );        
   } // end main    
} 

// class FactorialThread controls thread execution
class FactorialThread extends Thread {
   private int num;  
   public FactorialThread( int num )
   {
      this.num=num;
   } 
   public void run()
   {  
      int i=num; 
      int result=1;   
      System.out.println("new thread started" );        
      while(i>0)
      {
      	result=result*i;
      	i=i-1;
      }
      System.out.println("The factorial of "+num+" is "+result);  
      System.out.println("new thread ends");  
   }     
} 

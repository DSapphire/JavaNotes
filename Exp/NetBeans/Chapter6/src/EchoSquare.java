import java.io.*;
class EchoSquare { 
    public static void main (String[] args) throws IOException{
         BufferedReader stdin = new BufferedReader ( new  
                                        InputStreamReader( System.in ) );
         System.out.println("Enter an integer:");
         String inData = stdin.readLine();
         int num   = Integer.parseInt( inData ); 
         int square = num * num ;        
         System.out.println("The square of " + inData + " is " + square );
  }
} 

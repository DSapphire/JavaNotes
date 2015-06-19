//Ex6_11
import java.io.*;
class Ex6_11
{
public static void main ( String[] args ) 
    {
    	String fileName = "c:/data1.dat" ;   long sum = 0;
    	try
    	{
    	DataInputStream instr = new DataInputStream(
          new BufferedInputStream(new FileInputStream(fileName)));
        try
        {
          while ( true )
          sum += instr.readInt();
        }
        catch ( EOFException  eof )
        {
          System.out.println( "The sum is: " + sum );
          instr.close();
        }
    }
    catch ( IOException iox )
    {
    	System.out.println("IO Problems with " + fileName ); }
    }
}

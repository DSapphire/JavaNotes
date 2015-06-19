import java.io.*;
class Ex6_10
{
    public static void main ( String[] args ) 
    {
    	String fileName = "c:\\data1.dat";
    	int sum = 0;
        try
        {
            DataInputStream instr = new DataInputStream(
            new BufferedInputStream(new FileInputStream( fileName  ) ) );
            sum += instr.readInt();
            sum += instr.readInt();  
            sum += instr.readInt();
            System.out.println( "The sum is: " + sum );
            instr.close();
        }
    	catch ( IOException iox )
    	{
            System.out.println("Problem reading " + fileName ); 
        }
    }
}

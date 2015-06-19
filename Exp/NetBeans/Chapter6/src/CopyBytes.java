import java.io.*; 
class CopyBytes {
  public static void main ( String[] args ) {
    DataInputStream  instr;
    DataOutputStream outstr;
    if ( args.length != 2 ) {
        System.out.println("Please enter file names");
        return;
    }
    try { 
         instr = new DataInputStream(new   
            BufferedInputStream(new FileInputStream( args[0] )));
         outstr = new DataOutputStream(new  
            BufferedOutputStream(new FileOutputStream( args[1] )));       
        try { 
           int data;
           while ( true ) { 
               data = instr.readUnsignedByte() ;
               outstr.writeByte( data ) ;
            }
        }
        catch ( EOFException  eof ) { 
            outstr.close();   
            instr.close(); 
            return;     
        }
     }
     catch ( FileNotFoundException nfx )
     {   System.out.println("Problem opening files" );    }
     catch ( IOException iox )
     {   System.out.println("IO Problems" );    }
  }
}

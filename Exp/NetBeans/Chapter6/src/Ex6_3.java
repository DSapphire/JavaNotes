import java.io.*;   
class Ex6_3 {
  public static void main ( String[] args ) {
    String fileName = "c:\\Hello.txt" ;
    try {   //������IO��������try����
        FileWriter writer = new FileWriter( fileName ,true );
 	writer.write( "Hello!\n");  
    	writer.write( "This is my first text file,\n"  );  
    	writer.write( "You can see how this is done. \n" );
        writer.write("����һ������Ҳ����\n");
     	writer.close();
    }
    catch ( IOException iox) { 
        System.out.println("Problem writing" + fileName ); }
    }
}

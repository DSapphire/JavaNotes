import java.io.*;  //ex6_4
class Ex6_4 {
    public static void main ( String[] args ) throws IOException	
    {
        String fileName = "C:/newHello.txt" ;
        BufferedWriter out = new BufferedWriter(new  FileWriter( fileName ) );
        out.write( "Hello!"  );
        out.newLine() ;
        out.write( "This is another text file using BufferedWriter,"  );
        out.newLine(); ;
        out.write( "So I can use a common way to start a newline" );
        out.close();
    }
}

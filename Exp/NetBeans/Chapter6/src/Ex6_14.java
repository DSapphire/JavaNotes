import java.io.*;
import java.util.zip.*;
public class Ex6_14 {
public static void main(String[] args) throws IOException {
     FileInputStream in = new FileInputStream("c:/Hello.txt");
     GZIPOutputStream out = new GZIPOutputStream(
                                   new FileOutputStream("c:/test.gz"));
     System.out.println("Writing compressing file from c:/Hello.txt to c:/test.gz");
     int c;
     while((c = in.read()) != -1) out.write(c); //Ð´Ñ¹ËõÎÄ¼þ
    in.close();
         out.close();
         System.out.println("Reading file form c:/test.gz to monitor");
         BufferedReader in2 = new BufferedReader(
                                             new InputStreamReader(
                                               new GZIPInputStream(
                                                 new FileInputStream("c:/test.gz"))));
         String s;
         while((s = in2.readLine()) != null) System.out.println(s);
         in2.close();
         System.out.println("Writing decompression to c:/newHello.txt");
         GZIPInputStream in3=new GZIPInputStream(
                                               new FileInputStream("c:/test.gz"));
         FileOutputStream out2=new FileOutputStream("c:/newHello.txt");
         while((c=in3.read())!=-1) out2.write(c);
         in3.close();
         out2.close();
       }
    }

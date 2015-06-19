import java.io.*;
public class Ex6_9 {
   public static void main(String[] args) throws Exception {
      DataOutputStream out=new DataOutputStream(
                            new FileOutputStream("c:/trytry.dat"));
	  out.writeByte(-1);  out.close();
	  DataInputStream in=new DataInputStream(
                            new FileInputStream("c:/trytry.dat"));
	  int a=in.readByte();
	  System.out.println(Integer.toHexString (a));
	  System.out.println(a);
	  in.skip (-1);  //往后一个位置，以便下面重新读出
	  a=in.readUnsignedByte();
	  System.out.println(Integer.toHexString (a));
	  System.out.println(a);  in.close();		
   }
}  

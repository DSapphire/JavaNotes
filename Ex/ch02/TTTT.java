import java.io.*;
public class TTTT{
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s="中文字符";
		byte[] bs;
		bs=s.getBytes("UTF-8");
		for(int i=0;i<bs.length;i++) {
			String s1=Integer.toHexString(bs[i]);
			System.out.print(s1.substring(s1.length()-2)+" ");
		}
		System.out.println("\n");
		bs=s.getBytes("GBK");
		for(int i=0;i<bs.length;i++) {
			String s1=Integer.toHexString(bs[i]);
			System.out.print(s1.substring(s1.length()-2)+" ");
		}
	}
}


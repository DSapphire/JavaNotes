package com.imooc.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream out=new FileOutputStream("demo/out.dat");
		out.write('A');
		out.write('B');
		int a=10;
		out.write(a>>>24);
		out.write(a>>>16);
		out.write(a>>>8);
		out.write(a);
		byte[] gbk="ÖÐ¹ú".getBytes("gbk");
		out.write(gbk);
		out.close();
		
		IOUtil.printHex("demo/out.dat");
	}

}

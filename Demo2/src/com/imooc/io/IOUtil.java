package com.imooc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOUtil {
	
	public static void printHex(String fileName) throws IOException{
		FileInputStream in =new FileInputStream(fileName);
		int b;
		int i=1;
		while((b=in.read())!=-1){
			if(b<=0xf){
				System.out.print("0");
			}
			System.out.print(Integer.toHexString(b)+"  ");
			if(i++%8==0){
				System.out.println();
			}
		}
		in.close();
	}
	
	public static void printHexByByteArray(String fileName) throws IOException{
		FileInputStream in =new FileInputStream(fileName);
		byte[] buf=new byte[20];
//		int bytes=in.read(buf,0,buf.length);
//		int j=1;
//		for(int i=0;i<bytes;i++){
//			if(buf[i]<0xf){
//				System.out.print("0");
//			}
//			System.out.print(Integer.toHexString(buf[i])+"  ");
//			if(j++%8==0){
//				System.out.println();
//			}
//		}
		int bytes=0;
		int j=1;
		while((bytes=in.read(buf,0,buf.length))!=-1){
			for(int i=0;i<bytes;i++){
				if(buf[i]<0xf){
					System.out.print("0");
				}
				System.out.print(Integer.toHexString(buf[i])+"  ");
				if(j++%8==0){
					System.out.println();
				}
			}
		}
		in.close();
	}
	
	public static void cpyFile(File srcFile,File desFile) throws IOException{
		if(!srcFile.exists()||!srcFile.isFile())
			throw new IllegalArgumentException("AAAA");
		FileInputStream in=new FileInputStream(srcFile);
		FileOutputStream out=new FileOutputStream(desFile);
		byte[] buf=new byte[8*32];
		int b;
		while((b=in.read(buf,0,buf.length))!=-1){
			out.write(buf,0,b);
			out.flush();//
		}
		
		in.close();
		out.close();
	}
}

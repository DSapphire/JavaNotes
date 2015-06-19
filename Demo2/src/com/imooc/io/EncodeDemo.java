package com.imooc.io;

import java.io.UnsupportedEncodingException;

public class EncodeDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String s="慕课ABC";
		byte[] byte1=s.getBytes();//使用系统默认
		for(byte b:byte1){
			System.out.print(Integer.toHexString(b&0xff)+"  ");
		}
		
		System.out.println();
		byte[] byte2=s.getBytes("gbk");//使用gbk,中文2bytes英文1byte
		for(byte b:byte2){
			System.out.print(Integer.toHexString(b&0xff)+"  ");
		}
		
		System.out.println();
		byte[] byte3=s.getBytes("utf-8");//使用utf-8，中文3英文1
		for(byte b:byte3){
			System.out.print(Integer.toHexString(b&0xff)+"  ");
		}
		
		System.out.println();
		byte[] byte4=s.getBytes("utf-16be");//使用utf-16be，中文2英文2
		for(byte b:byte4){
			System.out.print(Integer.toHexString(b&0xff)+"  ");
		}
		System.out.println();
		String str1=new String(byte3);
		System.out.println(str1);
		String str2=new String(byte3,"utf-8");
		System.out.println(str2);
	}

}

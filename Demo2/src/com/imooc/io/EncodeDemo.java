package com.imooc.io;

import java.io.UnsupportedEncodingException;

public class EncodeDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String s="Ľ��ABC";
		byte[] byte1=s.getBytes();//ʹ��ϵͳĬ��
		for(byte b:byte1){
			System.out.print(Integer.toHexString(b&0xff)+"  ");
		}
		
		System.out.println();
		byte[] byte2=s.getBytes("gbk");//ʹ��gbk,����2bytesӢ��1byte
		for(byte b:byte2){
			System.out.print(Integer.toHexString(b&0xff)+"  ");
		}
		
		System.out.println();
		byte[] byte3=s.getBytes("utf-8");//ʹ��utf-8������3Ӣ��1
		for(byte b:byte3){
			System.out.print(Integer.toHexString(b&0xff)+"  ");
		}
		
		System.out.println();
		byte[] byte4=s.getBytes("utf-16be");//ʹ��utf-16be������2Ӣ��2
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;

import java.util.HashMap;
import java.util.Random;
/**
 *
 * @author Duan
 */
public class StringEncryptor1 {
	public String key1="abcdefghijklmnopqrstuvwxyz ";
	public String key2="veknohzf iljxdmygbrcswqupta";
	public HashMap<Character,Character> keyMap1;
	public HashMap<Character,Character> keyMap2;
	public StringEncryptor1(){
		this.keyMap1=new HashMap<Character,Character>(27);
		this.keyMap2=new HashMap<Character,Character>(27);
	}
	public String encode1(String orig){
		StringBuffer sb=new StringBuffer();//orig.length()
                orig=orig.toLowerCase();
		for(int i=0;i<orig.length();i++){
			for(int j=0;j<key1.length();j++){
				if(orig.charAt(i)==key1.charAt(j)){
					sb.append(key2.charAt(j));
					break;
				}
			}
		}
		String encode=sb.toString();
		return encode;
	}
	public String decode1(String encode){
		StringBuffer sb=new StringBuffer();//encode.length()
		for(int i=0;i<encode.length();i++){
			for(int j=0;j<key1.length();j++){
				if(encode.charAt(i)==key2.charAt(j)){
					sb.append(key1.charAt(j));
					break;
				}
			}
		}
		String orig=sb.toString();
		return orig;
	}
	public void setEncodeSeed(long seed){
		StringBuffer sb1=new StringBuffer(key1);
		StringBuffer sb2=new StringBuffer(key2);
		Random ran=new Random(seed);
		int i,j,k;
		for(i=0;i<27;i++){
			j=ran.nextInt(sb1.length()-i);
			k=ran.nextInt(sb2.length()-i);
			Character ch1=sb1.charAt(j);
			Character ch2=sb2.charAt(k);
			keyMap1.put(ch1,ch2);
			keyMap2.put(ch2,ch1);
			sb1.setCharAt(j,sb1.charAt(sb1.length()-i-1));
			sb2.setCharAt(k,sb2.charAt(sb2.length()-i-1));
		}

	}
	public String encode2(String orig){
		StringBuffer sb=new StringBuffer();//orig.length()
		for(int i=0;i<orig.length();i++){
			Character ch1=orig.charAt(i);
			Character ch2=keyMap1.get(ch1);
			sb.append(ch2.charValue());
		}
		String encode=sb.toString();
		return encode;
	}
	public String decode2(String encode){
		StringBuffer sb=new StringBuffer();//encode.length()
		for(int i=0;i<encode.length();i++){
			Character ch2=encode.charAt(i);
			Character ch1=keyMap2.get(ch2);
			sb.append(ch1.charValue());
		}
		String orig=sb.toString();
		return orig;

	}
	public static void main(String[] args) {
		StringEncryptor1 se=new StringEncryptor1();
		String orig="we will break out of prison at dawn";
		System.out.println("orig="+orig);

		String encod1=se.encode1(orig);
		System.out.println("encod1="+encod1);
		String decod1=se.decode1(encod1);
		System.out.println("decod1="+decod1);

		se.setEncodeSeed(12);//System.currentTimeMillis()
		String encod2=se.encode2(orig);
		System.out.println("encod2="+encod2);
		String decod2=se.decode2(encod2);
		System.out.println("decod2="+decod2);
	}
    
}

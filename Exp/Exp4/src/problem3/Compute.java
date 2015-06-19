/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem3;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Duan
 */
public class Compute {
        public static boolean testInput1(String s){
            boolean test=false;
            String regex="/\\d\\.*\\d*;{1}\\d\\.*\\d*;{1}\\d\\.*\\d*;{1}\\d\\.*\\d*/";
            if(s.matches(regex))
                test=true;
            return test;
        }
	public static boolean testInput(String s){
		int i=0;
		StringTokenizer st=new StringTokenizer(s,";",false);
		while(st.hasMoreTokens()){
			i++;
			st.nextToken();
			//System.out.println(" "+i);
		}
		return i==4;
	}

	public static int computeResult(double[] computeArray){
		return (int)(Math.sin(computeArray[0])*Math.cos(computeArray[1])*Math.sqrt(Math.pow(computeArray[2],computeArray[3])));
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=input.next();
		String[] st=s.split(";");//
		double[] computeArray=new double[4];

		if(testInput(s)){
			for(int i=0;i<st.length;i++){
				computeArray[i]=Double.valueOf(st[i]);
				//System.out.println(st[i]+":"+computeArray[i]);
			}

			try{
				SimpleDateFormat myFmt=new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
				Date now=new Date();
				System.out.println(myFmt.format(now));
			}catch(IllegalArgumentException | NullPointerException e){
				System.out.println("AAA");
			}
			
			System.out.println("result="+computeResult(computeArray));

		}else{
			System.out.println("Invalid Input!");
		}
			
	}

}

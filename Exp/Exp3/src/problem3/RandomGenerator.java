/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem3;

import java.util.Random;
/**
 *
 * @author Duan
 */
public class RandomGenerator {
	public static String judeGL(int temp,int pre){
		if(pre==0){
			return "---";
		}else if(temp>pre){
			return "Greater";
		}else{
			return "Less";
		}
	}
	public static String judeGL(int temp,double ave){
		if(temp>ave){
			return "Greater";
		}else{
			return "Less";
		}
	}
	public static void main(String[] args) {
		double sum=0,ave;
		int pre=0,temp;
		Random ran=new Random(100);
		System.out.printf("[Value]\t[G/L than Pre]\t[Avg]\t[G/L than Avg]\n");
		System.out.println("-----------------------------------------------------------");
		for(int i=0;i<100;i++){
			temp=ran.nextInt()%50+50;
			sum+=temp;
			ave=sum/(i+1);
			System.out.printf("%d\t%s\t\t%.2f\t%s\n",temp,judeGL(temp,pre),ave,judeGL(temp,ave));
			pre=temp;
		}

	}
}

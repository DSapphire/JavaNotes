/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1;

/**
 *
 * @author Duan
 */
public class Test {
	public static void main(String[] args) {
		int result=0;
		int j=-100;
		for(int i=0;i<100;i++){
			if(i%3==0){
				j=i;
			}else{
				j=i*2;
				while(j>0){
					j--;
					result+=j;
				}
			}
			if(i%3==1){
				result--;
				continue;
			}
			result+=i;
			if(result>0){
				break;
			}
		}
		System.out.println(result);
	}
    
}

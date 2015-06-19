/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;

/**
 *
 * @author Duan
 */
public class Calculator2 {
	public float getPrice(String type) throws Exception{
		float price=0;
		if(type.equals("cookie")){
			price=1.11f;
		}else if(type.equals("pie")){
			price=5.5f;
		}
		return price;
	}
	public int getAmount(String type) throws Exception{
		int amount=0;
		if(type.equals("cookie")){
			amount=10;
		}else if(type.equals("pie")){
			amount=20;
		}
		return amount;
	}
	public float calculator(){
		float price=0;
		int amount=0;
		try{
			price=getPrice("cookie");
			amount=getAmount("cookie");
		}catch(Exception e){
			System.out.println("e");
		}
		return price*amount;
	}
    
}

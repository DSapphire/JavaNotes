/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4;

import java.util.Scanner;
/**
 *
 * @author Duan
 */
public class ChangeCalculator {
	int twos,ones,five,two,one,fiv,tw,on;
	public void inputCash() throws WrongFormatException,InputOutOfRangeException{
		double cash,left;
		int cashNo;
		Scanner inputcash=new Scanner(System.in);
		System.out.println("\nPlease enter a cash value:");
                String cashst=inputcash.next();
		cash=Double.valueOf(cashst);
		if(cash<0||cash>5.0)
			throw new InputOutOfRangeException();
		else if(cash==0){
			System.exit(-1);
		}else{
			cashNo=(int)(cash*100+0.2);
			left=cash*100-cashNo;
                        StringInpute st=new StringInpute(cashst);
                        if(!st.testIsF())
			//if(left>0.01)
				throw new WrongFormatException();
			else if(cashNo<500){
				changecal(500-cashNo);
				changprint();
			}else{
				System.out.println("No arrangement for cash change.");
			}
		}
	}
	public void changecal(int cashNo){
		twos=cashNo/200;
		cashNo%=200;
		ones=cashNo/100;
		cashNo%=100;
		five=cashNo/50;
		cashNo%=50;
		two=cashNo/20;
		cashNo%=20;
		one=cashNo/10;
		cashNo%=10;
		fiv=cashNo/5;
		cashNo%=5;
		tw=cashNo/2;
		on=cashNo%2;
    }
	public void changprint(){
		if(twos>0)
			System.out.printf("twoyuan %d zhang\n",twos);
		if(ones>0)
			System.out.printf("yiyuan %d zhang\n",ones);
		if(five>0)
			System.out.printf("wujiao %d zhang\n",five);
		if(two>0)
			System.out.printf("liangjiao %d zhang\n",two);
		if(one>0)
			System.out.printf("yijiao %d zhang\n",one);
		if(fiv>0)
			System.out.printf("wufen %d zhang\n",fiv);
		if(tw>0)
			System.out.printf("liangfen %d zhang\n",tw);
		if(on>0)
			System.out.printf("yifen %d zhang\n",on);
	}
	public void changecalculator(){
		while(true){
			try{
				inputCash();
			}
			catch(InputOutOfRangeException e){
				System.out.println(e.toString());
				System.exit(-1);
			}
			catch(WrongFormatException e){
				System.out.println(" WrongFormatException");
			}
		}

	}
    public static void main(String[] args) {
    	ChangeCalculator cal=new ChangeCalculator();
    	cal.changecalculator();
    }
}

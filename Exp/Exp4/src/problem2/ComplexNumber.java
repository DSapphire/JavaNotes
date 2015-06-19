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
public class ComplexNumber {
	double real=0;
	double imagine=0;
	public ComplexNumber(double real,double imagine){
		this.real=real;
		this.imagine=imagine;
	}
	public ComplexNumber minus(ComplexNumber operand){
		return new ComplexNumber(this.real- operand.real,this.imagine- operand.imagine);
	}
	public String toString(){
		//return real+"+"+imagine+"i";
		//formated the string!
		String s="";
		if(imagine>0)
			s=String.format("%.2f+%.2fi",real,imagine);
		else if(imagine<0)
			s=String.format("%.2f%.2fi",real,imagine);
		else
			s=String.format("%.2f",real);
		return s;
	}

	//rewrite
	public boolean equals(Object X){
		if(this==X)
			return true;
		else if(X==null||this.getClass()!=X.getClass())//leiduixiang
			return false;
		ComplexNumber b=(ComplexNumber) X;
		return (this.real-b.real)<1e-5&&(this.imagine-b.imagine)<1e-5;//
	}
	public static void main(String[] args) {
		ComplexNumber complex1=new ComplexNumber(2.02d,3.1d);
		ComplexNumber complex2=new ComplexNumber(2d,3d);
		ComplexNumber complex3=complex2;
		ComplexNumber complex4=new ComplexNumber(2d,3d);
		ComplexNumber complex5=new ComplexNumber(0.02d,0.1d);
		ComplexNumber complex6=complex1.minus(complex2);
                
                System.out.println("1 he 2"+complex1.equals(complex2));
		System.out.println(complex2==complex3);//true before equals rewrited
		System.out.println(complex2.equals(complex3));//true before equals rewrited
		System.out.println(complex2.equals(complex4));//false before equals rewrited
		System.out.println(complex6.equals(complex5));//false before equals rewrited
		System.out.println(complex6+"\n"+complex5);
		System.out.println(complex1.equals(null));//false before equals rewrited
		System.out.println(complex1.equals(new String("abc")));//false before
		System.out.println();
	}
}

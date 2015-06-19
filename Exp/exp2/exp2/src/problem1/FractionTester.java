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
public class FractionTester {
	public static void main(String[] args) {
		Fraction a=new Fraction(4,12);
		Fraction b=new Fraction(1,3);
		System.out.println(a.getFracNum());
		System.out.println(a.getFracDen());
		System.out.println(a);
		System.out.println(b);
		Fraction c=Fraction.add(a,b);
		System.out.println(c);
		Fraction d=Fraction.sub(a,b);
		System.out.println(d);
		Fraction e=Fraction.multi(a,b);
		System.out.println(e);
		Fraction f=Fraction.divid(a,b);
		System.out.println(f);
	}
}

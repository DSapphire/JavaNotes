import java.math.*;
import java.util.Scanner;

public class QuadraticEquation{
	private double a,b,c;
	QuadraticEquation(){

	}
	QuadraticEquation(double a,double b,double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public double getA(){
		return this.a;
	}
	public double getB(){
		return this.b;
	}
	public double getC(){
		return this.c;
	}
	public double getDiscriminant(){
		return b*b-4*a*c;
	}
	public double getRoot1(){
		if(getDiscriminant()>0){
			return (-this.b - Math.sqrt(getDiscriminant()))/2/this.a;
		}else{
			return 0.0;
		}
	}
	public double getRoot2(){
		if(getDiscriminant()>0){
			return ( - this.b + Math.sqrt(getDiscriminant()))/2/this.a;
		}else{
			return 0.0;
		}
	}
	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		double a,b,c;
		System.out.println("Please Enter a,b,c for the QuadraticEquation:");
		a=console.nextDouble();
		b=console.nextDouble();
		c=console.nextDouble();
		QuadraticEquation qe=new QuadraticEquation(a,b,c);
		System.out.println("\nThe discriminant is "+qe.getDiscriminant()+" \n");
		if(qe.getDiscriminant()>0){
			System.out.printf("The roots are %.4f and %.4f ",qe.getRoot1(),qe.getRoot2());
		}else if(qe.getDiscriminant()<0){
			System.out.println("The equation has no roots.");
		}else{
			System.out.printf("The only root is %.4f ",qe.getRoot1());
		}
	}
}
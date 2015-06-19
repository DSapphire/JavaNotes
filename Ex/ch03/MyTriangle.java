import java.util.Scanner;
public class MyTriangle{
	public static boolean isValid(double side1, double side2, double side3){
		boolean isValida=true;
		if(side1+side2<=side3){
			isValida=false;
		}
		if(side3+side2<=side1){
			isValida=false;
		}
		if(side1+side3<=side2){
			isValida=false;
		}
		return isValida;
	}
	public static double area(double side1, double side2, double side3){
		double myArea=0;
		double p=(side1+side2+side3)/2;
		if(isValid(side3,side2,side1)){
			myArea=Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		}else{
			System.out.println("The three sides is not Validated");
		}
		return myArea;
	}
	public static void main(String[] args) {
		System.out.println(area(1,4,5));
		System.out.println(area(2,4,5));
		System.out.println(area(3,4,5));
	}
}
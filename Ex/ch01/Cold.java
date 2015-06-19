import java.util.Scanner;
public class Cold
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number for temperature which shouldbetween -58F and 41F:");
		double ta=input.nextDouble();
		System.out.println("Enter a number for wind speed which shouldabove 2mph:");
		double v=input.nextDouble();
		double twc=35.74+0.6215*ta-35.75*Math.pow(v,0.16)+0.4275*ta*Math.pow(v,0.16);
		System.out.printf("The Cold Degree is %f",twc);
	}
}
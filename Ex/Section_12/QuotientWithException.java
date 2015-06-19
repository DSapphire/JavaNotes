// Example for PPT page No.5

import java.util.Scanner;

public class QuotientWithException
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);

		//Prompt the user to enter two integers
		System.out.print("Enter two integers: ");

		int number1=input.nextInt();
		int number2=input.nextInt();

		try
		{
			System.out.println(number1+" / "+number2+" is "+(number1/number2));
		}

		catch(ArithmeticException ex)
		{
			System.out.println("Exception: an integer cannot be divided by zero");
		}

		System.out.println("The program continues ...");
	}
}
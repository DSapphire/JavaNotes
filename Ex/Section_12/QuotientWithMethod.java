// Example for PPT page No.5

import java.util.Scanner;

public class QuotientWithMethod
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);

		// Prompt the user to enter two integers
		System.out.print("Enter two integers: ");

		int number1=input.nextInt();
		int number2=input.nextInt();

		try
		{
			int result=quotient(number1,number2);
			System.out.println(number1+" / "+number2+" is "+result);
		}

		catch(ArithmeticException ex)
		{
			System.out.println(ex.getMessage());
		}

		System.out.println("The program continues ...");
	}


	public static int quotient(int number1, int number2)
	{
		if(number2==0)
		{
			throw new ArithmeticException("Divisor cannot be zero");
		}

		return number1/number2;
	}
}
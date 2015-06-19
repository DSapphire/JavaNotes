// Example for PPT page No.5

import java.util.*;

public class Calculator
{
	/** Main method */
	public static void main(String[] args)
	{

		try
		{
			// Firstly, check the input for errors
			if(args.length!=3)
			{
				throw new Exception();
			}
			
			int i1=Integer.parseInt(args[0]);
			int i2=Integer.parseInt(args[2]);
			char c=args[1].charAt(0);
			
			// Then, calculate the result
			int result=0;
			
			switch(c)
			{
				case '+':	result=i1+i2;
							break; 
				case '-':	result=i1-i2;
							break;
				case '*':	result=i1*i2;
							break;
				case '/':	result=i1/i2;
							break;
				case '%':	result=i1%i2;
							break;
				default:	throw new Exception();
			}
			
			System.out.println(i1+" "+c+" "+i2+" = "+result);
		}
		
		catch (Exception ex)
		{
			System.out.println("Usage: java CAlculator operand1 operator operand2");
		}
	}
}
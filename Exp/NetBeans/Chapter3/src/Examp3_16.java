import java.io.*;
public class Examp3_16 {
    private static int quotient(int numerator, int denominator) throws
       DivideByZeroException {
        if (denominator == 0)
            throw new DivideByZeroException();
        return(numerator / denominator);
    }
    public static void main(String args[]) {
        int number1=0, number2=0, result=0;
        try {
            System.out.println("Enter the first number:");
            number1 = Integer.valueOf(Keyboard.getString()).intValue();
            System.out.println("Enter the second number:");
            number2 = Integer.valueOf(Keyboard.getString()).intValue();
            result = quotient(number1,number2);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid integer entered!");
            System.exit(-1);
        }
        catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
            System.exit(-1);
        }
        System.out.println(number1 + " / " + number2 + "=" + result);
    }
}

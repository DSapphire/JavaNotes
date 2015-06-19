import java.io.*;
public class ExceptionTester3 {
    public static void main(String args[]) {
        int number1=0, number2=0, result=0;
        try {
            System.out.println("Enter the first number:");
            number1 = Integer.valueOf(Keyboard.getString()).intValue();
            System.out.println("Enter the second number:");
            number2 = Integer.valueOf(Keyboard.getString()).intValue();
            result = number1 / number2;
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid integer entered!");
            System.exit(-1);
        }
        catch (ArithmeticException e) {
            System.out.println("Second number is 0, cannot do division!");
            System.exit(-1);
        }
        System.out.print(number1 + " / " + number2 + "=" + result);
    }
}

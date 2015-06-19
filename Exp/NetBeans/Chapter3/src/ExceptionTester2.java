import java.io.*;
public class ExceptionTester2  {
    public static void main(String args[]) {
        int number1=0, number2=0;
        try {
            System.out.println("Enter the first number:");
            number1 = Integer.valueOf(Keyboard.getString()).intValue();
            System.out.println("Enter the second number:");
            number2 = Integer.valueOf(Keyboard.getString()).intValue();
        }
        catch (NumberFormatException e) {
            System.out.println("Those were not proper integers!  I quit!");
            System.exit(-1);
        }
        System.out.print(number1 + " / " + number2 + "=");
        int result = number1 / number2;
        System.out.println(result);
    }
}

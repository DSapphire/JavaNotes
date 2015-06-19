import java.io.*;
public class ex3_5
{ public static void main(String[ ] args)throws IOException
  {  int n, right_digit, newnum = 0;
      BufferedReader in = new BufferedReader(
          new InputStreamReader(System.in));
      System.out.println("Enter the number: ");
      n=(new Integer(in.readLine())).intValue();
      System.out.print("The number in reverse order is  ");
      do
      {      right_digit = n % 10;
                  System.out.print(right_digit);
                  n /= 10;
          }
          while (n != 0);
      System.out.println();
  }
}

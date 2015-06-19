import java.io.*;
public class ex3_7
{ public static void main(String[ ] args)
                                          throws IOException
 {  int n,k;
    BufferedReader in =new BufferedReader(
          new InputStreamReader(System.in));
    System.out.println("Enter a positive integer: ");
    n=(new Integer(in.readLine())).intValue();
    System.out.print("Number  "+n+"   Factors  ");
    for (k=1; k <= n; k++)
                if (n % k == 0)   System.out.print(k + "  ");
    System.out.println();
 }
}

import java.io.*;
public class ex3_1
{
 public static void main(String[ ] args) throws IOException
 { int year;
   boolean IsLeapYear;
   System.out.println("Enter the year:");
   BufferedReader in =new BufferedReader(
                      new InputStreamReader(System.in));
   year=(new Integer(in.readLine())).intValue();
   IsLeapYear=((year%4==0 && year%100 != 0)||(year%400 == 0));
   if (IsLeapYear)
   {    System.out.print(year);
         System.out.println( "is a leap year");
   }
   else
   {    System.out.print(year);
         System.out.println( "is not a leap year");
   }
 }
}

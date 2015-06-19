import java.io.*;
public class ex3_3
{
 public static void main(String[ ] args)throws IOException
 {
     int day;
     BufferedReader in =
             new BufferedReader(
                     new InputStreamReader(System.in));
     day = (new Integer(in.readLine())).intValue();
     switch (day)
        {
                case 0: System.out.println("Sunday");    break;
                case 1: System.out.println("Monday");   break;
                case 2: System.out.println("Tuesday");  break;
           case 3: System.out.println("Wednesday");  break;
                case 4: System.out.println("Thursday");  break;
                case 5: System.out.println("Friday");  break;
                case 6: System.out.println("Saturday");  break;
                default:
                   System.out.println
                          ("Day out of range Sunday .. Saturday" );
                   break;
         }
 }
}


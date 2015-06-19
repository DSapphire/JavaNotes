public class BreakTest {
 public static void main( String args[] ) {
        String output = "";
        int i;
   for ( i = 1; i <= 10; i++ ) {
      if ( i == 5 )
         break; // break loop only if count == 5
      output += i + " ";
   }
   output += "\nBroke out of loop at i = " + i;
   System.out.println(output);
 }
 }

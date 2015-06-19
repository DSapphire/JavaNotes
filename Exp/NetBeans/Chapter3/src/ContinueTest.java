public class ContinueTest{
        public static void main( String args[] ) {
        String output = "";
        int i;
   for ( i = 1; i <= 10; i++ ) {
      if ( i == 5 )
         continue; // skip remaining code in this loop
      output += i + " ";
   }
   output += "\nUsing continue to skip printing 5";
   output += "\ni = " + i;
   System.out.println(output);
 }
}

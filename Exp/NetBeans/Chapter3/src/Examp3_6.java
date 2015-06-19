public class Examp3_6{
        public static void main(String[] args){
          for (int i=1; i<=9;i++) {
       for (int j=1; j<=9;j++){
         if (j > i)
           break;
         System.out.print("  "+i+"*"+j+"="+i*j);
       }
       System.out.println();
          }
   }
}

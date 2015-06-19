public class Exam4_7{
        public static void main(String args[]){
          BankAccount a = new BankAccount("Bob", 123456, 100.00f);
     BankAccount b = new BankAccount("Bob", 123456, 100.00f);
  // BankAccount b = a;
     if (a == b)
        System.out.println("YES");
     else
        System.out.println("NO");
   }
}

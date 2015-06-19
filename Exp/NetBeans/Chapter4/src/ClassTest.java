public class ClassTest {
  public static void main(String args[]) {
     BankAccount anAccount = new BankAccount();
     Class aClass = anAccount.getClass();
     System.out.println(aClass);
     System.out.println(aClass.getName());
  }
}

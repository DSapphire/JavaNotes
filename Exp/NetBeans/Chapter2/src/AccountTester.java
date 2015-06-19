public class AccountTester {
   public static void main(String args[]) {
        BankAccount    anAccount;
        anAccount = new BankAccount("ZhangLi", 100023,0);
        anAccount.setBalance(anAccount.getBalance() + 100);
        System.out.println(anAccount);
        System.out.println();
        anAccount = new BankAccount("WangFang", 100024,0);
        System.out.println(anAccount);
        anAccount.deposit(225.67f);
        anAccount.deposit(300.00f);
        System.out.println(anAccount);
        anAccount.withdraw(400.17f);
        System.out.println(anAccount);
    }
}

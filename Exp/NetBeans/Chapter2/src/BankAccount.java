public class BankAccount{
    private String ownerName;
    private int accountNumber;
    private float balance;
    public BankAccount()
    {
        this("", 0, 0);
    }
    public BankAccount(String initName, int initAccNum, float initBal)
    {
        ownerName = initName;
        accountNumber = initAccNum;
        balance = initBal;
    }
    public String getOwnerName()
    {
        return ownerName;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public float getBalance()
    {
        return balance;
    }
    public void setOwnerName(String newName)
    {
        ownerName = newName;
    }
    public void setAccountNumber(int newNum)
    {
        accountNumber = newNum;
    }
    public void setBalance(float newBalance)
    {
        balance = newBalance;
    }
    public String toString()
    {
        return("Account #" + accountNumber + " with balance " +
         new java.text.DecimalFormat("$0.00").format(balance));

    }
    //´æ¿î
    public float deposit(float anAmount)
    {
        balance += anAmount;
        return(balance);
    }
    // È¡¿î
    public float withdraw(float anAmount)
    {
        balance -= anAmount;
        return(anAmount);
    }

}

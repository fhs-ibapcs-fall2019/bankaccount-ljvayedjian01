public class BankAccount
{
    private double balance;
    private String accountHolder;
    private int accountNumber;
    private String password;
    private boolean loggedIn;
    
    public BankAccount(double balance, String accountHolder, int accountNumber,
    String password)
    {
       this.balance = balance;
       this.accountHolder = accountHolder;
       this.accountNumber = accountNumber;
       this.password = password;
       this.loggedIn = false;
    }
    
    public void logIn(String name, String password)
    {
        if (accountHolder.equals(name) && this.password.equals(password))
        {
            loggedIn = true;
        }
    }
    
    public double getBalance()
    {
        if (loggedIn == true)
        {
            return balance;
        }
        else
        {
            throw new IllegalStateException("You are not logged in.");
        }
    }  
}
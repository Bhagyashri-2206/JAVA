class BankAccount 
{
    protected double balance;
    public BankAccount(double initialBalance) 
    {
        balance = initialBalance;
    }
    public void deposit(double amount) 
    {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount) 
    {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn:" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    public double getBalance() 
    {
        return balance;
    }
}
class SavingsAccount extends BankAccount 
{
    public SavingsAccount(double initialBalance) 
    {
        super(initialBalance);
    }
    public void withdraw(double amount) 
    {
        if (balance - amount >= 100) 
        {
            super.withdraw(amount);
        }
        else 
        {
            System.out.println("Cannot withdraw. Minimum balance of 100 required.");
        }
    }

    public static void main(String[] args) 
    {
        SavingsAccount savings = new SavingsAccount(500);
        savings.deposit(200);
        savings.withdraw(550);
        savings.withdraw(300);
    }
}

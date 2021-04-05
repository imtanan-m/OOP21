package l6homeact1_runner;


public class SavingsAccount {
    static double annualInterestRate;
    private double savingsBalance;
    
    
public SavingsAccount()
    {
        savingsBalance = 0;
        annualInterestRate = 0;
    }

    public SavingsAccount(double balance)
    {
        savingsBalance = balance;
        annualInterestRate = 0;
    }

    public void calculateMonthlyInterest()
    {
        System.out.println("Current savings balance is " + savingsBalance);
        double monthlyInterest;
        monthlyInterest = (savingsBalance * annualInterestRate)/12;
        savingsBalance = monthlyInterest;
        System.out.println("New updated savings balance is " + savingsBalance);
    }

    
    public static void modifyInterestRate(double newInterestRate)
    {
        annualInterestRate = newInterestRate;
    }
    
}
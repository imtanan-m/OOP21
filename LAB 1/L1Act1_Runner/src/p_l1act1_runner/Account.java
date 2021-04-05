package p_l1act1_runner;


public class Account {
    int balance;
    int withdraw;
    int deposit;
    
    
public void setBalance(int b)
{
    balance = b;
}

public void setWithdraw(int w)
{
    withdraw = w;
}

public void setDeposit(int d)
{
    deposit = d;
}

public void Display()
{
    System.out.println("Balance is " + balance + "\nWithdraw " + withdraw + "\nDepost " + deposit);
}


}

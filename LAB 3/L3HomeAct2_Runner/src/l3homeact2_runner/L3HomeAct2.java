package l3homeact2_runner;


public class L3HomeAct2 
    {
    int TotalBalance;
    int balanceW;
    int balanceD;
    public L3HomeAct2()
    {
        TotalBalance = 10000;
        balanceW = 3000;
        balanceD = 5000;
    }
    
    public L3HomeAct2(int a, int b)
    {
        balanceW = a;
        balanceD = b;
    }
    
     public int TotalBalance()
    {
        System.out.println("Total Balance: ");
        return(TotalBalance);
    }
    
    public int Withdraw()
    {
        System.out.println("Withdraw: ");
        return(balanceW);
    }
    
    public int Deposit()
    {
        System.out.println("Deposit: ");
        return(balanceD);
    }
}


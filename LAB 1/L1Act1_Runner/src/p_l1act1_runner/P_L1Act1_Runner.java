package p_l1act1_runner;

public class P_L1Act1_Runner {

    
    public static void main(String[] args) {
        Account A1 = new Account();
        A1.setBalance(50000);
        A1.setDeposit(3000);
        A1.setWithdraw(2000);
        A1.Display();
        
        Account A2 = new Account();
        A2.setBalance(20000);
        A2.setDeposit(5000);
        A2.setWithdraw(1000);
        A2.Display();
    }
}

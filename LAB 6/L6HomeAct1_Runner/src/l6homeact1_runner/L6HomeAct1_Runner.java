package l6homeact1_runner;

public class L6HomeAct1_Runner {


    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        saver1.modifyInterestRate(.03);
        saver1.calculateMonthlyInterest();
        saver2.modifyInterestRate(.03);
        saver2.calculateMonthlyInterest();
        saver1.modifyInterestRate(.04);
        saver1.calculateMonthlyInterest();
        saver2.modifyInterestRate(.04);
        saver2.calculateMonthlyInterest();
    }
    
}

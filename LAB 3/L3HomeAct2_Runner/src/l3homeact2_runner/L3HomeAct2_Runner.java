package l3homeact2_runner;


public class L3HomeAct2_Runner {

    
    public static void main(String[] args) {
       L3HomeAct2 Total = new L3HomeAct2();
       System.out.println(Total.TotalBalance());
       
       L3HomeAct2 balanceW = new L3HomeAct2();
       System.out.println(balanceW.Withdraw());
       
       L3HomeAct2 balanceD = new L3HomeAct2();
       System.out.println(balanceD.Deposit());
    }
    
}

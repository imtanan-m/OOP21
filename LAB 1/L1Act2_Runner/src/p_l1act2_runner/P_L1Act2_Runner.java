package p_l1act2_runner;


public class P_L1Act2_Runner {

    
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setcarModel(2000);
        c1.setcarName("Mehran");
        c1.setcarPrice(500000);
        c1.setcarOwner("Imtanan");
        c1.Display();
        
        Car c2 = new Car();
        c2.setcarModel(2005);
        c2.setcarName("Civic");
        c2.setcarPrice(500000);
        c2.setcarOwner("Mehmood");
        c2.Display();
        
        Car c3 = new Car();
        c3.setcarModel(2000);
        c3.setcarName("Grande");
        c3.setcarPrice(500000);
        c3.setcarOwner("Musa");
        c3.Display();
        
        
    }
    
}

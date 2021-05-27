package l11act1_act2_runner;


public class L11Act1_Act2_Runner {

    
    public static void main(String[] args) {
        
        Shape S = new TestApplication(2,5,8);
        System.out.printf("Perimeter of triangle = %.0f " , ((EnhancedShape)S).perimeter());
        System.out.println();
    }
}

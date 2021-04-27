package l7assign_runner;


public class L7Assign_Runner {

    
    public static void main(String[] args) {
        Pizza P1 = new Pizza("Small", 1, 2, 3);
        Pizza P2 = new Pizza("Large", 3, 2, 1);
        Pizza P3 = new Pizza("Empty", 0, 0, 0);
        

        System.out.println("Total cost of Pizzas:\nSmall Pizza: " + P1.calcCost() + "\nLarge Pizza: " + P2.calcCost() + "\nOut of order: " + P3.calcCost());
    }
    
}

package l7assign_runner;

public class Pizza {
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;
   
    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings)
    {
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }
    
    public void setSize(String size)
    {
        this.size = size;
    }
    public void setCheeseToppings(int cheeseToppings)
    {
        this.cheeseToppings = cheeseToppings;
    }
    public void setPepperoniToppings(int pepperoniToppings)
    {
        this.pepperoniToppings = pepperoniToppings;
    }
    public void setHamToppings(int hamToppings)
    {
        this.hamToppings = hamToppings;
    }
    
    public String setSize()
    {
        this.size = size;
        return null;
    }
    public int setCheeseToppings()
    {
        this.cheeseToppings = cheeseToppings;
        return 0;
    }
    public int setPepperoniToppings()
    {
        this.pepperoniToppings = pepperoniToppings;
        return 0;
    }
    public int setHamToppings()
    {
        this.hamToppings = hamToppings;
        return 0;
    }
    
    public String getSize()
    {
        return size;
    }
    public int getCheeseToppings()
    {
        return cheeseToppings;
    }
    public int getPepperoniToppings()
    {
        return pepperoniToppings;
    }
    public int getHamToppings()
    {
        return hamToppings;
    }
    
    public double calcCost()
    {
        int cost = 0;
        if ("Small".equals(getSize()))
            cost = 10 + (2*(getCheeseToppings() + getPepperoniToppings() + getHamToppings()));
        else if ("Medium".equals(getSize()))
            cost = 12 + (2*(getCheeseToppings() + getPepperoniToppings() + getHamToppings()));
        else if ("Large".equals(getSize()))
            cost = 14 + (2*(getCheeseToppings() + getPepperoniToppings() + getHamToppings()));
        return cost;
    }
    
    public String getDescription()
    {
        return "Pizza size: "+ getSize() + "\nQuantity of topings: " + "\nCheese Toppings: " + getCheeseToppings() + "\nPepperoni Toppings: " + getPepperoniToppings() + "\nHam Toppings: " + getHamToppings();
    }
    
}
package l3homeact3_runner;

public class L3HomeAct3 {
    public double Distance;
    public double feet;
    public double inches;
    
    public L3HomeAct3()
    {
        Distance = 4;
        feet = 13123;
        inches = 157480;
        
    }
    
    public L3HomeAct3(int a, int b)
    {
        feet = a;
        inches = b;
    }
    
    public double display()
    {
        System.out.println("Distance in km: ");
        return(Distance);
    }
    
    public double f()
    {
        System.out.println("Distance in feet: ");
        return(feet);
    }
    
    public double i()
    {
        System.out.println("Distance in inches ");
        return(inches);
    }
    
}
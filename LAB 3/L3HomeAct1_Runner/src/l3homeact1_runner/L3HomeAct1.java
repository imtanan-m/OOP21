package l3homeact1_runner;


public class L3HomeAct1 
    {
    int radius;
    double pi;
    
    public L3HomeAct1()
    {
        radius = 2;
        pi = 3.14;
    }
    
    public L3HomeAct1(int a, int b)
    {
        radius = a;
        pi = b;
    }
    
    public double Circumference()
    {
        return(2 * radius * pi);
    }
}

package l11assign_runner;

public class Triangle implements Shape
{
    double base;
    double height;
    
    public Triangle(double b, double h) 
    {
        this.base = b;
        this.height = h;
    }
    
    
    @Override
    public double area()
    {
        return (base * height)/2;
    }
}
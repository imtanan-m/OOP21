package l11assign_runner;

public class Rectangle implements Shape
{
    double length;
    double width;

    public Rectangle(double l, double w) 
    {
        this.length = l;
        this.width = w;
    }
    
    @Override
    public double area()
    {
        return length * width;
    }
}
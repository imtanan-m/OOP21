package l11assign_runner;

public class Circle implements Shape
{
    double radius;

    public Circle(double r) 
    {
        this.radius = r;
    }
    
    @Override
    public double area()
    {
        return Math.PI * radius * radius;
    }
}
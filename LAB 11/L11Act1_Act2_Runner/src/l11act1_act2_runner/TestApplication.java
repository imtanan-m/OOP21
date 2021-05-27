package l11act1_act2_runner;

public class TestApplication implements EnhancedShape
{
    int a;
    int b;
    int c;
    
    public TestApplication(int a, int b, int c) 
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public double perimeter()
    {
        return a+b+c;    //perimeter of triangle
    }
}
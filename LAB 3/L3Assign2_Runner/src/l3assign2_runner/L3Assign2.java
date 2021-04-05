package l3assign2_runner;


public class L3Assign2 {
    public int hr;
    public int min;
    public int seconds;
    
    public L3Assign2()
    {
        hr = 10;
        min = 30;
        seconds = 55; 
    }        
    
    public L3Assign2(int a, int b, int c)
    {
        hr = a;
        min = b;
        seconds = c;
    }        
    
    public int display1()
    {
        return(hr);
    }  
    public int display2()
    {
        return(min);
    }    
    public int display3()
    {
        return(seconds);
    }    
}

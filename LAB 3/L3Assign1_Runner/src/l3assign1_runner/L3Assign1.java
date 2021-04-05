
package l3assign1_runner;


public class L3Assign1 {
    public int marks1;
    public int marks2;
    public int marks3;
    
    public L3Assign1()
    {
        marks1 = 30;
        marks2 = 11;
        marks3 = 22; 
    }        
    
    public L3Assign1(int a, int b, int c)
    {
        marks1 = a;
        marks2 = b;
        marks3 = c;
    }        
    
    public int Calculation()
    {
        System.out.println("Sum of three marks are: ");
        return(marks1 + marks2 + marks3);
    }        
}

package l6homeact2_runner;


public class Object {
    private static int objCreated;
    private static int objDestroyed;
    private int num;
   
    public Object()
    {
       objCreated++;
    }
    
    public Object(int n)
    {
       num = n; 
       objCreated++;
    }
    
    public static void destroyedObj()
    {
        objDestroyed++;
    }
    
    
    public static void print()
    {
        System.out.println("The object created is "+ objCreated);
        System.out.println("The object destroyed is "+ objDestroyed);
    }
    
}
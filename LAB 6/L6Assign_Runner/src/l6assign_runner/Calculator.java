package l6assign_runner;

import java.util.Scanner;

public class Calculator {
    
    static Scanner input = new Scanner(System.in);
    
    public static void displayMenu(String[] s)
    {
        for(int i = 0; i < s.length; i++)
        {
            System.out.println((i+1) + " : " + s[i]);
        }
    }
    
    public static int getMethod()
    {
        System.out.print("Select method or enter 0 to exit: ");
        int method = input.nextInt();
        return method;
    }
    
    public static void sum()
    {
        int sum = 0;
        System.out.println("Enter numbers to add and 0 for answer: "); 
        int num = input.nextInt();
        while (num != 0)
        {
            sum += num;
            System.out.print("+"); 
            num = input.nextInt();         
        }
        System.out.println("Sum = "+ sum); 
    }
    
    public static void multiply()
    {
        int mul = 1;
        System.out.println("Enter numbers to Multiply or 0 for answer: "); 
        int num = input.nextInt();
        while (num != 0)
        {
            mul *= num;
            System.out.print("*"); 
            num = input.nextInt();       
        }
        System.out.println("Answer = "+ mul);
    }
    
    public static void divide()
    { 
        System.out.print("Enter numerator: "); 
        double numerator = input.nextDouble();
        System.out.print("Enter denominator: "); 
        double denominator = input.nextDouble();
        System.out.printf((int)numerator +" / "+ (int)denominator +" = %.2f ", (numerator/denominator));
        System.out.println();
        System.out.println();
    }
    
    public static void modulus()
    { 
        System.out.print("Enter two numbers to find Modulus: "); 
        double mod1 = input.nextDouble();
        double mod2 = input.nextDouble();
        System.out.println((int) mod1 + " % " + (int) mod2 + " = " + (mod1 % mod2));
    }
    
    public static void sin()
    {  
        System.out.print("Enter a numbers in Degrees to find Sin: "); 
        int num = input.nextInt();
        System.out.printf("Sin("+ num +") = %.2f", Math.sin(Math.toRadians(num)));
        System.out.println();
        System.out.println();
    }
    
    public static void cos()
    {  
        System.out.print("Enter a numbers in Degrees to find Cos: "); 
        int num = input.nextInt();
        System.out.printf("Cos("+ num +") = %.2f", Math.cos(Math.toRadians(num)));
        System.out.println();
        System.out.println();
    }
    
    public static void tan()
    {  
        System.out.print("Enter a numbers in Degrees to find tan: "); 
        int num = input.nextInt();
        System.out.printf("tan("+ num +") = %.2f", Math.tan(Math.toRadians(num)));
        System.out.println();
        System.out.println();
    }

}
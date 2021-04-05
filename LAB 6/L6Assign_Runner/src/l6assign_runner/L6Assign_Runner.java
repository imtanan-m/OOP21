package l6assign_runner;

public class L6Assign_Runner {

    
    public static void main(String[] args) {
        String[] s = {"sum", "multiply", "divide", "modulus", "sin", "cos", "tan"};
        Calculator.displayMenu(s);
        int method = -1;
        while (method != 0)
        {
            method = Calculator.getMethod();
            if(method > 0 && method <= s.length)
                switch (method)
                {
                    case 1:
                        Calculator.sum();
                        break;
                    case 2:
                        Calculator.multiply();
                        break;
                    case 3:
                        Calculator.divide();
                        break;
                    case 4:
                        Calculator.modulus();
                        break;
                    case 5:
                        Calculator.sin();
                        break;
                    case 6:
                        Calculator.cos();
                        break;
                    case 7: 
                        Calculator.tan();
                        break;
                }
            
            else if(method < 0 && method > s.length)
                System.out.println("Error! Enter correct input: "); 
        }
    }    
}
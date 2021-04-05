package l1assign_runner;
import java.util.Scanner;

public class Employee {
    Scanner input = new Scanner(System.in);
    int employeeCode;
    String employeeName;
    int dateOfJoining;
    
public void setEmployeeCode(int c)
{
    employeeCode = c;
}

public void setEmployeeName(String n)
{
    employeeName = n;
}


public void getDateOfJoining()
{
    System.out.println("Enter the date of joining: ");
    double x = input.nextDouble();
    if(x <= 2018)
    {
        System.out.println("Employer tenure is more than 3 years.");
    }
    else
    {
        System.out.println("Employer tenure is not more than 3 years.");
    }
}

public void Display()
    {
        System.out.println("Employee Code: " + employeeCode + "\nEmployee Name: " + employeeName);
    }

}
package l8homeact_runner;


public class Employee extends Person {
    protected String office;
    protected double salary;
    protected Date DateOfHire;
    
    public Employee(String name, String address, int phone, String email, String office, int salary, Date obj)
    {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.DateOfHire = obj;
    }
    
    //displaying
    @Override
    public void display()
    {
        super.display();
        System.out.println("Office: " + office + "\nSalary: " + salary + "\nHired date: " + DateOfHire);
    }
}

class Date 
{
    int day;
    int month;
    int year;
    
    public Date(int d, int m, int y) 
    {
        day = d;
        month = m;
        year = y;
    }
   
    
    public String toString()
    {
        String s = day+"/"+month+"/"+year;
        return s;
    }   
}
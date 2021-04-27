package l8homeact_runner;


public class Staff extends Employee {
    private String title;
    
    public Staff(String name, String address, int phone, String email, String office, int salary, Date obj, String title)
    {
        super(name, address, phone, email, office, salary, obj);
        this.title = title;
    }
    
    //displaying
    @Override
    public void display()
    {
        System.out.println("\nStaff Member Data: ");
        super.display();
        System.out.println("Title: " + title);
    }
}
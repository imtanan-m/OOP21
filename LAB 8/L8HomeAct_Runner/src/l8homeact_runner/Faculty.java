package l8homeact_runner;


public class Faculty extends Employee {
    private int officeHours;
    private String rank;
    
    public Faculty(String name, String address, int phone, String email, String office, int salary, Date obj, int officeHours, String rank)
    {
        super(name, address, phone, email, office, salary, obj);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    
    //displaying
    @Override
    public void display()
    {
        System.out.println("\nFaculty Member Data: ");
        super.display();
        System.out.println("Office hours: " + officeHours + "\nRank: " + rank );
    }
}

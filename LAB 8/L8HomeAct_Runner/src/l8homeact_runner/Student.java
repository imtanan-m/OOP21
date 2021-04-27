package l8homeact_runner;

public class Student extends Person {
    private String status;
    
    public Student(String name, String address, int phone, String email, String status)
    {
        super(name, address, phone, email);
        this.status = status;
    }
    
    //displaying
    @Override
    public void display()
    {
        System.out.println("Student data: ");
        super.display();
        System.out.println("Status: " + status);
    }
}

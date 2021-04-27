package l8assign2_runner;

public class Laptop extends Computer {
    
    private int length;
    private int width;
    private int height;
    private int weight;
    
    
    public Laptop(int wordsize, int memorysize, int storagesize, double speed, int length, int width, int height, int weight)
    {
        super(wordsize, memorysize, storagesize, speed);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
    
    public Laptop()
    {
        super();
        this.length = 10;
        this.width = 5;
        this.height = 15;
        this.weight = 30;
    }
    
    //displaying
    public void display()
    {
        System.out.println("Laptop Data:");
        super.display();
        System.out.println("Length: " + length + " inches" + "\nWidth: " + width + " cm" + "\nHeight: " + height + " cm" + "\nweight: " + weight +  " kg" + "\n");
    }
}

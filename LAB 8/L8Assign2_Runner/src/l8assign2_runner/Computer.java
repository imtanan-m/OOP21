package l8assign2_runner;

public class Computer {
    protected int wordsize; //in bits
    protected int memorysize; //in megabytes
    protected int storagesize; //in megabytes
    protected double speed; //in megahertz
    
    
    public Computer(int wordsize, int memorysize, int storagesize, double speed)
    {
        this.wordsize = wordsize;
        this.memorysize = memorysize;
        this.storagesize = storagesize;
        this.speed = speed;
    }
    
    public Computer()
    {
        this.wordsize = 32;
        this.memorysize = 1024;
        this.storagesize = 800;
        this.speed = 15.3;
    }
    
    //displaying
    public void display()
    {
        System.out.println("Wordsize: " + wordsize + " bits" + "\nMemorysize: " + memorysize + " megabytes" + "\nStoragesize: " + storagesize + " megabytes" + "\nSpeed: " + speed +  " megahertz");
    }
}

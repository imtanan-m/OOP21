package l8assign1_runner;


public class Tape extends Publication {
    private int playingTime; //in minutes
    
    public Tape(String title, int price, int playingTime)
    {
        super(title, price);
        this.playingTime = playingTime;
    }
    
    //setter
    public void setPlayingTime(int playingTime) 
    {
        this.playingTime = playingTime;
    }
    
    //getter
    public int getPlayingTime() 
    {
        return playingTime;
    }
    
    //displaying
    public void display()
    {
        super.display();
        System.out.println("Playing time: " + playingTime + " minutes");
    }
}

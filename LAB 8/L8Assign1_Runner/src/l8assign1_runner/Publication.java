package l8assign1_runner;


public class Publication {
    private String title;
    private int price;  //price of publication
    
    public Publication(String title, int price)
    {
        this.title = title;
        this.price = price;
    }
    
    //setters
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public void setPrice(int price) 
    {
        this.price = price;
    }
    
    //getters
    public String getTitle() 
    {
        return title;
    }

    public int getPrice() 
    {
        return price;
    }
    
    //displaying
    public void display()
    {
        System.out.println("\nTitle: " + getTitle() + "\nPrice: " + getPrice());
    }
}

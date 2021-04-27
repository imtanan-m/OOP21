package l8assign1_runner;


public class Book extends Publication {
    private int pageCount;
    
    public Book(String title, int price, int pageCount)
    {
        super(title, price);
        this.pageCount = pageCount;
    }
    
    //setter
    public void setPageCount(int pageCount) 
    {
        this.pageCount = pageCount;
    }
    
    //getter
    public int getPageCount() 
    {
        return pageCount;
    }
    
    //displaying
    public void display()
    {
        super.display();
        System.out.println("Number of pages: " + pageCount);
    }
}

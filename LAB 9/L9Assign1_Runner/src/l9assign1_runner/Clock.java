package l9assign1_runner;


public class Clock {
    private int hr; //hours
    private int min; //minutes
    private int sec; //seconds
    
    public Clock(int hour, int minute, int second)
    {
        this.hr = hour % 24; //24 hours in one day
        this.min = minute % 60; //60 minutes in one hour
        this.sec = second % 60; //60 seconds in one minute
    }
    
    
    //getters
    
    public int getHour() 
    {
        return hr;
    }

    public int getMinute() 
    {
        return min;
    }

    public int getSecond() 
    {
        return sec;
    }
    
    //displaying
    public void display()
    {
        System.out.println(hr + ":" + min + ":" + sec + " hrs");
    }
}

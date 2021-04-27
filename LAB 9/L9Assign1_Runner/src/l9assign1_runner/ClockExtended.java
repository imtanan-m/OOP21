package l9assign1_runner;

public class ClockExtended extends Clock{
    
    public ClockExtended(int hr, int min, int sec)
    {
        super(hr, min, sec);
    }
    
    @Override
    public void display()
    {
        System.out.println("    CLOCK\nAM/PM FORMAT");
        if(getHour() < 12 || getHour() == 24)
        {
            int h = getHour() % 12;
            if (h == 0)
                h = 12;
            System.out.println(h + ":" + getMinute() + ":" + getSecond() + " AM");
        }
        else
        {
            int h = getHour() % 12;
            if (h == 0)
                h = 12;
            System.out.println(getHour() % 12 + ":" + getMinute() + ":" + getSecond() + " PM");
        }
        
        System.out.println("24 HOUR FORMAT");
        super.display();
    }
}
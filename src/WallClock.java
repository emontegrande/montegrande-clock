public class WallClock extends Clock
{
    public WallClock(int hr, int min, int sec)
    {
        super(hr,min,sec);
    }

    WallClock() {
        System.out.println("\nWallclock");
    }

    @Override
    public String room()
    {
        return "Kitchen";
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
}
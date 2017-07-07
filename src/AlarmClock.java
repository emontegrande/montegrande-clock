
public class AlarmClock extends Clock
{
    private int hrs,mins,secs;

    public AlarmClock(int hr, int min, int sec, int h,int m, int s)
    {
        super(hr, min, sec);
        this.hrs=h;
        this.mins=m;
        this.secs=s;
    }

    AlarmClock() {
        System.out.println("\nAlarmClock");
    }

    @Override
    public int getHours(){
        return super.getHours();
    }
    
    public void setalarm(int h,int m, int s){
        this.hrs=h;
        this.mins=m;
        this.secs=s;
    }
    
    @Override
    public String room()
    {
        return "Bedroom";
    }
    
    @Override
    public String toString(){
        String res= super.toString();
        res+="\n"+"Alarm Time: "+"\n"+hrs+"hr:"+mins+"min:"+secs+"sec"+"\n";
        System.out.println(res);
        return res;
    }
}
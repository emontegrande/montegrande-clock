public class Demo {
        
    public static void main(String[] args) {
        Clock clocking = new Clock(4,6,8);
        System.out.println("CLOCK");
        clocking.printTime();
        System.out.println("\nIncrement Hours");
        clocking.incrementHours();
        clocking.printTime();
        System.out.println("\nDecrement Hours");
        clocking.decrementHours();
        clocking.printTime();
        clocking.toString();
                        
        AlarmClock aclock= new AlarmClock();
        aclock.setalarm(4, 4, 4);
        aclock.toString();
        aclock.room();
    }
}
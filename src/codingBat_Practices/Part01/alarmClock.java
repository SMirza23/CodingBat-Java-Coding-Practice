package codingBat_Practices.Part01;

public class alarmClock {
    public static String alarmClock(int day, boolean vacation) {

        boolean isWeekend = day == 0 || day == 6;

        if(vacation && isWeekend){
            return "off";
        } else if(vacation && !isWeekend || !vacation && isWeekend){
            return "10:00";
        } else {
            return "7:00";
        }

    }

    public static void main(String[] args) {
        System.out.println(alarmClock(3, true)); //10:00
    }
}
/*
Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".


alarmClock(1, false) → "7:00"
alarmClock(5, false) → "7:00"
alarmClock(0, false) → "10:00"
 */
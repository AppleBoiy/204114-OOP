/**
 * @author: Chaipat Jainan 650510606
 */

import java.util.Scanner;

public class Lab06_5 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        char time1 = sc.next().charAt(0);
        Time T1 = getTime(time1);
        
        char time2 = sc.next().charAt(0);
        Time T2 = getTime(time2);
        
        char operator = sc.next().charAt(0);
        char format = sc.next().charAt(0);
        
        Time.subtractAndSumTime(T1, T2, operator, format);
        
        sc.close();
    }
    
    static Time getTime(char format) {
        if (format == 't' || format == 'T') {
            int day = sc.nextInt();
            int hour = sc.nextInt();
            int minute = sc.nextInt();
            int second = sc.nextInt();

            return new Time(day, hour, minute, second);

        } else {
            int seconds = sc.nextInt();
            return new Time(seconds);
        }
    }
}

class Time {
    private static final long day2second = 86400L;
    private static final long hour2second = 3600L;
    private static final long minute2second = 60L;
    protected long seconds;
    
    public Time(int seconds) {
        this.seconds = seconds;
    }
    
    public Time(int day, int hour, int minute, int second){
        this.seconds = (
                (day * day2second) + (hour * hour2second) + (minute * minute2second) + second)
        ;
    }
    
    static void subtractAndSumTime(Time time1, Time time2, char operator, char format) {
        
        long timeResult;
        
        if (operator == '+') {
            timeResult = time1.seconds + time2.seconds;
        } else {
            timeResult = time1.seconds - time2.seconds;
            if (timeResult < 0)
                timeResult = 0;
        }
        
        if (format == 'T' || format == 't') {
            dateTimeFormat(timeResult);
        } else {
            System.out.println(timeResult);
        }
    }

    private static void dateTimeFormat(long time) {

        int day = (int) (time / day2second);
        time %= day2second;

        int hour = (int) (time / hour2second);
        time %= hour2second;

        int minute = (int) (time / minute2second);
        int second = (int) (time % minute2second);

        System.out.printf("%d:%02d:%02d:%02d", day, hour, minute, second);

    }
}
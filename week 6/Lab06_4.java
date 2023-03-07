/**
 * @author: Chaipat Jainan
 */

import java.util.Scanner;

public class Lab06_4 {
    private static final Scanner sc = new Scanner(System.in);
    private static final long day2second = 86400L;
    private static final long hour2second = 3600L;
    private static final long minute2second = 60L;
    
    public static void main(String[] args) {
    
        String time1 = sc.next();
        String time2 = sc.next();

        twoTimeDifferent(time1, time2);
        
        sc.close();
    }
    
    private static void twoTimeDifferent(String time1, String time2) {
        long timeDifferent = Math.abs(date2Second(time1) - date2Second(time2));
        
        int day = (int) (timeDifferent / day2second);
        timeDifferent %= day2second;
        
        int hour = (int) (timeDifferent / hour2second);
        timeDifferent %= hour2second;
        
        int minute = (int) (timeDifferent / minute2second);
        int second = (int) (timeDifferent % minute2second);
        
        System.out.printf("%d:%02d:%02d:%02d", day, hour, minute, second);

    }
    
    
    private static long date2Second(String time) {
        
        String[] time2String = time.split(":");
        
        int day = Integer.parseInt(time2String[0]);
        int hour = Integer.parseInt(time2String[1]);
        int minute = Integer.parseInt(time2String[2]);
        int second = Integer.parseInt(time2String[3]);
        
        return (day2second * day) + (hour2second * hour) + (minute2second * minute) + second;
    }
}

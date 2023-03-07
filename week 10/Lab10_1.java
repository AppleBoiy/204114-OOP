/**
 * @author chaipat jainan 650510606
 */
import java.util.Scanner;

public class Lab10_1 {
    public static <TYPE extends Comparable> void getMin(TYPE d1, TYPE d2, TYPE d3) { 
        TYPE min = d1;
        if (d2.compareTo(d1) < 0) {
            min = d2; 
        }
        if (d3.compareTo(min) <= 0) {
            System.out.println(d3);
        } else {
            System.out.println(min);
        }
    }
    public static <TYPE extends Comparable> void getMax(TYPE d1,TYPE d2,TYPE d3) {
        TYPE max = d1;
        if (d2.compareTo(d1) > 0) {
            max = d2; 
        }
        if (d3.compareTo(max) >= 0) {
            System.out.println(d3);
        } else {
            System.out.println(max);
        }
    }

    public static <TYPE extends Comparable> void getCenter(TYPE d1, TYPE d2, TYPE d3) {
        TYPE max, min, mid = d3;
        if (d1.compareTo(d2) > 0) {
            max = d1;
            min = d2;
        } else {
            max = d2;
            min = d1;
        }
        if (max.compareTo(d3) < 0) {
            mid = max;
        } else if (min.compareTo(d3) >= 0) {
            mid = min;
        }
        System.out.println(mid);

    }
    public static <TYPE extends Comparable> void order(TYPE d1, TYPE d2, TYPE d3) {
        TYPE max, min, mid = d3;
        if (d1.compareTo(d2) > 0) {
            max = d1;
            min = d2;
        } else {
            max = d2;
            min = d1;
        }
        if (max.compareTo(d3) < 0) {
            mid = max;
            max = d3;
        } else if (min.compareTo(d3) >= 0) {
            mid = min;
            min = d3;
        }
        System.out.println(min + " " + mid + " " + max);

    }
    public static <TYPE extends Comparable> void reverseOrder(TYPE d1, TYPE d2, TYPE d3) {
        TYPE max, min, mid = d3;
        if (d1.compareTo(d2) > 0) {
            max = d1;
            min = d2;
        } else {
            max = d2;
            min = d1;
        }
        if (max.compareTo(d3) < 0) {
            mid = max;
            max = d3;
        } else if (min.compareTo(d3) >= 0) {
            mid = min;
            min = d3;
        }
        System.out.println(max + " " + mid + " " + min);

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = getAnInt(in);
        switch(N) {
            case 1:
                getMin(getAnInt(in), getAnInt(in), getAnInt(in));
                getMin(getaChar(in), getaChar(in), getaChar(in));
                getMin(getaFloat(in), getaFloat(in), getaFloat(in));
                break;
            case 2:
                getCenter(getAnInt(in), getAnInt(in), getAnInt(in));
                getCenter(getaChar(in), getaChar(in), getaChar(in));
                getCenter(getaFloat(in), getaFloat(in), getaFloat(in));
                break;
            case 3:
                getMax(getAnInt(in), getAnInt(in), getAnInt(in));
                getMax(getaChar(in), getaChar(in), getaChar(in));
                getMax(getaFloat(in), getaFloat(in), getaFloat(in));
                break;
            case 4:
                order(getAnInt(in), getAnInt(in), getAnInt(in));
                order(getaChar(in), getaChar(in), getaChar(in));
                order(getaFloat(in), getaFloat(in), getaFloat(in));
                break;
            case 5:
                reverseOrder(getAnInt(in), getAnInt(in), getAnInt(in));
                reverseOrder(getaChar(in), getaChar(in), getaChar(in));
                reverseOrder(getaFloat(in), getaFloat(in), getaFloat(in));
                break;
            default:
                break;
        }
    }

    private static float getaFloat(Scanner in) {
        return in.nextFloat();
    }

    private static char getaChar(Scanner in) {
        return in.next().charAt(0);
    }

    private static int getAnInt(Scanner in) {
        return in.nextInt();
    }
}
   
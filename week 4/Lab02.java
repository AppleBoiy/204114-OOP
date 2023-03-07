import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.print("a: ");
        a = scanner.nextInt();
        System.out.print("b: ");
        b = scanner.nextInt();
        System.out.print("c: ");
        c = scanner.nextInt();
        myMidMinMax(a, b, c);
    }
    
    static void myMidMinMax(int a, int b, int c) {
        int max, mid, min;
        max = Max(a, b, c);
        min = Min(a, b, c);
        mid = (a + b + c) - max - min;
        System.out.printf("max: %d \n", max);
        System.out.printf("min: %d \n", min);
        System.out.printf("mid: %d \n", mid);
        
    }
    
    static int Max(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (c >= a && c >= b) {
            return c;
        } else {
            return b;
        }
    }
    
    static int Min(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }
}

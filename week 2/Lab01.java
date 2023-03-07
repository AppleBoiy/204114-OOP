import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.print("a: ");
        a = scanner.nextInt();
        System.out.print("b: ");
        b = scanner.nextInt();
        System.out.print("c: ");
        c = scanner.nextInt();
        int Area = findArea(a, b, c);
        System.out.println("area: "+ Area);
    }
    
    static int findArea(int a, int b, int c) {
        float s = (float)(a + b + c)/2;
        return (int) Math.ceil( Math.sqrt(s * (s - a) * (s - b) * (s - c)) );
    }
}

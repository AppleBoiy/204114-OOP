import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, result;
        System.out.print("x: ");
        x = scanner.nextInt();
        System.out.print("y: ");
        y = scanner.nextInt();
        
        result = 0;
        for (int i = x; i <= y; i++) {
            result += i;
        }
        System.out.print("sum is: " + result);
    }
}

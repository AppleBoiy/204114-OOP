import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int nearestX = nearestOdd(x);
        System.out.print(nearestX);
    }
    
    static int nearestOdd (double x) {
        if (x%2 == 1) {
            return (int) x;
        } else {
            int roundX = Lab04.round2Int(x);
            if (roundX % 2 == 1) {
                return roundX;
            } else {
                return roundX + 1;
            }
        }
    }
}

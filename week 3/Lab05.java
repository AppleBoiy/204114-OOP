import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, kth, value;
        number = scanner.nextInt();
        kth = scanner.nextInt();
        value = scanner.nextInt();
        
    }
    
    static int setKthDigit(int number, int kth, int value) {
        int kNumber = Lab04.kthDigit(number, kth);
        return number - Lab04.kthDigit(0, 0);
    }
}

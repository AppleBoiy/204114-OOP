import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, k, kth;
        number = scanner.nextInt();
        k = scanner.nextInt();
        kth = kthDigit(number, k);
        System.out.print(kth);
        
    }
    
    public static int kthDigit(int number, int k) {
        return Math.floorDiv(number, (int) Math.pow(10, k))%10;
    }
}

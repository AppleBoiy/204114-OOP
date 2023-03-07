import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldPrice, newPrice;
        oldPrice = scanner.nextInt();
        newPrice = (oldPrice - 50) / 100 * 100 + 98;
        System.out.print(newPrice);

    }
}

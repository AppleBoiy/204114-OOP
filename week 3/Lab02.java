import java.util.Scanner;

public class Lab02 {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        short x = scanner.nextShort();
        short reveredDigit = reverseDigits(x);
        System.out.print(reveredDigit);
        scanner.close();
    }
    
    static short reverseDigits(short x) {
        short result = 0;
        for (short i = 0; i < 4; i++) {
            result += (x%10)*Math.pow(10, 3 - i);
            x /= 10;
        } return result;
    }
}

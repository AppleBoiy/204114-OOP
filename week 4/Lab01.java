import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first, second;
        first = scanner.nextByte();
        second = scanner.nextByte();
        boolean result = love6(first, second);
        System.out.print(result);
    }
    
    static boolean love6(int first, int second) { 
        if (first == 6 || second == 6) {
            return true;
        } else if ( first + second == 6) {
            return true;
        } else { 
            return Math.abs(first - second) == 6 ; 
        }
    }
}

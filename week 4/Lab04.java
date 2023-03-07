import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int intX = round2Int(x);
        System.out.print(intX);
        
    }
    
    static int round2Int(double x) {
        if (x > 0) {
            return (int) (x - 0.5) + 1;
        } else  if (x < 0) {
            return (int) (x + 0.5) - 1;
        } return 0;
    }
}

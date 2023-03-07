import java.util.Scanner;

public class Lab03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double octagon = octagonArea(x);
        System.out.print(octagon);
        scanner.close();
        
    }
    
    static double octagonArea(double x) {
        double totalArea, whiteArea;
        totalArea = x*x;
        whiteArea = 2 * (x/3) * (x/3); 
        return totalArea - whiteArea;
    }
}

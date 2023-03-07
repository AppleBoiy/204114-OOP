import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1, y1, x2, y2;
        final double EPSILON = Math.pow(10, -6);
        
    }
    
    static int circleIntersecion(double x1, double y1, double x2, double y2, double EPSILON ){
        double diffX, diffY, distance;
        diffX = Math.pow(x1 - x2, 2);
        diffY = Math.pow(y1 - y2, 2);
        distance = Math.sqrt(diffX + diffY);
        
        return 1;
    }
    
    static boolean isclose(double x, double y, double EPSILON) {
        double diff = Math.abs(x - y);
        return diff <= EPSILON;
    }
}

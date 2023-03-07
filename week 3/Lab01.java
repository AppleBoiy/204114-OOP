import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double surfaceArea, radius, volume;
        System.out.print("input surface area: ");
        surfaceArea = scanner.nextFloat();
        radius = findRFromSurfaceArea(surfaceArea);
        volume = sphereVolume(radius);
        System.out.printf("volume = %.2f", volume);
        scanner.close();
        
    }
    
    static double findRFromSurfaceArea(double surfaceArea) {
        return Math.sqrt(surfaceArea/(4 * Math.PI));
    }
    
    static double sphereVolume(double radius) {
        return (4D/3) * Math.PI * Math.pow(radius, 3);
    }
}

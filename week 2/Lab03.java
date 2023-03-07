import java.util.Scanner;

import static java.lang.System.*;

public class Lab03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        float m1, m2, b1, b2, x, y;
        out.print("m1: ");
        m1 = scanner.nextFloat();
        out.print("b1: ");
        b1 = scanner.nextFloat();
        out.print("m2: ");
        m2 = scanner.nextFloat();
        out.print("b2: ");
        b2 = scanner.nextFloat();
        
        x = (b2 - b1) / (m1 - m2);
        y = m1*x + b1;
        
        out.printf("Lines intersect at (%.2f,%.2f)", x, y);
        
    }
}

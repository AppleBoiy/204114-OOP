import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p, c, exp;
        p = scanner.nextInt();
        c = scanner.nextInt();
        exp = calculateP2PEvolveEXP(p, c);
        System.out.print(exp);
        
    }
    
    static int calculateP2PEvolveEXP(int p, int c) {
        int evo = Math.floorDiv(p + c - 2, 11);
        if (evo == 0) {
            return 0;
        } else if (evo < p) {
            return evo*500;
        } else {
            return p*500;
        }
    }
}

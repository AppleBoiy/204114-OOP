import java.util.Scanner;

/**
 * @author: Chaipat Jainan 650510606 
 */

public class Lab06_1 {
    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int n = sc.nextInt();
        char x = sc.next().charAt(0);
        char type = sc.next().charAt(0);
        
        Drawing.drawTriangle(n);
        Drawing.drawTriangle(n, x);
        Drawing.drawTriangle(n, x, type);
        
        sc.close();
    }
}

class Drawing {
    
    public static void drawTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    
    public static void drawTriangle(int n, char x) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++){
                System.out.print(x);
            }
            System.out.println();
        }
    }
    
    public static void drawTriangle(int n, char x, char type) {
        switch ( type ) {
            case 'L':
                for (int i = 0; i < n; i++){
                    for (int j = 0 ; j < n - i; j++)
                        System.out.print(x);
                    System.out.println();
                }
                break;
                
            case 'R':
                for (int i = 0; i < n; i++){
                    for (int j = 0; j < n; j++){
                        if (i < n - j - 1)
                            System.out.print(" ");
                        else 
                            System.out.print(x);
                    }
                    System.out.print("\n");
                }
        }
    }
    
}

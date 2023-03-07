import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.floorDiv;

public class Lab02 {
    public static void main(String[] args) {
//        get milliseconds from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input milliseconds: ");
        long M = scanner.nextLong();
        scanner.close();
        int[] milliTrans = timeTrans(M);
        String strMilli = Arrays.toString(milliTrans);
        System.out.println(strMilli);
    }
    
    static int[] divMod(long number, int div) {
        int[] empArray = new int[2];
        empArray[0] = (int) floorDiv(number, div);
        empArray[1] = (int) (number%div);
        return empArray;
    }
    
    static int[] timeTrans(long M) {
        int[] dummy = new int[5], temp;
        
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                temp = divMod(M, 1000);
                dummy[4] = temp[1];
                M = temp[0];
            } else if ( i == 1 || i == 2) {
                temp = divMod(M, 60);
                dummy[4 - i] = temp[1];
                M = temp[0];
            } else if ( i == 3) {
                temp = divMod(M, 24);
                dummy[1] = temp[1];
                M = temp[0];
            } else {
                dummy[0] = (int)M;
            }
        }
        return dummy;
    }
}

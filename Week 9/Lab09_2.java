/**
 * @author chaipat jainan 650510606
 */

import java.util.Scanner;

import static java.lang.System.out;

public class Lab09_2 {
    public static void show2(Shape2Dim[] obj){
        //insert code here
        out.println("Rhombus");
        for (Shape2Dim i : obj){
            if (i instanceof Rhombus){
                i.draw();
            }
        }
        out.println("Square");
        for (Shape2Dim i : obj) {
            if (i instanceof Square) {
                i.draw();
            }
        }

        out.println("Triangle");
        for (Shape2Dim i : obj) {
            if (i instanceof Triangle) {
                i.draw();
            }
        }
    }
    public static void show1(Shape2Dim[] obj){
        //insert code here
        for (Shape2Dim i : obj){
            i.draw();
        }

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int M, N;
        char ch;
        char symbol = input.next().charAt(0);

        M = input.nextInt();

        Shape2Dim[] obj = new Shape2Dim[M];

        for (int i=0; i<M;i++){
            // รับข้อมูลแต่ละรูปภาพ
            ch = input.next().charAt(0);
            N = input.nextInt();
            switch (ch){
                case 'S':
                    obj[i] = new Square();
                    obj[i].setData(N, symbol);
                    break;
                case 'T':
                    obj[i] = new Triangle();
                    obj[i].setData(N,symbol);
                    break;
                case 'R':
                    obj[i] = new Rhombus();
                    obj[i].setData(N, symbol);
                    break;
                default:
                    break;
            }
        }
        int show_type = input.nextInt();

        if (show_type == 1)
            show1(obj);
        else
            show2(obj);
    }
}
abstract class Shape2Dim {
    protected int N;
    protected char symbol;
    public abstract void draw();
    public void setData(int N, char symbol){
        this.N = N;
        this.symbol = symbol;
    }
}

class Rhombus extends Shape2Dim{
    //methods

    public void draw(){

        if (N <= 0) return;

        int i;
        String fsq = "%" + N+"c\n";
        String fsq2;
        out.printf(fsq,symbol);

        for (i = 1; i< N; i++){
            fsq2 = "%" + (N-i)  +  "c%" + (2*i)  + "c\n";
            out.printf(fsq2,symbol,symbol);
        }

        for (i = N - 2; i >= 1; i--){
            fsq2 = "%" + (N-i) + "c%" + (2*i) + "c\n";
            out.printf(fsq2,symbol,symbol);
        }

        out.printf(fsq,symbol);
    }
}

class Triangle extends Shape2Dim {
    //methods
    public void draw() {
        if (N > 0) {
            int i;

            String fsq = "%" + N + "c\n";
            String fsq2;
            out.printf(fsq, symbol);

            for (i = 1; i < N - 1; i++) {
                fsq2 = "%" + (N - i) + "c%" + (2 * i) + "c\n";
                out.printf(fsq2, symbol, symbol);
            }
            for (i = 1; i <= (2 * N) - 1; i++) {
                if (i == (2 * N) - 1) {
                    out.println(symbol);
                } else {
                    out.print(symbol);
                }
            }
        }
    }
}
//class Square

class Square extends Shape2Dim{
    public void draw() {
        if (N > 0) {
            int i;
            String midLine = "%c" + "%" + (N-1) + "c\n";
            for (i=0; i<N; i++) {
                out.print(symbol);
            }
            out.println();

            for (i=0; i<N-2; i++) {
                out.printf(midLine,symbol,symbol);
            }

            for (i=0; i<N; i++) {
                out.print(symbol);
            }
            out.println();
        }
    }

}
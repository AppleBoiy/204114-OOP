/**
 * @author chaipat jainan 650510606
 */

import java.util.Scanner;

public class Lab10_2 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int len_q = input.nextInt();
        char type = input.next().charAt(0);
        int command;
        Queue queue = new Queue(len_q);
        switch (type) {
            case 'I':
                do {
                    command = input.nextInt();
                    switch (command) {
                        case 1:
                            queue.enqueue(input.nextInt());
                            break;
                        case 2:
                            queue.dequeue();
                            break;
                        case 3:
                            queue.show();
                            break;
                    }
                } while (command != 4);
                break;
            default:
                do {
                    command = input.nextInt();
                    switch (command) {
                        case 1:
                            queue.enqueue(input.next().charAt(0));
                            break;
                        case 2:
                            queue.dequeue();
                            break;
                        case 3:
                            queue.show();
                            break;
                    }
                } while (command != 4);
                break;
        }
    }
}

class Queue <TYPE> {
    private int count;
    private int front;
    private int rear;
    private final int maxSize;
    private final Object[] item;
    public Queue(int n) {
        this.maxSize = n;
        this.item = new Object[n];
        this.front = 0;
        this.rear = n-1;
        this.count = 0;
    }
    public void enqueue(TYPE v) {
        if (isFull()) {
            System.out.println("full");
        } else {
            rear = (rear+1) % maxSize;
            item[rear] = v;
            count++;
        }
    }
    public void dequeue() {
        if (!isEmpty()) {
            Object queueFront = item[front];
            front = (front + 1) % maxSize;
            count--;
            System.out.println(queueFront);
        } else{
            System.out.println("null");
        }

    }
    public void show() {
        if (isEmpty()) {
            System.out.print("empty");
        } else {
            for (int i=front; i<front+count; i++) {
                System.out.print(item[i%maxSize] + " ");
            }
        }
        System.out.println();
    }
    public boolean isFull() {return maxSize <= count;}

    public boolean isEmpty() {return count == 0;}
}

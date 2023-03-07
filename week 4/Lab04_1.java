/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package lab04_1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
/**
 *
 * @author CS_TEACH
 */

class ScoreSet{
    ArrayList<Integer> scores = new ArrayList<Integer>(); 
    private int max;
    private int min;
    private int maxPosition;
    private int minPosition;
    private float average;
    private int sum=0;
    private int countBelowAvg = 0;
    
   
    public void addScore(int input){
         scores.add(input);
    }

    public void calMax(){
        max= Collections.max(scores);
        maxPosition=scores.indexOf(max)+1;
    }
    
    public void calMin(){
        min= Collections.min(scores);
        minPosition=scores.indexOf(min)+1;
    }
    
    public void calAverage(){
        int i,score;
        for (i = 0; i < scores.size(); i++) {
            score = scores.get(i);
            sum += score;
        }
        average=(float)sum/scores.size();
    }
    
    public void countBelowAverage(){
        int i,score;       
        for (i = 0; i < scores.size(); i++){
            score = scores.get(i);
            if (score < average)
                countBelowAvg += 1;
        }
    }
    
    public void printReport(){
        System.out.printf("%d %d\n",max, maxPosition);
        System.out.printf("%d %d\n",min , minPosition);
        System.out.print(countBelowAvg);    
    }
}


public class Lab04_1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScoreSet s=new ScoreSet();
        int input;
        
        do{
        input = sc.nextInt();
        if ((input <= 100) && (input > 0)) {
                s.addScore(input);
            }
        }while (input != 0);

        s.calMax();
        s.calMin();
        s.calAverage();
        s.countBelowAverage();
        s.printReport();
            
    }
}
    


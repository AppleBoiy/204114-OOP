/**
 * @author chaipat jainan 650510606
 */

import java.util.Scanner;
public class Lab09_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Student[] std = new Student[250];
        int id = 0;
        char choice;
        String name = "";
        int mid,fin, score;

        do{
            // System.out.print("Enter undergraduate student or graduate student (u/g): ");
            choice = in.next().charAt(0);

            name = in.next();
            mid = in.nextInt();
            fin = in.nextInt();
            score = in.nextInt();

            if (choice == 'u' || choice == 'U') {
                Undergraduate_Student US = new Undergraduate_Student();
                //insert code here

                US.setInfo(name, mid, fin);
                US.setProjectScore(score);

                std[id] = US;



            } else if (choice == 'g' || choice == 'G') {
                Graduate_Student GS = new Graduate_Student();
                //insert code here

                GS.setInfo(name, mid, fin);
                GS.setPublicationNo(score);

                std[id] = GS;

            }
            choice = in.next().charAt(0);
            choice = Character.toLowerCase(choice);

            id++;
        }while(choice == 'y');

        reportGrade(std, id);
    }

    public static void reportGrade(Student[] std, int n) {
        //insert code here

        int num_S = 0;
        for (int i = 0; i < n; i++) {
            //insert code here

            int mid = std[i].getMidtermScore();
            int fn = std[i].getFinalScore();
            int totalScore = mid + fn;

            //insert code here

            char grade = std[i].calGrade(totalScore);
            if (grade == 'S'){
                num_S++;
            }

            System.out.printf("%s : %C\n", std[i].getName(), grade);



        }

        System.out.println("U = "+ (n-num_S)+ "\nS = "+ num_S);
    }
}
abstract class Student{
    protected String name;
    protected int midtermScore;
    protected int finalScore;

    public void setInfo(String name, int mid, int fin) {
        this.name = name;
        this.midtermScore = mid;
        this.finalScore = fin;
    }

    public String getName()  { return name;         }
    public int getMidtermScore() { return midtermScore; }
    public int getFinalScore() { return finalScore;   }


    public abstract char calGrade(int totalScore);

}

class Undergraduate_Student extends Student {
    private int projectScore;
    //method

    public void setProjectScore(int n) {
        projectScore = n;
    }

    public int getProjectScore() { return projectScore; }

    @Override
    public char calGrade(int totalScore){
        return(totalScore >= 50 && projectScore >= 50)?'S' : 'U';
    }


}

class Graduate_Student extends Student {
    private int publicationNo;

    public void setPublicationNo(int n) {
        publicationNo = n;
    }


    @Override
    public char calGrade(int totalScore) {

        return (totalScore >= 60 && publicationNo >= 2)?'S':'U';
    }
    //method




}

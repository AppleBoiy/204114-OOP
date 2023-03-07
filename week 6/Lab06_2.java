/**
 * @author: Chaipat Jainan 65010606
 */

import java.util.Scanner;

public class Lab06_2 {
    
    protected static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) { 
        
        Health guess1 = healthDetail();
        Health guess2 = healthDetail();
        if (guess1.weightScore == guess2.weightScore)
            System.out.println("both");
        
        else if (guess1.weightScore < guess2.weightScore)
            System.out.println(guess1.name);
        
        else
            System.out.println(guess2.name);
        
        sc.close();
    }

    protected static Health healthDetail() {
        String name = sc.nextLine();
        char gender = sc.next().charAt(0);
        int height = sc.nextInt();
        int weight = sc.nextInt();

        return new Health(name, gender, height, weight);
    }
    
}

class Health {
    
    protected String name;
    protected char gender;
    protected int height;
    protected int weight;
    
    protected int weightScore;
    
    
    public Health(String name, char gender, int height, int weight) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        
        int standardScore = height - (gender == 'M'? 100: 110);
        this.weightScore = Math.abs(standardScore - weight);
        
    }
    
}

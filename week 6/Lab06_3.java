import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: Chaipat Jainan
 */

public class Lab06_3 {
    private static final Scanner sc = new Scanner(System.in);
    private static final ArrayList<Voter> voters = new ArrayList<Voter>();
    private static final Star[] candidateMStar = MStars();
    private static final Star[] candidateFStar = FStars();
    private static Star hotMStar;
    private static Star hotFStar;


    public static void main(String[] args) {
        
        int round = sc.nextInt();
        for (int i = 0; i < round; i++) {
            String voterName = sc.nextLine();
            
            int voteMale = sc.nextInt();
            int voteFemale = sc.nextInt();
            
            voteStar(voteMale, voteFemale);
            Voter voter = new Voter(voterName, voteMale, voteFemale);
            voters.add(voter);
        }
        
        setHotStar();
        
        checkAndPrintVote();
        printGoodLuckPeople();
        
        sc.close();
    }
    
    
    private static void checkAndPrintVote() {
        System.out.println(hotMStar.name + " " + hotFStar.name);
    }
    
    private static void printGoodLuckPeople() {
        for (Voter voter: voters) {
            if (Voter.getPrize(voter, hotMStar, hotFStar))
                System.out.println(voter.name);
        }
    }
    
    private static Star[] MStars() {
        Star MStar1 = new Star("Nadech", 1);
        Star MStar2 = new Star("Wier", 2);
        Star MStar3 = new Star("Mario", 3);

        return new Star[] {MStar1, MStar2, MStar3};
    }
    private static Star[] FStars() {
        Star FStar1 = new Star("Aum", 1);
        Star FStar2 = new Star("Yaya", 2);
        Star FStar3 = new Star("Bella", 3);
        
        return new Star[] {FStar1, FStar2, FStar3};
    }
    
    private static void setHotStar() {
        hotMStar = Star.hotStar(candidateMStar);
        hotFStar = Star.hotStar(candidateFStar);    
    }
    
    private static void voteStar(int voteMale, int voteFemale) {
        if (voteFemale == 1) {
            candidateFStar[0].addScore();
        } else if (voteFemale == 2) {
            candidateFStar[1].addScore();
        } else {
            candidateFStar[2].addScore();
        }

        if (voteMale == 1) {
            candidateMStar[0].addScore();
        } else if (voteMale == 2) {
            candidateMStar[1].addScore();
        } else{
            candidateMStar[2].addScore();
        }
    }
}


class Star {
    
    protected String name;
    protected int number;
    
    private int _vote = 0;
    
    public Star(String name, int number) {
        this.name = name;
        this.number = number;
        
    }
    
    void addScore() {
        _vote++;
    }
    
    int getVote() {
        return _vote;    
    }
    
    static Star hotStar(Star[] stars) {
        Star HStar = stars[0];
        int mostVoted = stars[0].getVote();
        
        for (Star star: stars) {
            if (star.getVote() > mostVoted) {
                HStar = star;
                mostVoted = star.getVote();
            }
        }
        return HStar;
        
    }
    
    
}

class Voter {
    
    protected String name;
    protected int voteMale;
    protected int voteFemale;
    
    public Voter(String name, int voteMaleNo, int voteFemaleNo) {
        this.name = name;
        this.voteMale = voteMaleNo;
        this.voteFemale = voteFemaleNo;
    }
    
    static boolean getPrize(Voter voter, Star MStar, Star FStar) {
        return voter.voteMale == MStar.number && 
                voter.voteFemale == FStar.number;
    }

}

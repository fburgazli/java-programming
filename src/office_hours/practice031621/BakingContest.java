package office_hours.practice031621;

import java.util.Scanner;

public class BakingContest {


    /*
    You are in a baking contest. Your cookies will be rated by 3 judges. The 3 scores from the judges will be averaged and compared with the 2 other people in the contest.

Use variables: judge score 1, judge score 2, judge score 3, other person score 1, other persons score 2

If your score is more than both of the other people then print "First place!"
If your score is more then one other person then print "Second place"
If your score is less than both of the other people then print "Third place"
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int judge = 1;
        System.out.println("Enter judge " + judge++ + " score:");
        int score1 = scan.nextInt();
        System.out.println("Enter judge " + judge++ + " score:");
        int score2 = scan.nextInt();
        System.out.println("Enter judge " + judge++ + " score:");
        int score3 = scan.nextInt();

        System.out.println("Enter other person1's score:");
        int person1 = scan.nextInt();
        System.out.println("Enter other person2's score:");
        int person2 = scan.nextInt();

        double myScoreAvg = (score1+score2+score3)/3.0;
        System.out.println(myScoreAvg);

        if ((myScoreAvg > person1) && (myScoreAvg > person2)) {
            System.out.println("You got the 1st place");
        } else if( (myScoreAvg > person1 && myScoreAvg < person2) ||
                (myScoreAvg < person1 && myScoreAvg > person2)){
            System.out.println("You got the 2nd place");
        } else{
            System.out.println("You got the 3rd place");
        }
        //todo : check for tie if you and other person have the same score







    }
}

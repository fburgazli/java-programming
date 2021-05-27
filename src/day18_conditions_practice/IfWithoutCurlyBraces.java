package day18_conditions_practice;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todaysClass = "Python";
        if(todaysClass.equals("Java"))
            System.out.println("Java is fun!");
        else
            System.out.println(todaysClass+ " is also fun");
        // if we have only one statement to run in if/ else you can use it without {}
        // But never recommended.

        int score = 1;
        if (score == 1)
            System.out.println("lowest score " + score);
         else if(score == 2) {
            System.out.println("Score is " + score);
        }else if(score ==3)
            System.out.println("Highest score is " + score);
        else
            System.out.println("Invalid score");

        // if condition is true both will run
        // if condition is false second line will run because it is not dependent to if.

        if ( score ==1)
            System.out.println("score is 1");
            System.out.println( "1 is score");



    }
}

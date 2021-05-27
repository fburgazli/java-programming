package day24_while_do_while_loops;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.*;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random randomNum = new Random();

        int attempts =0;

        int guess ;
        int secretNumber = randomNum.nextInt(101);
        do{
            System.out.println("Enter your guess:");
            guess = scan.nextInt();
            if(guess < secretNumber){
                System.out.println("Go up!");
            } else if(guess > secretNumber){
                System.out.println("Go down!");
            }
            attempts++;

        } while( guess != secretNumber && attempts < 5);
        if( guess == secretNumber) {
            System.out.println("You win!");
        } else {
            System.out.println("You lost!");

        }

    }
}

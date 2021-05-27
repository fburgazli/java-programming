package office_hours.saim_only_tasks;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        /*
         [EligibleToVote]

        Redo the EligibleToVote task but this time ask which country the person has citizenship for

        If the citizenship is for the USA then ask user to enter their age. Use the age to figure out if they vote.

            -> 18+ : You are eligible to vote
            -> < 18: You must be at least 18 years old to vote

        If the person is not a USA citizen: You must be US citizen in order to vote"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Which country do you have citizenship for?");

        String citizenship = scan.nextLine();
        scan.nextLine();


        if(citizenship.equals("USA")) {

            System.out.println("Enter your age:");
            int age = scan.nextInt();
            if(age >=18) {
                System.out.println("You are eligible to vote");
            } else {
                System.out.println("You must be at least 18 years old to vote.");
            }

        } else {
            System.out.println("You must be US citizen in order to vote");
        }

    }
}

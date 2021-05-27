package day10_shorthand_operators;

import java.util.Scanner;

public class NextLineBug2 {
    //If you use nextLine() before others there is no problem.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the month?");
        String month = scan.nextLine();

        System.out.println("What is the rent?");
        double rent = scan.nextDouble();




        System.out.println("rent = " + rent);
        System.out.println("month = " + month);


    }
}

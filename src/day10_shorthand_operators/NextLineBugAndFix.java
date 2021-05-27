package day10_shorthand_operators;

import java.util.Scanner;
//If you use nextLine() after others like nextInt(),nextDoble(),etc. there will be skipping problem.
//https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo

public class NextLineBugAndFix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the rent?");
        double rent = scan.nextDouble();

        System.out.println("What is the month?");
        scan.nextLine(); //fix the bug. WORKAROUND
        String month = scan.nextLine();


        System.out.println("rent = " + rent);
        System.out.println("month = " + month);


    }
}

package day09_Scanner_practice;

import java.util.Scanner;

public class MileToKm {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter miles to convert to km :");
        double mile = scan.nextDouble();
        double km = mile *1.60934;
        System.out.println(mile + " miles = " + km + " km");


        System.out.println("Enter pounds to convert to kg :");
        double pound = scan.nextDouble();
        double kg = pound * 0.453592;
        System.out.println(pound + " lb = " + kg + " kg");


    }
}

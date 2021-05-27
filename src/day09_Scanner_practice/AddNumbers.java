package day09_Scanner_practice;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int num1 =scan.nextInt();
        System.out.println("Enter the second integer:");
        int num2 =scan.nextInt();
        int sum = num1 + num2;
        int dif = num1 - num2;
        int product = num1 * num2;
        double quotient = (double)num1 / num2;

        System.out.println("The sum of " + num1 + " and " + num2  + ": " +sum);
        System.out.println("The difference of " + num1 + " and " + num2  + ": " + dif);
        System.out.println("The product of " + num1 + " and " + num2  + ": " + product);
        System.out.println("The quotient of " + num1 + " and " + num2  + ": " + quotient);

    }
}

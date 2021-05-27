package day09_Scanner_practice;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your hourly rate: ");
        double rate = scan.nextDouble();
        double weeklyPay = rate* 40;
        double monthlyPay = weeklyPay*26/12;
        double annualPAy = monthlyPay*12;
        System.out.println("Your Bi-Weekly salary is $" +weeklyPay);
        System.out.println("Your monthly salary is $" +monthlyPay);
        System.out.println("Your annual salary is $" + annualPAy);
    }
}

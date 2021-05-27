package day13_conditional_statements2;

import java.util.Scanner;

public class ATMincodeProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to PNC Bank ATM");
        System.out.println("Enter your PIN : ");
        Scanner scan = new Scanner(System.in);
        int input =scan.nextInt();
        int pinCode = 9512;

        if(input == pinCode){
            System.out.println("Welcome to your account.\nYou can withdraw,deposit,check balance, etc.");

        } else {
            System.out.println("Incorrect PIN. Please try again.");
        }
        System.out.println("Thank you for using PNC Bank ATM");
    }
}

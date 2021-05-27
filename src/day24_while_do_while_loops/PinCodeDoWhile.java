package day24_while_do_while_loops;

import java.util.Scanner;

public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pinCode;
        int secretPincode = 1234;
        int trials = 0;
        do {

            System.out.println("Enter your pin");
            pinCode = scan.nextInt();
            trials++;

        } while( pinCode != secretPincode  && trials < 3 );
        if( pinCode == secretPincode) {
            System.out.println("Welcome to your account");
        } else {
            System.out.println("Your account locked!");
        }

    }


}

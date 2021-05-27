package office_hours.practice031021;

import java.util.Scanner;

public class Increment {
  public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("WELCOME!Please enter your password : ");
//        int input= scan.nextInt();
//        int pass = 8640;
//
//        if (input==pass){
//            System.out.println("Menu : 1-Withdraw 2-Deposit 3-Check Balance 4- Other");
//        } else {
//            System.out.println("Wrong password.Please try again!");
//        }

      Scanner scan = new Scanner(System.in);

      System.out.println("WELCOME TO CHASE");
      System.out.println("enter your pin");
      int pinCode = scan.nextInt();

      if (pinCode == 8640) {
          System.out.println("menu \n" + "witdrawal \n" + "deposit\n" + "check balance\n");
      }else {
          System.out.println("wrong pasword\n" + "try again");
      }

    }
}

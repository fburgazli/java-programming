package day09_Scanner_practice;

import java.util.Scanner;

public class AskAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name :");
        String firstName =scan.next();
        System.out.println("How old are you? ");
        int age = scan.nextInt();
        System.out.println(firstName + "! "+ age + " is a great age! ");
        scan.close();


    }
}

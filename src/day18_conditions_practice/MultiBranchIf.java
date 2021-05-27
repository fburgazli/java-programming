package day18_conditions_practice;

import java.util.Scanner;

public class MultiBranchIf {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = scan.nextInt();
        if( num >0){
            System.out.println(num +  " is a positive number");
        } else if(num < 0){
            System.out.println(num + " is a negative number");
        } else {
            System.out.println(num  + " is zero.");
        }
    }
}

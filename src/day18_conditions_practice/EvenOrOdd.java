package day18_conditions_practice;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num= scan.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }

        if(num % 3 == 0 && num % 5 ==0){
            System.out.println("FizzBuzz");
        } else if(num %3 ==0){
            System.out.println("Fizz");
        } else if(num % 5 ==0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
    }
}

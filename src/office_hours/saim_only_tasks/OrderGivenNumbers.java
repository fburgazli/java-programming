package office_hours.saim_only_tasks;

import java.util.Scanner;

public class OrderGivenNumbers {
    public static void main(String[] args) {
        /*
           Write a program that will ask the user to enter three numbers.
            If the numbers are the same print “All integers are the same”
            If they are not equal, print which is the biggest value of the three numbers
            —> If there is two numbers which are the largest print the one that came first
            > Input: 3,2,6
            > Output: The biggest number from 3, 2 and 6 is: 6
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if( num1 == num2 && num2 == num3){
            System.out.println(" All integers are the same");
        } else if (num1 > num2 && num1 > num3){
            System.out.println("num1 = " + num1);
        } else if(num2 > num1 && num2 > num3 ){
            System.out.println("num2 = " + num2);
        } else if (num3> num1 && num3 > num2 ) {
            System.out.println("num3 = " + num3);
        }else if ( num1 > num2 && (num2 == num3 || num1 == num3)) {
            System.out.println("num1 = " + num1);
        }else if ( num2 > num1 && (num1 == num3 || num2 == num3)) {
            System.out.println("num2 = " + num2);
        } else if( num3 > num1 && (num1 == num2 || num2 == num3)) {
            System.out.println("num3 = " + num3);
        } else {
            System.out.println("I don't know what to do!");
        }



    }
}

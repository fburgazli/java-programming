package office_hours.saim_only_tasks.loops_practice_1;

import java.util.Scanner;

public class MaxOrMinNumber {
    /*
    [Max and Min from 5 numbers]
    Write a program that can ask the user "enter a number" five times and return the maximum number
    Write a program that can ask the user "enter a number" five times and return the minimum number
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i  = 0;
        int max = 0;
            while(i<5){
            System.out.println("Enter a number:");
            int n = scan.nextInt();
            if(i == 0){
                max = n;
            }else if(i >= 1 && n > max){
                max = n;
            }
            i++;
        }
        System.out.println("max =" + max);
            int  min= 0;
            i = 0;
            while(i<5){
                System.out.println("Enter a number:");
                int n = scan.nextInt();
                if(i == 0) {
                    min = n;
                }else if(i >=1 && n < min){
                    min = n;
                }
                i++;

            }
        System.out.println("Min = " + min);

    }
}

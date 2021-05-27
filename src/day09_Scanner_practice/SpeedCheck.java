package day09_Scanner_practice;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int speedLimit = 55;
        System.out.println("Enter your current speed : ");
        int currentSpeed =scan.nextInt();
        int overLimit = currentSpeed - speedLimit;

        System.out.println("You are driving " + overLimit + " mph over the limit.Slow down!");

    }
}

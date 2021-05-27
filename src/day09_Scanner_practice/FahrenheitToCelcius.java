package day09_Scanner_practice;

import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***WELCOME TO THE TEMPERATURE CONVERTER FROM F TO C***");
        System.out.println("======================================================");
        System.out.println("Please enter the temperature in F to convert to C:");
        int fahrenheit = scan.nextInt();
        int celcius = (int) (fahrenheit-32)*5/9;
        System.out.println(fahrenheit+" F = " + celcius + " C");
        System.out.println("======================================================");
        System.out.println("***THANK YOU!***");

    }
}

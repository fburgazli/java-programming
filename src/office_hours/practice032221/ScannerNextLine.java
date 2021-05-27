package office_hours.practice032221;

import java.util.Scanner;

public class ScannerNextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        next() : read a String value from the console, it only reads a single word(till first space)
        nextLine() :read a String value from the console,it will read multiple words,also accepts the enter input.
         */
        System.out.println("Enter a number:");
        int number = input.nextInt();
        System.out.println("Enter your name:");
        input.nextLine(); //if you use any scanner before nextLine() you need to write this empty line!
        String name =input.nextLine();
        System.out.println("number = " + number);
        System.out.println("name = " + name);
        System.out.println(" Enter city?");
        String city = input.nextLine(); // here  you don't need empty line
        System.out.println("city = " + city);

    }

}

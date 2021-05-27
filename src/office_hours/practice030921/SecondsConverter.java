package office_hours.practice030921;

import java.util.Scanner;

public class SecondsConverter {
    /*
    convert entered seconds to ? hours, ?minutes, and ?seconds.
     */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds: ");
        int inputSeconds = scan.nextInt();
        int hour = inputSeconds /3600;
        inputSeconds %= 3600;
        int minutes = inputSeconds/60;
        int seconds = inputSeconds%60;

        System.out.println(hour + " hours, "+ minutes +" minutes, and " + seconds +" seconds.");

    }
}

package day25_for_loop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrintNumbersScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start: ");
        int start = scan.nextInt();
        System.out.println("Enter end: ");
        int end = scan.nextInt();
        if(start> end) {
            System.out.println("Reverse numbering is not supported!");
        }
            for (int i = start; i <= end; i++) {

                System.out.print(i + " ");
            }

    }
}

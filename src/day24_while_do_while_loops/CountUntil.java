package day24_while_do_while_loops;

import java.util.Scanner;

public class CountUntil {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int count = 1;

        while(count <= number){
            System.out.print(count + " ");
            count++;
        }
    }
}

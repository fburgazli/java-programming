package day14_multi_branch_if_statements;

import java.util.Scanner;

public class YesOrNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you sure you want to delete this?");
        String select = scan.next();
        boolean isYes = select.equals("y") || select.equals("Y");
        if(isYes) {
            System.out.println("Your file will be deleted.");
            //isYes = true; no need to write this line
        } else {
            System.out.println("Your file deletion is cancelled");
            //isYes = false; no need to write this line
        }
        System.out.println("Is the file  deleted? -" + isYes);

    }
}

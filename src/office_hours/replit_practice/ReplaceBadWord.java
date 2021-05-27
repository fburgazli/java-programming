package office_hours.replit_practice;

import java.util.Scanner;

public class ReplaceBadWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter text: ");


        String text=in.nextLine();
        in.nextLine();
        System.out.println("enter badword: ");
        String badWord= in.nextLine();
        in.nextLine();

        System.out.println(clean(text, badWord));
    }
    public static String clean (String text ,String badWord) {
        return text.replace(badWord+" ","");

    }
}

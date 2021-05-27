package office_hours.practice033121;

import java.util.Scanner;

public class SelfPracticeSearchForAWordInAString {
    public static void main(String[] args) {
        //This program will search for a keyword in a given text.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please copy and paste your text here: \n");
        String text = scan.nextLine();
        scan.nextLine();

        System.out.println("Please enter your keyword to search for in the text: \n");

        String word = scan.next();

        int count =0 ;
        if(text.contains(word)){
            for (int i = 0; i <= text.length()-word.length(); i++) {

                if (text.substring(i,i+word.length()).equalsIgnoreCase(word)){
                    count++;
                }

            }
            System.out.println("The keyword \""+ word + "\" appear in the given text "+ count + " times.<Case Insensitive>");

        } else {
            System.out.println("The \""+word+"\" does not appear in the given text!");
        }

    }


}

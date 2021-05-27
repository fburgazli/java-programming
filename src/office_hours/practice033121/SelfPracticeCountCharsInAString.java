package office_hours.practice033121;
import java.util.*;
public class SelfPracticeCountCharsInAString {
    public static void main(String[] args) {
        //This program will give you the number of all chars in your text.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please copy and paste your text here: \n");
        String text = scan.nextLine();

        int countUp = 0 ;
        int countLow = 0;
        int countDigits = 0 ;
        int otherChars = 0 ;
        int countSpaces =0;

        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)>='A' && text.charAt(i)<= 'Z'){
                countUp++;
            }
            if(text.charAt(i)>='a' && text.charAt(i)<= 'z'){
                countLow++;
            }
            if(text.charAt(i)>='0' && text.charAt(i)<= '9'){
                countDigits++;
            }
            if(text.charAt(i)==' '){
                countSpaces++;
            }



        }
        otherChars = text.length()-(countUp+countLow+countDigits+countSpaces);
        System.out.println("Your text has " + text.length() + " number of all characters.");
        System.out.println("Total Uppercase letters = " + countUp);
        System.out.println("Total Lowercase letters = = " + countLow);
        System.out.println("Total Number Digits= " + countDigits);
        System.out.println("Total Spaces = " + countSpaces);
        System.out.println("Total of all other characters = " + otherChars);

    }
}

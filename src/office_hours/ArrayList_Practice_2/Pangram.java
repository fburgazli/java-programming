package office_hours.ArrayList_Practice_2;

import java.util.Locale;

public class Pangram {
    /*
    Pangram – Not ArrayList task
    A Pangram is a String that contains all of the letters in the alphabet.
    Create a method that will accept a String and determine if the given String is a
    pangram. If it is a pangram return true, otherwise return false.
    Example Pangrams:
    - A quick brown fox jumps over the lazy dog.
    - Back in June we delivered oxygen equipment of the same size.
         */
    public static void main(String[] args) {
        String str1 = "A quick brown fox jumps over the lazy dog.";
        System.out.println(isPangram(str1));
        String str2= "Back in June we delivered oxygen equipment of the same size.";
        System.out.println(isPangram(str2));

    }
    public static boolean isPangram(String str){
        str = str.toLowerCase();
        for (char i = 'a'; i <='z' ; i++) {
            if(!str.contains(i+"")){
                return false;
            }
        }
        return true;
    }
}

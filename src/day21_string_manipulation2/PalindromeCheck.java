package day21_string_manipulation2;

public class PalindromeCheck {
    public static void main(String[] args) {


        String word = "mom";
        char first = word.charAt(0);
        char last = word.charAt(2);
        if (first == last) {
            System.out.println("first and last letter same");
        } else {
            System.out.println("first and last letter not same");
        }

        String word2 = "aziza";
        char firstLetter = word2.charAt(0);
        char lastLetter = word2.charAt(word2.length()-1);
        if(firstLetter == lastLetter){
            System.out.println("first and last letter match");
        } else {
            System.out.println("first and last letter mismatch");
        }



    }
}

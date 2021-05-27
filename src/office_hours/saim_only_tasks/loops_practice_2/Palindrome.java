package office_hours.saim_only_tasks.loops_practice_2;

public class Palindrome {
    /*
            [IQ] Palindrome
        A word that is the same read forwards and backwards. User takes a
        word from the console. Print true if the word is a palindrome. Print
        false if the word is not palindrome.
        -> input: civic
        -> output: true
        -> input: java
        -> output: false
     */

    public static void main(String[] args) {
        String word = "civicr";
        boolean isPalindrome =false;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)==word.charAt(word.length()-1-i)){
                    isPalindrome = true;
                    break;
            }
        }System.out.println(isPalindrome);
    }
}

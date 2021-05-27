package day26_loops;

public class PrintChars {
    public static void main(String[] args) {
        String word = "Java is fun!";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
        for (int i = word.length()-1; i>=0 ; i--) {

            System.out.println(word.charAt(i));
        }
    }
}

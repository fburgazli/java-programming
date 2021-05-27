package day12_conditional_statement;

public class CompareChars {
    public static void main(String[] args) {
        char letter1 = 'A';
        char letter2 = 'J';

        System.out.println(letter1 == letter2); // 65 = 74
        System.out.println(letter1 > letter2); // 65 > 74
        System.out.println(letter1 < letter2); // 65 < 74

        char grade = 'B';
        boolean pass = grade<= 'D';
        System.out.println("pass = " + pass);


    }
}

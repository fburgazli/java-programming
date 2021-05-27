package office_hours.practice051121;

import java.util.*;

public class SeparatePartsWithLambda {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            result.add(str.charAt(i));
        }
        //System.out.println("result = " + result);
        List<Character> specials = new ArrayList<>(result);
        List<Character> digits = new ArrayList<>(result);
        List<Character> letters = new ArrayList<>(result);
        letters.removeIf(n -> !Character.isLetter(n));
        digits.removeIf(n -> !Character.isDigit(n));
        specials.removeIf(n -> Character.isLetterOrDigit(n));

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specials = " + specials);
        System.out.println("result = " + result);

    }
}

package office_hours.practice051021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparateParts_2 {
    public static void main(String args[]) {
        System.out.println(separateParts("ABCD123$%#@&456EFG!"));

    }
    public static List<List<Character>> separateParts(String s){
        List<List<Character>> result = new ArrayList<>();

        List<Character> specials = new ArrayList<>();
        List<Character> digits = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char eachChar = s.charAt(i);
            if(Character.isLetter(eachChar)){
                letters.add(eachChar);
            } else if(Character.isDigit(eachChar)){
                digits.add(eachChar);
            }else if(Character.isSpaceChar(eachChar)){
                specials.add(eachChar);
            }
        }

        result.add(specials);
        result.add(letters);
        result.add(digits);
        return result;

    }
}

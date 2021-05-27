package office_hours.practice051021;

import java.util.ArrayList;
import java.util.List;

public class SeparateParts {
    public static void main(String args[]) {
        System.out.println(separateParts("ABCD123$%#@&456EFG!"));

    }
    public static List<List<Character>> separateParts(String s){
        List<List<Character>> result = new ArrayList<>();
        List<Character> specials = new ArrayList<>();
        List<Character> digits = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                letters.add(s.charAt(i));
            }else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                digits.add(s.charAt(i));
            }else{
                specials.add(s.charAt(i));
            }
        }
        result.add(specials);
        result.add(letters);
        result.add(digits);
        return result;

    }
}

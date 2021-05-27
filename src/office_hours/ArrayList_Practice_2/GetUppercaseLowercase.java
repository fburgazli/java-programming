package office_hours.ArrayList_Practice_2;

import java.util.ArrayList;
import java.util.List;

public class GetUppercaseLowercase {
    public static void main(String[] args) {
        System.out.println(getUpperLowercase("abcdABCDfbgehFDRCSA", true));
        System.out.println(getUpperLowercase("abcdABCDfbgehFDRCSA", false));
    }
    public static List<Character> getUpperLowercase(String str, boolean isUpper){
        List<Character> uppercase = new ArrayList<>();
        List<Character> lowercase = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                uppercase.add(str.charAt(i));
                }else {
                lowercase.add(str.charAt(i));
                }
            }
        if(isUpper) {
            return uppercase;
        }
        return lowercase;
        }
    }


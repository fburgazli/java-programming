package day38_methods;

import java.util.Arrays;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isNullOrEmty("hello"));
        String word = null;
        //System.out.println(word.toUpperCase()); this will give NullPointerException because if str is null we can not use any method on it.

        System.out.println(isNullOrEmty(word));
        word = "";
        System.out.println(isNullOrEmty(word));
        System.out.println("Palindrome = " + isPalindrome("Civic"));

    }
    public static boolean isNullOrEmty(String str){
        return str == null || str.length()==0; // you can use str.isEmpty() or str.equals("") too.

    }
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2 ; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
        }
    }
        return true;
    }
    public static String reverse(String str){
        String reverseStr = "";
        for (int i = str.length()-1; i>=0 ; i--) {
            reverseStr +=str.charAt(i);
        }
        return reverseStr;
    }

}

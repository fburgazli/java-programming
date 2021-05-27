package day22_string_manipulation3;

public class ReverseUsingCharAt {
    public static void main(String[] args) {
        String word = "java";
        String reverse = ""+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);
        System.out.println("reverse = " + reverse);
        
        
    }
}

package day20_string_manipulation1;

public class StringReplaceMethod {
    public static void main(String[] args) {
        String word = "java strings are fun";
        System.out.println(word.replace("a","x"));
        System.out.println(word.replace("strings", "conditions"));
        System.out.println(word.replace("java ",""));

    }
}

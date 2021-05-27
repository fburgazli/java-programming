package day22_string_manipulation3;

public class SubstringMethod {
    public static void main(String[] args) {
        //               012345678910
        String   word = "java is fun";
        System.out.println(word.substring(0,4)); // java
        System.out.println(word.substring(0,7)); // java is
        System.out.println(word.substring(5,7)); // is
        System.out.println(word.substring(8)); // fun
        System.out.println(word.substring(8,11)); // fun = 8,11 also working but 8,12 outofbound error.
        System.out.println(word.substring(5));




    }
}

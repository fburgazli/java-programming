package day20_string_manipulation1;

import java.lang.*; /** you do not need this ,it is automatically imported by compiler.
                        imports all classes from java.lang package*/

/** this is for Scanner and whatever else in that util package */
public class StringCreationMethods {
    public static void main(String[] args) {

        String word1= "Java"; //one way to create a String,most common use.
        String word2 = new String("Python"); // another way to create String
        String word3 = "";
        String word4 = new String();
        //isEmpty() method checks if a string is empty or not returns true/false.
        System.out.println(word1.isEmpty());
        System.out.println(word2.isEmpty());
        System.out.println(word3.isEmpty());
        System.out.println(word4.isEmpty());




    }
}

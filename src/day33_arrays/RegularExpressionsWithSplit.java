package day33_arrays;

import java.util.Arrays;

public class RegularExpressionsWithSplit {
    public static void main(String[] args) {
        System.out.println("Java regular expressions for split method.");
        String word="java1sql2html3css";
        String[] wordArray=word.split("\\d");//separates from any digit.
        System.out.println(Arrays.toString(wordArray));//[java, sql, html, css]
        System.out.println(word.replaceAll("\\d", "_"));


    }
}

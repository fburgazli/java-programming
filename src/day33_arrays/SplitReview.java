package day33_arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word ="https://discord.com/channels/805882389380595763/805882390974169171";
        String[] wordArray=word.split("/");
        System.out.println(Arrays.toString(wordArray));//[https:, , discord.com, channels, 805882389380595763, 805882390974169171]

        String word2="java";
        String[] word2Array= word2.split("");
        char[] word2ArrWithChar=word2.toCharArray();
        System.out.println(Arrays.toString(word2ArrWithChar));

        System.out.println(Arrays.toString(word2Array));
        System.out.println(word2Array.length);


    }
}

package day32_arrays_split;

import java.util.Arrays;

public class StringSplitMethod {
    public static void main(String[] args) {
        String words = "java;python;ruby;selenium;html";
        String sentence="today I am learning java arrays ";
        String cats=" bengal cat tabby cat persian cat van cat ";
        String[] wordsArray = words.split(";");
        String[] wordsInSentence = sentence.split(" ");
        String[] catsArray= cats.split(" cat ");

        System.out.println(Arrays.toString(wordsArray));
        System.out.println("Words Array cotains " + wordsArray.length + " words.");
        for(String each:wordsArray){
            System.out.print(each+", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(wordsInSentence));
        System.out.println("Number of words in this sentence = "+ wordsInSentence.length);
        System.out.println("First word : " +wordsInSentence[0]);
        System.out.println("First word : " +sentence.split(" ")[0]);

        for(String each: wordsInSentence){
            System.out.println(each);
        }
        System.out.println(Arrays.toString(catsArray));

    }
}

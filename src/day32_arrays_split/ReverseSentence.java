package day32_arrays_split;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence =" today is java array class";
        String[] words = sentence.split(" ");
        //String[] reversed = new String[words.length];
        String reversed ="";
        for (int i = words.length-1; i >=0 ; i--) {

            //reversed[words.length-1-i]=words[i];
            reversed += words[i]+" ";

        }
//        for(String each:reversed){
//            System.out.print(each+" ");
//        }
        System.out.println(reversed);

        String word="java";
        String[] letter = word.split("");
        char[] letters =word.toCharArray();
        //System.out.println(Arrays.toString(letter));
        for(String each:letter){
            System.out.print(each+" ");
        }
        //System.out.println(Arrays.toString(letters));
        System.out.println();
        for (char each:letters){
            System.out.print(each+" ");
        }
    }
}

package day32_arrays_split;

import java.util.Arrays;

public class CountUsingSplit {
    public static void main(String[] args) {


        String cats = "bengal cat tabby cat persian cat no cat here";
        String[] catsArray = cats.split(" cat ");
        System.out.println(Arrays.toString(catsArray));
        System.out.println("Count of words in cats = " + (catsArray.length-1));
    }
}

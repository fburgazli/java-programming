package office_hours.ArrayPractice_2;

import java.util.Arrays;

public class MultipleWords {
    /*
            Given a String of words that are separate by commas. Find and print any words
        that have more than one word
        Example
        Input: "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge,
        dish washer”
        Output:
        wooden spoons
        trash can
        dish washer
     */
    public static void main(String[] args) {

        String words= "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] arrWords=words.split(", ");
        System.out.println(Arrays.toString(arrWords));
        for (int i = 0; i < arrWords.length; i++) {
            if(arrWords[i].trim().contains(" ")){
                System.out.println(arrWords[i]);
            }

        }

    }
}

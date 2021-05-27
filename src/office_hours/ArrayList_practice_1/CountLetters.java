package office_hours.ArrayList_practice_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountLetters {
    /*
    Given an ArrayList of Strings and a letter (char) print how many times
    the letter is found in the ArrayList elements
    Ex:
    Input:
    ”java”, ”html”, “css”, “java”, “javascript”, “selenium”
    letter: ‘a’
    Output:
    6
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("java","html","css","java","javascript","selenium"));
        countLetters(list,'a');
    }
    public static void countLetters(List<String> list, char target){
        int count =0 ;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                if(list.get(i).charAt(j)==target){
                    count++;
                }
            }

        }
        System.out.println(count);
    }

}

package office_hours.ArrayList_Practice_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseAll {
    /*
    This method will take an ArrayList of Strings and
    reverse each element and return an ArrayList of
    all reversed words
    @param words - Given ArrayList of Strings
    @return - ArrayList of Strings
    Ex:
    Input: {"ted", "talk", "learn"}
    Output: {"det", "klat", "nrael"}
     */
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("ted","talk","learn"));
        System.out.println(reverseAll(words));
    }
    public static List<String> reverseAll(List<String> list){
        List<String> reversed = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String str ="";
            for (int j = list.get(i).length()-1; j>=0 ; j--) {
                str += list.get(i).charAt(j);
            }
            reversed.add(str);
        }
        return reversed;
    }
}

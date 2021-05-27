package office_hours.ArrayList_Practice_2;

import java.util.*;

public class RemoveLongStrings {
    /*
    This method will accept an ArrayList of Strings and an int. Remove any String
        elements that have less characters than the given number. Return the modified
        ArrayList of Strings
        @param list - Given ArrayList of Strings
        @param int - max number of characters
        @return - ArrayList of Strings
        Ex: {“one,”, “two”, “three, “four”, “five”, “six”}
        Max number: 4
        Output: {“three, “four”, “five”
     */
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("one","two","three","four","five","six"));
        System.out.println(removeLongStrings(words,4));
    }
    public static List<String> removeLongStrings(List<String> list, int n){
        list.removeIf(l -> l.length()<n);
        return list;
    }
}

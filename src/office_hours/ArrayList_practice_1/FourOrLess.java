package office_hours.ArrayList_practice_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourOrLess {
    /*
    Given an ArrayList of Strings, go through and read only Strings that are
    4 characters or less. Take those Strings and put them into a different
    ArrayList
    Ex:
    Input:
    “apples”, “tree”, “loop, “cat”, “animal”, “shortcut”
    Output:
    [ tree, loop, cat ]
     */
    public static void main(String[] args) {
        List<String> fruits= new ArrayList<>(Arrays.asList("apples", "tree", "loop", "cat", "animal", "shortcut"));
        List<String > fourOrLess = new ArrayList<>();

        for (int i = 0; i < fruits.size(); i++) {
            if(fruits.get(i).length()<=4){
                fourOrLess.add(fruits.get(i));
            }

        }
        System.out.println(fourOrLess);
    }
}

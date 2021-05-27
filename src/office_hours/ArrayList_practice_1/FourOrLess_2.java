package office_hours.ArrayList_practice_1;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess_2 {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "java", "tree", "cat", "animal", "shortcut"));

        ArrayList<String> list2 = new ArrayList<>();

        for (String each : list) {

            if (each.length() <= 4) {
                list2.add(each);
            }

        }

        System.out.println(list2);
    }
}

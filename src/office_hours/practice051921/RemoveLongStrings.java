package office_hours.practice051921;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveLongStrings {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList(Arrays.asList("one","two","three","four","five","six","seven"));
        System.out.println(removeLongStrings(words,4));
    }

    public static ArrayList<String> removeLongStrings(ArrayList<String> list ,int n){

        list.removeIf(s -> s.length() < n);

        return list;
    }
}

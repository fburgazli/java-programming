package office_hours.practice051121;

import java.util.ArrayList;
import java.util.Arrays;

public class ReplitTask_Nanuk_2 {
    public static void main(String[] args) {
        System.out.println(nanuk(new ArrayList<>(Arrays.asList("1", "2", "3", "5")),0,5));

    }
    public static boolean nanuk(ArrayList<String> r, int way_stones, int boast) {

        int foundFood = 0;

        for (String each : r) {

            if (!each.equals("nanuk")) {
                foundFood += Integer.parseInt(each);
            } else if (each.equals("nanuk")) {
                way_stones--;
            }

        }

        return foundFood >= boast && way_stones>=0;
    }
}

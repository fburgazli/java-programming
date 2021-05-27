package office_hours.practice051121;

import java.util.ArrayList;
import java.util.Arrays;

public class ReplitTask_Nanuk {
    public static void main(String[] args) {
        System.out.println(nanuk(new ArrayList<>(Arrays.asList("1", "2", "3", "5")),0,5));
    }
    public static boolean nanuk(ArrayList<String> r, int way_stones, int boast) {

        int sum = 0;
        int countNanuk = 0;
        for (String each : r) {

            if (!each.equals("nanuk")) {
                sum += Integer.parseInt(each);
            }
            if (each.equals("nanuk")) {
                countNanuk++;
            }

        }
        if (sum >= boast && countNanuk <= way_stones) {
            return true;
        }
        return false;
    }
}

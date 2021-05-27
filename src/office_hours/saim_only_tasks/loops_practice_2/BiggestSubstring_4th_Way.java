package office_hours.saim_only_tasks.loops_practice_2;
import java.util.*;
public class BiggestSubstring_4th_Way {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int n = word.length();
        String x = " ";
        String y = " ";
        String longest = " ";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                x = word.substring(i, n);
                y = word.substring(j, n);
                if (x.length() > y.length()) {
                    longest = x;
                } else {
                    longest = y;
                }
            }
        }
        System.out.println(longest);

    }
}



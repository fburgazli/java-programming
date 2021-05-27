package office_hours.ArrayList_practice_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringNumbersToSum {
    /*
    Given an ArrayList of numbers in String format, add each digit of each
    element and store into a different ArrayList.
    Ex:
    Input:
    “123”, “34”, “513”
    Output:
    [ 6, 7, 9 ]
     */
    public static void main(String[] args) {
        List<String> nums = new ArrayList<>(Arrays.asList("123","34","513"));
        List<Integer> sums= new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            int sum = 0;
            for (int j = 0; j < nums.get(i).length(); j++) {
                sum += Integer.parseInt(nums.get(i).charAt(j)+"");
            }
            sums.add(sum);
        }
        System.out.println(sums);
    }

}

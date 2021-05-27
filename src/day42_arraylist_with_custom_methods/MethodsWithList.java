package day42_arraylist_with_custom_methods;

import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
        printStrList(Arrays.asList("Java", "is", "fun", "today"));
        System.out.println(sumIntegerList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));


    }

    public static void printStrList(List<String> stringList) {
        String str = "";
        for (String each : stringList) {
            str += each + " ";
        }
        System.out.println(str.trim());
    }

    public static int sumIntegerList(List<Integer> nums) {
        int sum = 0;
        for (int each : nums) {
            sum += each;
        }
        return sum;
    }
}

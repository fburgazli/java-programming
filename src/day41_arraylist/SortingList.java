package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<String > cars = new ArrayList<>(Arrays.asList("honda","toyota","nissan"));
        Collections.sort(cars);
        System.out.println(cars);
        List<Integer> nums = new ArrayList<>(Arrays.asList(6,2,11,7,54,4,5,22));
        Collections.sort(nums);
        System.out.println(nums);
    }
}

package day31_arrays;

import java.util.*;


public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums= {100,5,1,0,9,7,2,-4,44};
        System.out.println(Arrays.toString(nums));
        //Arrays.sort() method put the values in order.
        Arrays.sort(nums);
        //Arrays.toString() method helps us to print array values in a single statement
        //without using a loop
        System.out.println(Arrays.toString(nums));

        System.out.println("Min value = " + nums[0]);
        System.out.println("Max value = " + nums[nums.length-1]);

        String[] names ={ "Fikret","Zeliha","Osman","Kudret","Seyma","nur"};//lowercase comes after uppercase!
        Arrays.sort(names);//sort words in alphabetic and ASCII order
        System.out.println(Arrays.toString(names));
        Arrays.sort(names, Collections.reverseOrder());//sort words in reverse order
        System.out.println(Arrays.toString(names));
        Arrays.sort(nums);
        System.out.println(Arrays.binarySearch(nums, 5));


    }
}

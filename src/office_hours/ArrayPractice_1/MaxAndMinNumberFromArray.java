package office_hours.ArrayPractice_1;

import java.util.Arrays;

public class MaxAndMinNumberFromArray {
    /*
    Write a program that can find the maximum number from any given int array
    Write a program that can find the minimum number from any given int array
     */
    public static void main(String[] args) {
        int[] nums= { 1,2055,33,66,777,88,9};

            Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("min =" +nums[0]);
        System.out.println("max ="+ nums[nums.length-1]);


    }
}

package day38_methods;

import java.util.Arrays;

public class ArrayUtils {
    public static void printArray(int[] nums){

        for(int each:nums){
            System.out.print(each+" ");
        }
        System.out.println();

    }
    public static int sum(int[] nums){
        int sum =0;
        for(int each:nums){
            sum += each;
        }
        return sum;
    }
    public static boolean contains(int[] nums , int num){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==num){
                return true;
            }
        }return false;
    }

}

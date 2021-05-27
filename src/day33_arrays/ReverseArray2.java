package day33_arrays;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int[] nums = {5,10,4,100};
        System.out.println("Original array of nums: ");
        System.out.println(Arrays.toString(nums));

        for(int i=0,j=nums.length-1 ; i < nums.length/2 ; i++,j--){
           int temp = nums[i];
           nums[i]=nums[j];
           nums[j]=temp;
        }

        System.out.println("Reverse of nums: ");
        System.out.println(Arrays.toString(nums));

        for(int i=0 ; i < nums.length/2 ; i++){
            int temp = nums[i];
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=temp;
        }
        System.out.println("Reverse of reverse of nums: ");
        System.out.println(Arrays.toString(nums));
    }
}

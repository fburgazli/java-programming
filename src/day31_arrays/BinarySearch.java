package day31_arrays;

import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={23,123,654,1234,14421};
        System.out.println(Arrays.binarySearch(nums, 23));
        System.out.println(Arrays.binarySearch(nums, 123));
        System.out.println(Arrays.binarySearch(nums, 12345));
        if(Arrays.binarySearch(nums,1234)>=0){
            System.out.println("1234 exists in the nums array.");
        }else{
            System.out.println("1234 does not exist in the array");
        }

        int[] nums1 = { 4,12,53};
        int[]  nums2={ 4,12,53};
        System.out.println(Arrays.equals(nums1, nums2));


    }
}

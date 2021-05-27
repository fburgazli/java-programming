package day30_arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] nums = {100,23,453,74,65,36,447,88,9,100};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();

        for (int each:nums) {
            System.out.print(each+ " ");
        }
    }
}

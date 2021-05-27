package office_hours.replit_practice;

import java.util.Arrays;

public class SwitchArrayMethod {
    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5};
        System.out.println(Arrays.toString(do_switch(arr)));

    }
    public static int[] do_switch(int[] nums) {
        int temp=nums[0];
        int[] newNums=new int[nums.length];
        for(int i=1;i<nums.length-1;i++){
            newNums[0]=nums[nums.length-1];
            newNums[i]=nums[i];
            newNums[nums.length-1]=temp;
        }
        return newNums;

    }
}

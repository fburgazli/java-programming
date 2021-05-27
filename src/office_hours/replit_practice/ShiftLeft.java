package office_hours.replit_practice;

import java.util.Arrays;

public class ShiftLeft {
    public static void main(String[] args) {
        int[] nums = {2, 5, 3, 6};

        //WRITE YOUR CODE HERE
        int temp=nums[0];
        int[] newNums= new int[nums.length];
        for(int i=0;i<nums.length-1;i++){
            newNums[i]=nums[i+1];
            newNums[nums.length-1]=temp;
        }
        System.out.println(Arrays.toString(newNums));
    }
}

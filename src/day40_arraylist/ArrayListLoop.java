package day40_arraylist;

import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(); //polymorphic way of declaring
        System.out.println(nums);
        System.out.println(nums.size());

        nums.add(34);
        nums.add(5);
        nums.add(100);
        nums.add(47);
        nums.add(511);
        nums.add(47);
        System.out.println(nums);
        nums.remove(0);
        System.out.println(nums);
        //nums.remove(47); //index 47 IndexOutOfBoundsException
        nums.remove(new Integer(47));//removes the first one
        System.out.println(nums);
        // for loop - iterate through all values and print
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i)+" ");
        }
        System.out.println();
        // for each loop and print all in same line
        for(int each:nums){
            System.out.print(each+" ");
        }
        System.out.println();



    }
}

package day43_list_custom_classes;

import java.util.*;

public class MethodsWithListReturn {
    public static void main(String[] args) {
        //1 second =1_000_000_000 nanosecond.
        long start = System.nanoTime();
        List<Integer> mlnNums= getIntegerList();
        long end = System.nanoTime();
        System.out.println("ArrayList Time = " + (end-start));
       // System.out.println(mlnNums);

        long startArray = System.nanoTime();
        int[] arr = getIntArray();
        long endArray = System.nanoTime();
        System.out.println("Array Time = " + (endArray-startArray));
        // System.out.println(Arrays.toString(getIntArray()));
    }
    public static List<Integer> getIntegerList(){
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= 1_000_000; i++) {
            nums.add(i);
        }
        return nums;
    }
    public static int[] getIntArray(){
        int[] nums= new int[1_000_001];
        for (int i = 0; i <=1_000_000; i++) {
            nums[i]=i;
        }
        return nums;
    }
}

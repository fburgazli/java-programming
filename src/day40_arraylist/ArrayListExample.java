package day40_arraylist;
import java.util.*;
//import java.util.ArrayList;
//import java.util.List;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(9);
        nums.add(100);
        //nums.add("java"); ERROR
        System.out.println(nums);
        System.out.println(nums.size());
        //reading from arraylist
        System.out.println("index 0 = " + nums.get(0));
        System.out.println("index 1 = " + nums.get(1));
        System.out.println("index 2 = " + nums.get(2));
        //System.out.println("index 3 = " + nums.get(3)); IndexOutOfBoundsException

        nums.remove(1); //removes element at index
        System.out.println(nums);

    }
}

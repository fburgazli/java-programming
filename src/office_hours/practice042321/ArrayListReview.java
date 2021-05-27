package office_hours.practice042321;

import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(67);
        nums.add(98);
        nums.add(7);
        System.out.println(nums.size());
        System.out.println("nums.get(3) = " + nums.get(3));
        
        nums.remove(0);
        System.out.println("nums = " + nums);
        nums.remove(new Integer(98));
        System.out.println("nums = " + nums);

    }
    
}

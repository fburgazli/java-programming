package office_hours.practice052521;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicates {
    /*
   input: {1,3,5,1,4,5,9}
    output: {3,4,9}
     */
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,3,5,1,4,5,9));
        System.out.println(removeDuplicate(nums));
        System.out.println(removeDuplicate2(nums));
    }

    public static List<Integer> removeDuplicate(List<Integer> nums){
        List<Integer> uniques = new ArrayList<>();
        String checked ="";
        for (int i = 0; i < nums.size(); i++) {
            int count =0;
            if(!checked.contains(nums.get(i)+"")) {

                for (int j = 0; j < nums.size(); j++) {
                    if (nums.get(i) == nums.get(j)) {
                        count++;
                    }
                }
            }
            if(count==1){
                uniques.add(nums.get(i));
            }
            checked += nums.get(i)+" ";
        }
        return uniques;
    }

    // remove duplicate by using lambda and Collections
    public static List<Integer> removeDuplicate2(List<Integer> nums) {

        nums.removeIf(n -> Collections.frequency(nums,n)>1);
        return nums;
    }
}

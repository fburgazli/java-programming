package office_hours.ArrayList_Practice_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    /*
    Remove Duplicates
    This method will take an ArrayList of numbers and remove any duplicates values.
    The method will return an ArrayList of unique elements.
    @param nums - The given ArrayList of numbers
    @return - ArrayList of numbers
    Ex:
    Input: {1, 3, 5, 1, 4, 5, 9};
    Output: {3, 4, 9};
     */
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(Arrays.asList(1,3,5,1,4,5,9));
        System.out.println(removeDuplicates(ints));

    }
    public static List<Integer> removeDuplicates(List<Integer> nums){

        nums.removeIf(n -> nums.indexOf(n)!=nums.lastIndexOf(n));
        return nums;
    }
}

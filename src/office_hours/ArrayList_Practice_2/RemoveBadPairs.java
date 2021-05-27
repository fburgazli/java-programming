package office_hours.ArrayList_Practice_2;

import java.util.*;

public class RemoveBadPairs {
    /*
    This method will accept an Integer java.util.ArrayList and check for bad
    pairs. A pair is an element and the element next to it.
    A bad pair is whenever the first number in the pair is bigger then
    the
    second number. Remove any bad pairs for the ArrayList and return
    the
    ArrayList with no bad pairs
    Note: The given ArrayList will always be an even amount of
    numbers so each number always has one pair
    @param nums - Given ArrayList of numbers
    @return - ArrayList of numbers
    Ex:
    Input: {3, 4, 6, 1, 1, 10, 8, 7};
    Output: {3, 4, 1, 10};
    Bad pairs that were removed:
    6, 1
    8, 7
    */
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(Arrays.asList(3, 4, 6, 1, 1, 10, 8, 7));
        System.out.println(removeBadPairs(ints));
    }
    public static List<Integer> removeBadPairs(List<Integer> nums){
        List<Integer> goodPairs = new ArrayList<>();
        for (int i = 0; i < nums.size()-1; i+=2) {
            if(nums.get(i)<nums.get(i+1)){
                goodPairs.add(nums.get(i));
                goodPairs.add(nums.get(i+1));

            }
        }
        return goodPairs;
    }

}

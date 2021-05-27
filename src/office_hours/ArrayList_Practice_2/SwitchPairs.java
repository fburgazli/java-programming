package office_hours.ArrayList_Practice_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwitchPairs {
    /*
        This method will take an ArrayList of words and switch position for
    each pair in the List. A pair is an element and the element next to
    it.
    The given ArrayList will always have an even number of elements
    so each element
    will always have a single pair.
    @param words - Given ArrayList of Strings
    @return - ArrayList of Strings
    Ex:
    Input: {"Cat", "in", "the", "hat"}
    There is two pairs: "Cat" and "in"
    "the" and "hat"
    Output: {"in", "Cat", "hat", "the}
     */
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("Cat","in","the","hat"));
        System.out.println(switchPairs(words));
    }
    public static List<String> switchPairs(List<String> list){
        String temp ="";
        List<String> switched =new ArrayList<>();
        for (int i = 0; i < list.size()-1; i+=2) {
            temp = list.get(i);
            switched.add(i,list.get(i+1));
            switched.add(i+1,temp);
        }
        return switched;


    }
}


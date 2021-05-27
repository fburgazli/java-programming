package office_hours.ArrayList_practice_1;

import java.util.*;

public class TargetWord {
    /*
    Given an ArrayList of Strings and a target word (String) print how many
    times the target word is in the ArrayList
    Ex:
    Input:
    ”java”, ”html”, “css”, “java”, “javascript”, “selenium”
    Target: java
    Output:
    2
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("java","html","css","java","javascript","selenium"));
        targetWord(list,"java");
    }
    public static void targetWord(List<String> list, String target){
        int count =0 ;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(target)){
                count++;
            }
        }
        System.out.println(count);
    }
}

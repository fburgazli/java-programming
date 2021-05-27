package day43_list_custom_classes;

import java.util.*;

public class ListMethods {
    public static void main(String[] args) {
       System.out.println(getDays().get(1));
       System.out.println(getDays().size());

        List<String> dayNames = getDays();
        System.out.println(dayNames);
        dayNames.removeIf(day -> day.length()>6);
        System.out.println(dayNames);

        System.out.println(getRandomList(10));
        List<Integer> nums= getRandomList(100);
        System.out.println(nums);
        nums.removeIf(n -> n <90); // removes elements which is less than 90
        System.out.println(nums);
    }
    public static List<String> getDays(){
        List<String> days = new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));

        return days;
    }
    public static List<Integer> getRandomList(int size){
        Random random =new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }

        return list;
    }
}

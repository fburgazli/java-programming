package office_hours.practice050521;

import java.util.ArrayList;
import java.util.Arrays;

public class kahoot {
    public static void main(String[] args) {
        ArrayList<Integer> group = new ArrayList<>();
        Integer a =8;
        group.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(group);
        System.out.println(group.remove(a));
        System.out.println(group);
    }
}

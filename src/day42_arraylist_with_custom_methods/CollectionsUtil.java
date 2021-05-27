package day42_arraylist_with_custom_methods;
import java.util.*;
public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j','a','v','a','i','s','f','u','n'));
        System.out.println("size = " + letters.size());
        System.out.println(letters);
        Collections.reverse(letters);
        System.out.println("reversed = "+ letters);

        System.out.println("aCount = " + Collections.frequency(letters, 'a'));//how many times 'a' showed in letters array list.
        int vCount = Collections.frequency(letters,'v');
        System.out.println("vCount = " + vCount);

        System.out.println("Max char =" + Collections.max(letters));
        System.out.println("Min char =" + Collections.min(letters));

        Collections.reverse(letters);
        Collections.replaceAll(letters, 'a', 'x');
        Collections.replaceAll(letters,'i','z');
        System.out.println(letters);

        Collections.sort(letters);
        System.out.println("sorted = " + letters);

        List<Integer> nums = Arrays.asList(23,1,7,43,7,5,234,7,-9,0,7);
        System.out.println(nums);
        System.out.println("min = " + Collections.min(nums));
        System.out.println("max = " + Collections.max(nums));

        Collections.sort(nums);
        System.out.println("sorted = " + nums);

        Collections.reverse(nums);
        System.out.println(nums);

        System.out.println("count 7 = "+Collections.frequency(nums, 7));

       Collections.replaceAll(nums, 7, 44);
        System.out.println(nums);
        Collections.sort(nums,Collections.reverseOrder());
        System.out.println(nums);

        Collections.shuffle(nums);
        System.out.println(nums);


    }
}

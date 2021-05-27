package day38_methods;
//import static day38_methods.ArrayUtils.*;
public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6,7,8,9};
        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int[]{10,11,12,13,14,15});
        System.out.println("sum of array = " + ArrayUtils.sum(nums));
        System.out.println("sum of array = " + ArrayUtils.sum(new int[]{10,11,12,13,14,15}));
        System.out.println("nums contains(11) = "+ArrayUtils.contains(nums, 11));

    }
}

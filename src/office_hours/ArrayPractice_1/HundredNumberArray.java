package office_hours.ArrayPractice_1;

public class HundredNumberArray {
    /*
        1. Create an int array called numbers that has length of 100
        2. Assign 1-100 to each index of the array. Then use a for each loop to print out all the elements of the array
     */
    public static void main(String[] args) {
        int[] nums = new int[100];
        for (int i = 0; i < 100; i++) {
            nums[i] = i + 1;
            //System.out.print(nums[i]+" ");
        }
        for (int each : nums) {
            System.out.print(each + " ");
        }


    }
}

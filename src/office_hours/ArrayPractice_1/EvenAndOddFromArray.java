package office_hours.ArrayPractice_1;

public class EvenAndOddFromArray {
    /*
        Write a program that can count the even and odd number from an array of integers
    Use for each to make it easier
    Ex:
    Input: [4,1,3,12,5]
    Output: Even: 2
    Odd: 3
     */
    public static void main(String[] args) {
        int[] nums={4,1,3,12,5};
        int even=0;
        int odd=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("odd = " + odd);
        System.out.println("even = " + even);
    }
}

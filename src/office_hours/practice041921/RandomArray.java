package office_hours.practice041921;

import java.util.*;

public class RandomArray {
    /*
            Challenge: Random Array
        1) Ask the user to enter how many numbers they want in their array
        2) Ask the user the max number they want for the random numbers – Use this as the bound for your random number
        3) Create an int array with random numbers. The number of elements is based on the given number
        Flow:
        How many numbers do you want: 5
        What is the max number value: 50
        -> Print the array with 5 random numbers from 0 to 50
     */
    public static int[] getRandomArray(int size, int max){

        int[] array= new int [size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i]=random.nextInt(max+1);
        }
        return array;

    }

    public static void main(String[] args) {
        int[] a = getRandomArray(5,50);
        System.out.println(Arrays.toString(a));
    }
}

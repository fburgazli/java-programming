package day29_nested_loops_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        // first way to show an array:if you know how many numbers you need but don't have the values yet.
        int[] nums = new int[3];
        nums[0] = 5;
        nums[1] = 7;
        nums[2] = 10;
        //nums[3] = 9 ; will give error because the size is not matching.
        //print values of array
        System.out.println(nums); // prints hashcode<[I@29453f44> not the elements
        System.out.println("number of elements = "+ nums.length);
        System.out.println("elements of nums :" );
        for (int each:nums){
            System.out.print(each+ " ");
        }
        System.out.println();

        nums[0] = 500;
        nums[1] = 1000;
        nums[2] = 700;
        System.out.println("elements after re-assigning :");

        for (int each:nums){
            System.out.print(each+ " ");
        }
        System.out.println();

        //Second way to show an array : if you know size and have the values this is the best.
        int[] array = {324,517,856,125,975,369,456};
        System.out.println("The length of the array = " + array.length);
        for (int each: array){
            System.out.print(each +" ");
        }

        //Third way: mix of previous two.
        int[] arrayTwo = new int[]{1,2,3,4,5,6};

        //for int array, default value is 0,
        //for double array, default is 0.0
        //for string array, default is null
        int[] numsA = new int[2]; // {0,0} will be assigned as default.

        // declare arrays by using shortcut:
        int[] counters =  {1,2,3,4,5};
        double[] prices = {1.99,2.55,3.75};
        String[] cities = {"Greer","Greenville","Spartanburg","Charleston"};








    }
}

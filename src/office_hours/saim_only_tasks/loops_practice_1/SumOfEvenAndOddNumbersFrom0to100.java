package office_hours.saim_only_tasks.loops_practice_1;

public class SumOfEvenAndOddNumbersFrom0to100 {
    public static void main(String[] args) {
        /*
        Write a program that can calculate the sum of all the even numbers between 1 ~ 100
•       Write a program that can calculate the sum of all the odd numbers between 1 ~ 100
         */

        int n = 0;
        int sumEven = 0;
        while(n <= 100){
            sumEven += n;
            n += 2;
        }
        System.out.println("Sum of even numbers from 0-100 = "+ sumEven);

        int n2 =1;
        int sumOdd =0;
        while(n2 <= 100){
            sumOdd += n2;
            n2 += 2;
        }
        System.out.println("Sum of odd numbers from 0-100 = "+ sumOdd);


    }
}

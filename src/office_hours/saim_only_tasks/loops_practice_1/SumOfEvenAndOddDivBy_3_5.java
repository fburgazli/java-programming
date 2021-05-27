package office_hours.saim_only_tasks.loops_practice_1;

public class SumOfEvenAndOddDivBy_3_5 {
    /*
    Write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
•   Write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5
     */
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        while(n <=100) {
            if (n % 3 == 0 && n % 5 == 0) {
                sum += n;
            } n += 2;
        }

        System.out.println("Sum of even numbers from 0 to 100 divisible by 3 and 5 = " + sum);

            int a = 1;
            int total = 0;
            while(a <=100){
                if(a % 3 == 0 && a % 5 ==0){
                    total += a;

                } a += 2;

            }
        System.out.println("Sum of odd numbers from 0 to 100 divisible by 3 and 5 = " + sum);
    }
}

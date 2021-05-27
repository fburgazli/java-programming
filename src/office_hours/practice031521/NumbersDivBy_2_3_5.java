package office_hours.practice031521;

public class NumbersDivBy_2_3_5 {
    public static void main(String[] args) {
        int num = 65;
        boolean by2 = num % 2 == 0;
        boolean by3 = num % 3 == 0;
        boolean by5 = num % 5 == 0;

        System.out.println("Divisible by2 = " + by2);
        System.out.println("by3 = " + by3);
        System.out.println("by5 = " + by5);
    }
}
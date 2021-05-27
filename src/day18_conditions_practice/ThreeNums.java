package day18_conditions_practice;

public class ThreeNums {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 100;
        int num3 = 100;
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(" Largest value: " + num1);
        } else if ( num2 >= num1 && num2 >= num3) {
            System.out.println("Largest value: " + num2);

        } else {
            System.out.println("Largest value : " + num3);
        }
    }
}

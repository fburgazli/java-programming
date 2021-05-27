package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(3.55, 2.33));
        System.out.println(minus(5.44, 3));
        System.out.println(multiply(5.76, 66));
        System.out.println(divide(100, 4.5));
    }

    public static double divide(double a,double b) {
        return a/b;
    }

    public static double multiply(double a, double b) {
        return a*b;
    }

    public static double minus(double a , double b) {
        return a-b;
    }
    public static double add(double a,double b) {
        return a+b;
    }
}

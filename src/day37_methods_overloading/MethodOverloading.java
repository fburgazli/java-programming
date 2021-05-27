package day37_methods_overloading;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(5, 7));
        System.out.println(sum(5.3, 7.2));
        System.out.println(sum(5, 7 , 8));
        System.out.println(sum("Cyber" , "Tek"));

    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static double sum(double a, double b){
        return a+b;

    }
    public static int sum(int a, int b, int c){
        return a+b+c;

    }
    public static String sum(String  a, String b){
        return a+b;

    }
}

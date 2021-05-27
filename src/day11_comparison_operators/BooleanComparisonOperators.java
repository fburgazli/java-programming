package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {

        System.out.println(3 == 3); //true
        System.out.println(10 > 7); //true
        System.out.println(985.44 < 9857.89); //true
        System.out.println(10 <= 11); //true
        System.out.println(5>=3); //true
        System.out.println(-100 != 44); //true (is not equal )

        int a = 100;
        int b = 200;
        System.out.println(a == b); //false
        System.out.println(a > b);  //false
        System.out.println(a < b);  //true
        System.out.println(a >= b); //false
        System.out.println(a <= b); //true
        System.out.println(a != b); //true

        boolean result = 5 == 5;
        System.out.println("result = " + result); //true

        result = 33 > 44;
        System.out.println("result = " + result); //false

        result = 88 < 99;
        System.out.println("result = " + result); // true

        result = 10 >= 10;
        System.out.println("result = " + result); //true

        result = 123 <= 124;
        System.out.println("result = " + result);//true

        result = 2 != 2;
        System.out.println("result = " + result); //false

        String city = "Seattle";
        System.out.println(city == "Seattle");//true
        System.out.println(city == "Baku"); //false
        System.out.println(city != "Fairfax"); //true

        String name = "Nadir";
        boolean checkName = name == "Nadir";
        System.out.println("checkName = " + checkName); //true

        checkName = name != "Kuzzat";
        System.out.println("checkName = " + checkName);//true




    }
}

package day07_arithmetic_operators_casting;

public class StringConcat {
    public static void main(String[] args) {
        System.out.println("Java" + 5 + 3);
        System.out.println("Java" + (5 + 3));
        System.out.println(5 + 3 + "Java");
        System.out.println("Hello" + 1 + 2 +3);
        System.out.println("Hello" + (1 + 2 +3));

        String str1 = "Hello";
        String str2 = "friends!";
        System.out.println(str1 + " " + str2);

        int num1 = 7;
        int num2 = 8;
        System.out.println(num1 + num2);
        System.out.println(num1 + " " + num2);
        System.out.println(num1 + "" + num2);

        char ch1 = 'a'; //ascii 97
        char ch2 = 'b'; //ascii 98
        System.out.println(ch1 + ch2); // prints 195
        System.out.println("" + ch1 +ch2);



    }
}

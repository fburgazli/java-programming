package day37_methods_overloading;

import java.util.Arrays;

public class MainMethodOverload {
    public static void main(String[] args) {

        System.out.println("Hello from the real main method");
        main("Hello", 5);


    }
// overloading main method is possible with different parameter but JDK does not look for this one to run,
    public static void main(String str, int a) {
        System.out.println(str+a+a+a);
    }
}

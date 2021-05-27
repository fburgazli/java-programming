package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers();
        addNumbers(4,9);
        addNumbers(4,7,9,10,14,55);
       /// int... nums = {3,5,7} does not work,it can be used as only method parameters.

    }
    public static void addNumbers(int... nums){
        int sum=0;
        for(int n:nums){
            sum += n;
        }
        System.out.println("sum = " + sum);
    }
    public static void addNames(String... names){

    }
}

package day35_methods_with_parameters;

public class CountMethod {
    public static void main(String[] args) {
        count(8);

    }

    public static void count(int n) {

        for (int i = 0; i <= n; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

    }
}

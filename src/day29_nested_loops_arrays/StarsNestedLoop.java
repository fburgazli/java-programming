package day29_nested_loops_arrays;

public class StarsNestedLoop {
    public static void main(String[] args) {

        for (int i = 1; i < 10 ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i = 1; i < 10 ; i++) {
            for (int j = 0; j < 10 ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        for (int i = 10 ; i > 0 ; i--) {
            for (int j = 0; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        for (int i = 0; i < 10 ; i++) {
            for (int j = 10; j >=i ; j--) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}

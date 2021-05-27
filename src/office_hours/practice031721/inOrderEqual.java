package office_hours.practice031721;

public class inOrderEqual {

    public static void main(String[] args) {
        int a = 9;
        int b = 5;
        int c = 4;
        boolean equalOk = a == b || a == c || b == c;

        if (equalOk) {
            if (a <= b && b <= c) {
                System.out.println(true);
                System.out.println("a = " + a);
                System.out.println("b  = " + b);
                System.out.println("c = " + c);
            } else {
                System.out.println(false);
                System.out.println("a = " + a);
                System.out.println("b  = " + b);
                System.out.println("c = " + c);
            }


        } else {
            if (a < b && b < c) {
                System.out.println(true);
                System.out.println("a = " + a);
                System.out.println("b  = " + b);
                System.out.println("c = " + c);
            } else {
                System.out.println(false);
                System.out.println("a = " + a);
                System.out.println("b  = " + b);
                System.out.println("c = " + c);
            }
        }

    }
}
package office_hours.practice032221;

public class OperatorsExample {
    public static void main(String[] args) {


        int a = 3, b = 2;
        long c = (a-- + b) * 2 / 3 % 2;
        //        (3   + 2 ) *2 /3 %2 =1

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}

package day07_arithmetic_operators_casting;

public class PrimitiveCasting {
    public static void main(String[] args) {

        int n1 = 4;
        byte b1 = (byte) n1; //explicit casting
        System.out.println(b1);

        byte b2 = 55;
        int n2 = b2; //implicit casting or autocasting
        System.out.println(n2);
        int num1 = 100;
        short shNum1= (short)num1;
        long lNum1 = num1;
        System.out.println(shNum1);
        System.out.println(lNum1);

    }
}

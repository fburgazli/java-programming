package day11_comparison_operators;

public class PrePostIncrementDecrement {
    public static void main(String[] args) {


        int num1 = 10;
        //++num1;
        //int num2 =num1;
        int num2 = ++num1; //pre-increment
        System.out.println(num1); //11
        System.out.println(num2); //11

        int num3 = 30;
        int num4 =num3++;//post-increment
        //int num4 = num3;
        //num3++;
        System.out.println(num3); //31
        System.out.println(num4);//30

        int num5 = 50;
        int num6=--num5;
        System.out.println(num5); //49
        System.out.println(num6); //49

        int num7 = 70;
        int num8 =num7--;
        System.out.println(num7); //69
        System.out.println(num8); //70

        int num9= 90;
        System.out.println(++num9); //91
        int num10 =100;
        System.out.println(num10++); //100

        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println(a); //51
        System.out.println(b); //23
        System.out.println(c); //73



    }
}

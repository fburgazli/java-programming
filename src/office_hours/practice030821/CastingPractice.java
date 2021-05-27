package office_hours.practice030821;

public class CastingPractice {
    /*
    by default whole numbers will be read as int data type
    decimal numbers will be read as double data type
     */
    public static void main(String[] args) {

        //byte short int long float double
        byte b = 10;
        short s = b;
        byte b2 =(byte)s;

        double d = 5.3;
        int i =(int) d;
        int i2 = (short)d;
        System.out.println(i); //5
        System.out.println((double)i); //5.0

        float f= 3.54F;
        float f2 =(float)3.54;

        long l =22313;
        long l2 = 3123123123123123L;
        //long l3 =(long)31231231232112525222255555511; it is not working because the number is too big can't even get for casting


        double million =1_000_000;
        System.out.println(million);





    }
}

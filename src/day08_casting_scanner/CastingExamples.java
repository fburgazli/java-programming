package day08_casting_scanner;

public class CastingExamples {
    public static void main(String[] args) {
        //implicit casting= auto-widening
        byte bnum = 100;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;
        float fnum = lnum;
        double dnum =fnum;

        System.out.println(bnum);
        System.out.println(snum);
        System.out.println(inum);
        System.out.println(lnum);
        System.out.println(fnum);
        System.out.println(dnum);

        //explicit casting
        int n1 = 55 ;
        byte n2 = (byte) n1 ;

        long n3 = 44444L;
        int n4 = (int) n3;

        System.out.println("n2 = " + n2);
        System.out.println("n4 = " + n4);

        double n5 =55.3;
        float n6 = (float)n5;
        System.out.println("n6 = " + n6);
         int n7 =(int)n5;
        System.out.println("n7 = " + n7);

        int n8 = 300 ;
        byte n9 = (byte)n8;
        System.out.println("n8 = " + n8);
        System.out.println("n9 = " + n9);
        
        char ch ='F';
        int n10 = (int)ch;
        System.out.println("n10 = " + n10);

        int n11= 70;
        char ch2 = (char)n11;
        System.out.println("ch2 = " + ch2);

//        String  str = "123";
//        int n12 = (int)str;
//        System.out.println("n12 = " + n12); String cannot be converted to int












    }
}

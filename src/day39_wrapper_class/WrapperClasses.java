package day39_wrapper_class;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.concurrent.Callable;

public class WrapperClasses {
    /*
       byte > Byte
       short > Short
       int > Integer
       long > Long
       float> Float
       double > Double
       boolean > Boolean
       char > Character
        */
    public static void main(String[] args) {
       int num = 100;
        System.out.println("num = " + num);

       Integer n = new Integer(500);
        System.out.println("n is 500? =" + n.equals(500));
        System.out.println(n + 300);

        Integer intObject = 1000;
        System.out.println(intObject/50);
        String intStr = intObject.toString();
        System.out.println(intStr);

        Byte b1 = new Byte((byte)5);
        Byte b2 = 10;
        Short s1 = new Short((short)40);
        Short s2 = 50;
        Integer i1= new Integer(100);
        Integer i2 = 200;
        Long l1 = new Long(300L);
        Long l2 = 3455L;
        Float f1 = new Float(5.2F);
        Float f2 = 7.5F;
        Double d1 = new Double(9.77);
        Double d2 = 345.4;

        Character c1 = new Character('g');
        Character c2 = 'f';
        Boolean bl1 = new Boolean(true);
        Boolean bl2 = false;

    }
}

package day05_primitivies_concatenation;

public class PrimitivesExample {
    /*
    Primitive Data Types:
    Number: byte,short,int,long ( add L at the end for long data type)
    Floating-point/Decimal: float( add F at the end for long data type), double
    Single Character: char
    Boolean: boolean
    Non-primitives/object type/class type:
    String, Scanner, System , Random, etc. You can also create non-primitive data types.
     */
    public static void main(String[] args) {
        byte  byteValue = 123 ;
        short shortValue = 12345;
        int intValue = 1234567890;
        long longValue = 1234567890123456789L;
        float floatValue = 0.123456789F;
        double doubleValue = 12345678901234567890123456.789; // 0.123D is also valid (D for double at the end)
        char charValue = 'f'; // '2' ,'$' , '%' , '_' , etc.
        boolean booleanValue = true; // or false

        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(charValue);
        System.out.println(booleanValue);

        //ASCII table can be used to lookup number values for characters
        // F = 70 , i = 105 , k = 107 , r = 114 , e = 101 , t = 116

        String stringValue = "Hello world!";
        System.out.println(stringValue);


    }
}

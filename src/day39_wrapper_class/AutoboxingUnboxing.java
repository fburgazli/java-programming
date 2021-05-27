package day39_wrapper_class;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        //auto-boxing : primitive > object
        int num1 = 500;
        Integer num2 = num1;
        Integer num3 = 235;

        // unboxing : object > primitive
        Double d1 =new Double(4.5);
        double d2 = d1;
       double d3 = new Double(7.9);
        System.out.println("d3 = " + d3);

        char letter1 = 'j';
        Character letter2 = letter1;

    }
}

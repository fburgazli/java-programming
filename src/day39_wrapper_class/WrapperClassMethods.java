package day39_wrapper_class;

public class WrapperClassMethods {
    public static void main(String[] args) {

        System.out.println(Integer.max(90,50));
        System.out.println(Integer.sum(50,35));
        System.out.println(Integer.min(5,2));
        System.out.println("Max int value = "+Integer.MAX_VALUE);
        System.out.println("Min int value = "+Integer.MIN_VALUE);
        System.out.println(Double.max(23.4,65.7));
        System.out.println("Max double value= "+ Double.MAX_VALUE);
        System.out.println("Min double value = "+Double.MIN_VALUE);
        System.out.println(Double.compare(5,1));
        System.out.println(Double.compare(5,5));
        System.out.println(Double.compare(1,5));
        System.out.println(Character.isDigit('7'));
        System.out.println(Character.isAlphabetic('T'));
        System.out.println(Character.isLetter('f'));

        char letter ='A';
        if(Character.isUpperCase(letter)){
            System.out.println("YES!");
        }
        String word ="JaVa iS FuN";
        for (int i = 0; i < word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i)+" ");
            }
        }
        System.out.println();
        System.out.println(Character.MIN_VALUE);




    }
}

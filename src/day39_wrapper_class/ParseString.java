package day39_wrapper_class;

public class ParseString {
    public static void main(String[] args) {
        System.out.println(Integer.valueOf("12"));
        int count = Integer.parseInt("456");
        System.out.println("count = " + count);
        String priceStr ="123.99";
        double price = Double.parseDouble(priceStr);
        if(price>100){
            System.out.println("expensive");
        }

        String sentence = "We wrote 240 lines of code";
        String[] words = sentence.split(" ");
        int linesOfCode = Integer.parseInt(words[2]);
        System.out.println(linesOfCode);



    }
}

package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {


        String list = "cat,java, selenium,black cat,red car";

        for (int i = 0; i < list.length()-2; i++) {
            String part =list.substring(i,i+3);
            if(part.equals("car") || part.equals("cat"));
            System.out.println("cat or car found");

        }
    }
}

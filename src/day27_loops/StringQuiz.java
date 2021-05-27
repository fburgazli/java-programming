package day27_loops;

public class StringQuiz {
    public static void main(String[] args) {
        String a = "A";
       a = a +"B";
        String b = "C";
        a = a + b;
        a.replace('C','D');
        System.out.println(a);

    }
}

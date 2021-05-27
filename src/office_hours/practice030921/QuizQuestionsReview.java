package office_hours.practice030921;

public class QuizQuestionsReview {
    public static void main(String[] args) {
        long a = 30L;
        long b = (short)a;
        System.out.println("b = " + b); //30

        float a1 = 100.987_6543f;
        short b1 = (byte) a1;
        byte c1 =(byte) b1;
        System.out.println("c1 = " + c1);

        long a2 = 3_000L;
        double b2 = (float)a2;
        System.out.println("b2 = " + b2);

        int i = 100;
        double d = 123;
        float f= 300;
        //i = f;
        f = i;
        d = f;
        //f = d;
        d = i;
        //i = d;

    }
}

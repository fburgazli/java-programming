package office_hours.practice031521;

public class OperatorAnalyze {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + a-- + a*2 + a+ ++a;
        //      5   + 6    + 5*2 + 5 + 6 =32
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        int n = 200;
        int m= -n++ + - --n * n-- %2 + n;
        //     -200 + - 200 * 200 %2 + 199 = -1
        System.out.println("n = " + n);
        System.out.println("m = " + m);

        int k = 10;
        int l = k - 5 *2 + k/2;
            // 10 -10 + 5
 
    }
}

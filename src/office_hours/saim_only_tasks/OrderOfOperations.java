package office_hours.saim_only_tasks;

public class OrderOfOperations {
    public static void main(String[] args) {


        int a = 3 ; // 2
        int b = 2; //2
        long c = (a-- + b) * 2 / 3 % 2;
        //     = ( 3 + 2) * 2    / 3 % 2
        //       = 10 /3 % 2 = 3 % 2 = 1
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        int numOne = 10; //11 //12 //13
        int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;
        //          =  10   * 3 +  12 + 12 % 2
        //          =  30 + 12 + 0 = 42
        int biggest = numOne > numTwo ? numOne : numTwo;

        System.out.println("numOne = " + numOne); // 13
        System.out.println("numTwo = " + numTwo); // 42
        System.out.println("biggest = " + biggest); // 42
    }
}

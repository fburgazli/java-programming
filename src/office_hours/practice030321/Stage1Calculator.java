package office_hours.practice030321;

public class Stage1Calculator {
    /*
    Make a class Stage1Calculator
create a main method

    - Declare two double variables
    - Declare 5 more double variables for each operation.
        > Execute all the operation between the first two numbers
    - Print out operations
        Ex: if the nums are 5 and 10
            5 + 10 = 15
            5 - 10 = -5
            etc..
     */
    public static void main(String[] args) {
        double n1 = 5.0 ,
                n2 = 10.0 ;
        double sum = n1 + n2 ,
                subtraction = n1 - n2 ,
                product = n1 * n2 ,
                division = n1 / n2 ,
                remainder = n1 % n2;

        System.out.println("Calculations for " + n1 + " & " + n2 );
        System.out.println(n1 + " + " + n2 + " = " +sum);
        System.out.println(n1 + " - " + n2 + " = " + subtraction);
        System.out.println(n1 + " * " + n2 + " = " + product);
        System.out.println(n1 + " / " + n2 + " = " + division);
        System.out.println(n1 + " % " + n2 + " = " + remainder);

    }
}

package day33_arrays;

public class ForLoopWithTwoVariables {
    public static void main(String[] args) {
        for (int i=1 , j=1 ; i<5 ; i++,j++){
            System.out.println("i = " + i +", j = "+j);
        }
        System.out.println("*****************************");
        for (int i = 1, j =5 ; j>=0 ; i++,j--) {
            System.out.println("i = " + i +", j = "+j);

        }
    }
}

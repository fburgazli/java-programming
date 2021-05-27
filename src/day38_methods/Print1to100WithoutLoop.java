package day38_methods;

public class Print1to100WithoutLoop {

    public static void main(String[] args) {
        printNums(1);
        }
        //This is called recursion(recursive method) which means method calls itself inside the method again.
        // not encouraged ,instead of recursion use for loop.
        public static void printNums(int num){
            System.out.print(num+" ");
            num++;
            if(num<=100){
                printNums(num);
            }
    }
}

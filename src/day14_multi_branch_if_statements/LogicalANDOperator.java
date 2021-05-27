package day14_multi_branch_if_statements;

public class LogicalANDOperator {
    public static void main(String[] args) {
        System.out.println(true && true); //true
        System.out.println(true && false); //false
        System.out.println(false && true); //false
        System.out.println(false && false); //false

        System.out.println(10>5 && 1==1); //true
        System.out.println(2<7 && 5<5);

    }
}

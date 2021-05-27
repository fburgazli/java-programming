package day12_conditional_statement;

public class IfElseStatement {
    public static void main(String[] args) {

        if(10>5){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        int count =25;

        if(count > 30){
            System.out.println("Count is more than 30");
        } else {
            System.out.println("Count is less than 30");
        }

        int age = 14;

        if(age >=18){
            System.out.println("Eligible to vote");
            System.out.println("Age is greatero equa; to 18");

        } else {
            System.out.println("Not eligible to vote");
            System.out.println("Age is less than 18");
        }


    }
}

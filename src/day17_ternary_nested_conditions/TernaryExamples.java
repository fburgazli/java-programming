package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {

        int score = 80;
        String result;

        if(score>60){
            result = "Pass";
        } else {
            result = "Fail";
        }
        System.out.println("if result = " + result);

        //Ternary
        result =(score>60) ? "pass" : "fail";
        System.out.println("Ternary result = " +result);

        String quality = "good";
        System.out.println(quality.equals("good")? 5 : 0);
        int rating = quality.equals("good") ? 5 : 1;
        System.out.println("rating: " +rating);

        char grade = (score>90) ? 'A' : 'B' ;
        System.out.println(grade);

        String evenOdd = (score % 2== 0) ? "even" : "odd";
        System.out.println(evenOdd);

        int num1 = 10;
        int num2 = 30;
        int max = num1 > num2 ? num1 : num2;
        System.out.println("max = " + max);

    }
}

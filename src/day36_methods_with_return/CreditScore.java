package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(640);
        checkEligible(760);
        checkEligible(555);
        //System.out.println(checkEligible(560)); gives ERROR because method is void means not returning any value to print.
    }

    public static void checkEligible(int creditScore) {
        if(creditScore>=700){
            System.out.println("You are eligible to lease this car.");
        }else{
            System.out.println("Sorry,you are not eligible to lease this car.");
        }
    }


}

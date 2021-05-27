package day15_logicalops_switch_ternary;

public class AndOperatorsPractice2 {
    public static void main(String[] args) {

        boolean isRemote = true;
        boolean hasBenefits = true;
        String location = "Florida";
        double salary = 120_000;

        if (isRemote && hasBenefits && location.equals("Florida") && salary > 100_000){
            System.out.println("Accept the offer!");
        } else {
            System.out.println("Keep seeking!");
        }
    }
}

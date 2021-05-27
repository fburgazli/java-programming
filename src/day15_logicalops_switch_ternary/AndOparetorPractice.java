package day15_logicalops_switch_ternary;

public class AndOparetorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "Wooden Spoon";
        if(onSale && freeShipping && itemName.equals("Wooden Spoon")){
            System.out.println("Add " + itemName + " to cart.");
        } else {
            System.out.println("Continue shopping.");
        }

    }
}

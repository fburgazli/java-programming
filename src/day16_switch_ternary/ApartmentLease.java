package day16_switch_ternary;

public class ApartmentLease {
    public static void main(String[] args) {
        int numberOfBedrooms = 1;
        double startingPrice = 0.0;
        System.out.println("*****WELCOME TO THE ADAIR APARTMENTS*****");

        switch (numberOfBedrooms) {

            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454;
                break;
            case 1:
                System.out.println("1 Bedroom apartment selected");
                startingPrice = 1725;
                break;
            case 2:
                System.out.println("2 Bedroom apartment selected");
                startingPrice = 2899;
                break;
            default:
                System.out.println("We don't have " + numberOfBedrooms + " Bedrooms apartment!");
                return; // exits to main method.
        }
        System.out.println("Starting price for this apartment is $" + startingPrice);
    }
}

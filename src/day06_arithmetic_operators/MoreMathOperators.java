package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args) {
        int toyotas = 431;
        int hondas = 233;
        int vws = 21;
        int teslas = 7;
        int nissans = 51;
        int bmws = 15;
        // int toyotas = 431, hondas = 233, vws = 2, teslas = 20, nissans = 1, bmws = 155;

        int totalCarsInParking = toyotas + hondas + vws + teslas + nissans + bmws;

        System.out.println("There are " + totalCarsInParking + " cars in parking lot");

        String pizza = "Hawaiian";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices / people;
        //there are 2 slices per person
        System.out.println("There are " + slicesPerPerson + " slices per person");
        //We ordered hawaiian pizza with 8 slices, 4 people ate 2 slices each.
        System.out.println("We ordered " + pizza + " pizza with "+ slices + " slices, " + people + " people ate " + slicesPerPerson + "  slices each." );

    }
}

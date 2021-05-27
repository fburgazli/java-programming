package day10_shorthand_operators;

public class ShothandOperators {
    public static void main(String[] args) {

        int cars = 10;
        System.out.println("cars = " + cars);

        cars = cars + 2; //cars += 2; the sign can not be after = sign ,not like =+ , =- , =* , =/ does not work.
        System.out.println("cars = " + cars);

        cars += 5; // cars = cars + 5;
        System.out.println("cars = " + cars);

        cars -= 3; // cars = cars - 3;
        System.out.println("cars = " + cars);

        cars *= 2; // cars = cars * 2;
        System.out.println("cars = " + cars);

        cars /= 3; // cars = cars / 3;
        System.out.println("cars = " + cars);

        cars %= 5; //// cars = cars % 5;
        System.out.println("cars = " + cars);

        int electricCars = 13;
        cars += electricCars; // we can increase by another variable
        System.out.println("cars and electric cars = " + cars);

        String word = "Java";
        System.out.println("word = " + word);
        word = word + " Programming";
        System.out.println("word = " + word);
        // add " is fun"
        word += " is fun!";
        System.out.println("word = " + word);

        String selenium = " but \"selenium\" is more fun!";
        word += selenium;
        System.out.println("word = " + word);

        word += 3072021;
        System.out.println("word = " + word);

        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        letter += 1;
        System.out.println("letter = " + letter);

        double parkingFee =7.50;
        System.out.println("normal parking fee = " + parkingFee);
        //50% discount after work hours
        parkingFee /= 2;
        System.out.println("parking fee after work hours = " + parkingFee);
        
        parkingFee -= parkingFee;
        System.out.println("parking fee  for the weekend = " + parkingFee);









    }
}

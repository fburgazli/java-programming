package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Honda CRV");
        car1.setYear(2020);
        car1.setMileage(3250);
        System.out.println("Car 1 model = "+car1.getModel());
        System.out.println("Car 1 year = "+car1.getYear());
        System.out.println("Car 1 mileage = "+car1.getMileage());
        System.out.println(car1);
        Car car2 = new Car();

        car2.setModel("Toyota Prius");
        car2.setYear(2006);
        car2.setMileage(180_000);

        System.out.println("Car 2 model = "+car2.getModel());
        System.out.println("Car 2 year = "+car2.getYear());
        System.out.println("Car 2 mileage = "+car2.getMileage());
        System.out.println(car2);

    }
}

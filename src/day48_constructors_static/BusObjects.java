package day48_constructors_static;

public class BusObjects {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        bus1.driver = new Driver("Johny");
        bus1.engine= new Engine(10);

        Bus bus2 = new Bus();
        bus2.driver = new Driver();
        bus2.driver.setName("Adam");
        bus2.engine = new Engine();
        bus2.engine.setCylinder(12);

        System.out.println(bus1);
        System.out.println(bus2);

        System.out.println(bus1.driver.getName());
    }

}

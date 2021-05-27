package day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        sitInCar();
        startTheCar(); 
        shiftToDrive();
        pressGasPedal();
        
    }

    public static void pressGasPedal() {
        System.out.println("4.Press gas pedal smoothly and go.");
    }

    public static void shiftToDrive() {
        System.out.println("3.Press brake pedal and shift to 'D'");
    }

    public static void startTheCar() {
        System.out.println("2.Push the start button.");
    }

    public static void sitInCar() {
        System.out.println("1.Open the door and sit in driver seat.");
    }

}

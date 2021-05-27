package day18_conditions_practice;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Mercedes";
        String model = "C";
        double leasePrice = 0.0;
        if(make.equals("Mercedes")){
            if(model.equals("A")){
                leasePrice = 400;
            } else if( model.equals("E")){
                leasePrice = 500;
            } else {
                System.out.println("This model is not available");
                //return;
            }
        } else if(make.equals("Audi")){
            if(model.equals("SQ5")){
                leasePrice = 552;
            } else if(model.equals("A3")){
                leasePrice =412;
            } else {
                System.out.println(" This model is not available");
                //return;
            }
        }else {
            System.out.println("This make is not available!");
        }
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Lease price = $" + leasePrice);
    }
}

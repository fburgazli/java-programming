package day05_primitivies_concatenation;

public class CellPhone {
    public static void main(String[] args) {
        String brand = "Apple";
        String model = "iPhone11";
        String color = "green";
        double price = 499.99;
        int storage = 64;
        boolean hasCamera = true;

        System.out.println(brand);
        System.out.println(model);
        //with message
        System.out.println("Brand is " + brand);
        System.out.println("Model is " + model);
        System.out.println("color is " + color);
        System.out.println("Price is $"+ price);
        System.out.println("Storage is " + storage + "GB");
        System.out.println("Has Camera : " + hasCamera);


    }
}

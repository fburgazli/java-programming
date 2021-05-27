package office_hours.practice031521;

import java.util.Scanner;

public class LaptopConfigurator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price =0.0;

        System.out.println("Select screen size:");
        double screenSize = scan.nextDouble();
        if(screenSize == 13.3){
            price += 200;
        }else if(screenSize == 15.0){
            price += 300;
        }else if(screenSize == 17.3){
            price += 400;
        }
        System.out.println("Select CPU type:");
        String cpu = scan.next();
        if(cpu.equals("i3")){
            price += 150;
        }else if(cpu.equals("i5")){
            price += 250;
        }else if(cpu.equals("i7")){
            price += 350;
        }

        System.out.println("Select RAM size:");
        int ram = scan.nextInt();

            price += ((ram/4)*50);


        System.out.println("Select storage type:");
        String storage = scan.next();

        System.out.println("Enter storage size:");
        int storageSize = scan.nextInt();

        if(storage.equals("SSD")){
            price += ((storageSize/500)*100);

        }else if(storage.equals("HDD")){
            price += ((storageSize/500)*50);
        }
        System.out.println("Enter screen resolution:");
        String resolution = scan.next();
        if(resolution.equals("4K")){
            price += 200;
        }else if(resolution.equals("FULLHD")){
            price += 100;
        }

        System.out.println("Laptop price is: $" + price);
    }
}

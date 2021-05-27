package day04_variables_intro;

import javax.jws.soap.SOAPBinding;

public class AmazonItems {
    public static void main(String[] args) {

        String itemName = "HIC Wooden Spoon";
        int ratingsCount = 181;
        double price = 5.99;
        String seller = "Amazon.com";
        boolean prime = true ;
        System.out.println("---PRODUCT INFORMATION---");

        System.out.println(itemName);
        System.out.print(" * * * * * ");
        System.out.println(ratingsCount);
        System.out.print("$ ");
        System.out.println(price);
        System.out.println(seller);
        System.out.println(prime);


    }
}

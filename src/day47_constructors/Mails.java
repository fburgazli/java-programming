package day47_constructors;

public class Mails {
    public static void main(String[] args) {
        Address myAddress = new Address();//calling the constructor automatically
        myAddress.setStreet("163 Braemar Knoll Dr.");
        myAddress.setCity("Greer");
        myAddress.setState("SC");
        myAddress.setZipCode("29651");
        System.out.println(myAddress);

        myAddress.setStreet("1409 Roper Mountain Rd #236");

        System.out.println(myAddress);

        Address oldAddress = new Address();
        System.out.println(oldAddress);

        Address newAddress = new Address("809 Autumn Ln","Mason","OH","45040");
        System.out.println(newAddress);

    }
}

package day47_constructors;

public class Mails {
    public static void main(String[] args) {
        Address address1 = new Address();
        address1.setStreet("163 Braemar Knoll Dr.");
        address1.setCity("Greer");
        address1.setState("SC");
        address1.setZipCode("29651");
        System.out.println(address1);

    }
}

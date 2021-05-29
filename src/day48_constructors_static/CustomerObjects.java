package day48_constructors_static;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setName("John Adams");
        customer1.setId(123456);
        System.out.println(customer1);

        Customer customer2 = new Customer("James Bond" , 98765);
        System.out.println(customer2);
    }
}

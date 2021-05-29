package day48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setName("John Adams");
        customer1.setId(123456);
        System.out.println(customer1);

        Customer customer2 = new Customer("James Bond" , 98765);
        System.out.println(customer2);

        Customer customer3 = new Customer("Bob Fallon" , 546372);
        System.out.println(customer3);

        //array of customers
        Customer[] customers = {customer1,customer2,customer3, new Customer("Becky White", 44902)};
        System.out.println("Customers array = " + Arrays.toString(customers));
        System.out.println(customers[0]);

        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(new Customer("Rachel Wright", 28576));
        customerList.add(new Customer("Ronald Reagon", 18576));

        System.out.println("customerList = " + customerList);
        System.out.println(customerList.get(0));

        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }
        for(Customer customer : customerList){
            System.out.println(customer.getName());
        }
        System.out.println("********************");
        customerList.forEach(each -> System.out.println(each.getName()));

    }
}

package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Mike Brown";
        employee1.jobTitle = "SDET";
        employee1.work();

        Employee employee2 = new Employee();
        employee2.name = "Anna Karanina";
        employee2.jobTitle = "PO";
        employee2.work();
        Employee employee3 = new Employee();
        employee3.name = "John Adam";
        employee3.jobTitle = "SM";
        employee3.work();
    }
}

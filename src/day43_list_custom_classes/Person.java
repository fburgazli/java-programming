package day43_list_custom_classes;

public class Person {
    //data-> variables
    String name;
    int age;
    char gender;
    //behavior
    public void speak(){
        System.out.println("Person is speaking");
    }
}
class People {
    public static void main(String[] args) {
        //create object of Person class -Instantiate Person class
        Person person = new Person();
        person.name= "Jack";
        person.age = 34;
        person.gender ='M';
        person.speak();

        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.gender);

        Person person2 = new Person();
        person2.name = "Bethy";
        person2.age = 43;
        person2.gender ='F';
        person2.speak();
        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person2.gender);

    }
}

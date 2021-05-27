package day44_custom_classes;

public class Animal {
    String type;

    public void eat(String str) {
        System.out.println("eats " + str);
    }

    public void eat() {
        System.out.println("eats");
    }

    public void speak() {
        System.out.println("speaks");
    }
}

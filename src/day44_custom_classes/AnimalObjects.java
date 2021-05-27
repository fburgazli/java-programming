package day44_custom_classes;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal1 = new Animal();

        animal1.type = "cheetah";
        System.out.println(animal1.type);
        animal1.eat("meat");
        animal1.speak();

        Animal animal2 = new Animal();

        animal2.type ="eagle";
        System.out.println(animal2.type);
        animal2.eat();
        animal2.speak();

        Animal cheetah = new Animal();

        cheetah.type ="cheetah";
        System.out.println(cheetah.type);
        cheetah.eat("meat");
        cheetah.speak();

    }



}

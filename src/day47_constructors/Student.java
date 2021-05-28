package day47_constructors;

public class Student {
    public Student(){
        System.out.println("No-arg constructor.");
    }

    public Student(String name){
        System.out.println("name param constructor | name = " + name);
    }

    public Student(int age){
        System.out.println("age param constructor | age = " +age);
    }

    public Student(String name,int age){
        System.out.println("Name and age params constructor | Name = "+ name + " Age = "+age);
    }
}

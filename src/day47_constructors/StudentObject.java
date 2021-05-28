package day47_constructors;

public class StudentObject {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();

        Student st3 = new Student("John");
        Student st4 =  new Student("Adam");

        Student st5 = new Student(17);
        Student st6 = new Student(15);

        Student st7 = new Student("John", 21);
        Student st8 = new Student("Adam", 20);
    }
}

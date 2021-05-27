package day36_methods_with_return;

import java.util.Random;

public class Info {
    public static void main(String[] args) {
        System.out.println(fullName());
        System.out.println(isMarried());
        System.out.println(getAge());
        System.out.println(getRandomYear());
        System.out.println(getRandomYear());
        System.out.println(getRandomYear());

    }

    public static String fullName() {
        return "Mike Smith";
    }
    public static boolean isMarried(){
        return true;
    }
    public static int getAge(){
        return 33;
    }
    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}

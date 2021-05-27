package day28_loops_again;

import java.util.*;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        Random random = new Random();
        String password = "";

        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(source.length());
            password += source.charAt(index);
        }

        System.out.println("Your password is: " + password);

    }
}

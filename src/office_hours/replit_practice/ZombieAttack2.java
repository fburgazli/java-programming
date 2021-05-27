package office_hours.replit_practice;

import java.util.Arrays;

public class ZombieAttack2 {
    public static void main(String[] args) {
        int[] inhabitants={3, 6, 0, 4, 3, 2, 7, 0};
        int sum = 1;
        for (int i = 0; sum>0 ; i++) {
             sum=0;
            for (int k = 0; k < inhabitants.length; k++) {
                sum += inhabitants[k];
            }
            System.out.println("Day " + i + " " + Arrays.toString(inhabitants));
            for (int j = 0; j < inhabitants.length - 1; j++) {
                if (inhabitants[j] == 0) {
                    if (inhabitants[0] == 0) {
                        inhabitants[j + 1] = inhabitants[j + 1] / 2;
                    } else {
                        inhabitants[j - 1] = inhabitants[j - 1] / 2;
                        inhabitants[j + 1] = inhabitants[j + 1] / 2;
                    }
                    i=j;

                }

            }
            if (sum == 0) {
                System.out.println("---- EXTINCT ----");
                return;

            }
        }
    }
}

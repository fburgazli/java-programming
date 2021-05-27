package office_hours.replit_practice;

import java.util.Arrays;

public class ZombieAttack2_DoWhile {

    public static void main(String[] args) {
        int[] inhabitants={3, 6, 0, 4, 3, 2, 7, 0};
        int sum = 0;
        int i=0;

        do{

            System.out.println("Day " + i + " " + Arrays.toString(inhabitants));
            if(inhabitants[i]==0){
                inhabitants[i-1]=inhabitants[i-1]/2;
                inhabitants[i+1]= inhabitants[i+1]/2;
            }
            sum=0;
            for (int k = 0; k < inhabitants.length; k++) {
                sum += inhabitants[k];
            }

            i++;
        }while(sum>0);
        System.out.println("---- EXTINCT ----");



    }
}

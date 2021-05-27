package office_hours.practice042121;

import java.net.ServerSocket;
import java.util.*;

public class ZombieAttack2 {
    public static void main(String[] args) {
        int[] inhabitants = {3,6,0,4,3,2,7,0};
        int days =0;
        System.out.println("Day "+ days++ +" " +Arrays.toString(inhabitants));
        while(!Arrays.equals(inhabitants,new int[inhabitants.length])){
            int[] temp = Arrays.copyOf(inhabitants,inhabitants.length);
            for (int i = 0; i < inhabitants.length; i++) {
                if(inhabitants[i]==0){
                    if(i==0){
                        temp[i+1] /=2;
                    }else if(i== inhabitants.length-1){
                        temp[i-1] /=2;
                    }else{
                        temp[i-1] /=2;
                        temp[i+1] /=2;
                    }
                }
            }
            inhabitants = Arrays.copyOf(temp,temp.length);
            System.out.println("Day "+ days++ +" " +Arrays.toString(inhabitants));
        }
        System.out.println("-----Extinct------");
    }
}

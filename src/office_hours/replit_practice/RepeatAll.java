package office_hours.replit_practice;

import java.util.*;

public class RepeatAll {

    public static ArrayList<Boolean> repeatAll(ArrayList<Boolean> b){
        ArrayList<Boolean> newB = new ArrayList<>();
        for(Boolean each:b){
            newB.add(each);
        }
        for(Boolean each:b){
            newB.add(each);
        }
        return newB;
    }


    // Do not touch below

    public static void main(String[] args) {
       ArrayList<Boolean> list =new ArrayList<>(Arrays.asList(true,true,false,false,true,false));

        System.out.println(repeatAll(list));

    }

}

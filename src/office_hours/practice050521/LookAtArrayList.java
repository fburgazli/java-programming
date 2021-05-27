package office_hours.practice050521;

import java.util.*;

public class LookAtArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one","two","three"));

            for(int i=0;i<list.size();i++){
                if(list.get(i).length()==3){
                    list.remove(list.get(i));
                    i--;
            }
        }
        System.out.println(list);
    }

}

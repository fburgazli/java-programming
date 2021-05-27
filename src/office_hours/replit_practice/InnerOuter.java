package office_hours.replit_practice;

import java.util.Arrays;

public class InnerOuter {
    public static void main(String[] args) {
        int[] outer ={4, 2, 1, 2,4,6};
        int[] inner = {2, 4};

        Arrays.sort(inner);
        Arrays.sort(outer);
        String outerStr="";
        String innerStr="";
        boolean flag = false;
        for(int i=0;i<outer.length;i++){
            outerStr += outer[i];
        }
        for(int i=0;i<inner.length;i++){
            innerStr += inner[i];
        }
        if(outerStr.contains(innerStr)){
            flag = true;
        }
        System.out.println(flag);
    }
}

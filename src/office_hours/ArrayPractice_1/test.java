package office_hours.ArrayPractice_1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class test {
    public static void main(String[] args) {
        System.out.println(sum(1,sum(0,1)));
    }
    public static int sum(int a,int b){
        if(a+b>1)
            return 0;
        System.out.print((a+b));
        return a+b;
    }

}

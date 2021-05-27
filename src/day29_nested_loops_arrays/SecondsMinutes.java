package day29_nested_loops_arrays;
//import java.lang.*;
public class SecondsMinutes {
    public static void main(String[] args) throws InterruptedException {
        for(int min =0 ; min < 5 ; min++){
               for(int sec = 0; sec< 60 ; sec++){
                System.out.println(min +" : " + sec);

            }
            Thread.sleep(1000);




        }
    }
}

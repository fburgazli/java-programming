package day25_for_loop;

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 3;

       while(isHungry){
           bananas++;
           System.out.println("eat banana " + bananas);
           isHungry = bananas == countToFull ? false : true;

           // if (bananas == countToFull) {
           //     isHungry = false;
            //}
       }
        System.out.println("Get back to work,then!");

        }

}

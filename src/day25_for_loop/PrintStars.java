package day25_for_loop;

public class PrintStars {
    public static void main(String[] args) {
        for(int i = 0 ; i <15 ; i++){
            System.out.print("* ");
        }

        System.out.println();
        String myStars = "";
        for(int i =0 ; i <15 ; i++){
            myStars += "(* ";

        }

       System.out.println(myStars.trim());
    }

}

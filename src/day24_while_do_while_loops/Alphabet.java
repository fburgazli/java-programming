package day24_while_do_while_loops;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'a';
         while(letter<= 'z') {
             System.out.print(letter + " ");
             letter++;
         }

         System.out.println();

         letter = 'z';
         while(letter >= 'a'){

             System.out.print(letter + " ");
             letter--;
         }
    }
}

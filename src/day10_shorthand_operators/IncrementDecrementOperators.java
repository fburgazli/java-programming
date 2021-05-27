package day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {

        int i = 1;
        System.out.println("i = " + i);
        i++; // adds 1
        System.out.println("i = " + i);
        ++i;
        System.out.println("i = " + i);
        i--;
        System.out.println("i = " + i);
        --i;
        System.out.println("i = " + i);
        
        int linesOfCode = 17;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode++;
        ++linesOfCode;
        linesOfCode +=1;
        linesOfCode = linesOfCode + 1;
        System.out.println("linesOfCode = " + linesOfCode);
       // ++linesOfCode++; does not work, gives error

        linesOfCode = linesOfCode - 1;
        linesOfCode -= 1;
        linesOfCode--;
        --linesOfCode;
        System.out.println("lines of code = " + linesOfCode);

        char letter = 'a';
        System.out.println("letter = " + letter);
        letter++;//changes to next character
        System.out.println("letter = " + letter);
        ++letter;
        System.out.println("letter = " + letter);
        letter--;//changes to previous character
        System.out.println("letter = " + letter);



        

    }
}

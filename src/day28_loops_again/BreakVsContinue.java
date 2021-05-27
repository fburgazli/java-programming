package day28_loops_again;

public class BreakVsContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i%2 == 0) {
                continue; //skip thi iteration and go to next(back to loop) before printing
            }
            System.out.print(i + " ");
            if(i == 5){ //i==5 not stopping because it is skipping 50 before it comes to this line
                break;
            }

        }

    }
}

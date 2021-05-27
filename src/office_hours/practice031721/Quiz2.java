package office_hours.practice031721;

public class Quiz2 {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = !x == false;
        boolean z = y;
        if(x) {
            System.out.println("F");
        }
        if (y){
            System.out.println("B");
        }
        if (z) {

            System.out.println("I");
        }
    }
}

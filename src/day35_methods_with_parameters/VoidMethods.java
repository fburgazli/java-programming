package day35_methods_with_parameters;

public class VoidMethods {
    public static void main(String[] args) {
       // printAtoZ();
        displayUSFlag();



    }

    private static void displayUSFlag() {
        System.out.println("-------------FLAG OF USA----------------");
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }

    public static void printAtoZ() {
        for (char c='A'; c <= 'Z' ; c++) {
            System.out.print(c+" ");

        }
    }

}

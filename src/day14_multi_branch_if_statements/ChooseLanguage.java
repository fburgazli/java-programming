package day14_multi_branch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {
        System.out.println("Choose your language: ");
        int selection = 3;
        if(selection ==1){
            System.out.println("Hello, thanks for your call!");

        } else if(selection == 2) {
            System.out.println("Hola,gracias para llamar");
        } else if(selection == 3 ) {
            System.out.println("Merhaba,aradiginiz icin tesekkurler.");
        } else if(selection == 4){
            System.out.println("Privet,spasiva za vash zvonok");
        } else if( selection == 5){
            System.out.println("Merci, pour votre appel");
        } else {
            System.out.println("Let's talk Java!");
        }
    }
}

package office_hours.saim_only_tasks.loops_practice_3;

public class BookValue {
    /*
       Given a String book with all the text of your book. Figure out how much
    you will make from your book.
    Each chapter you have in your book will add 10 $ value to your book.
    Go through your book and figure out the value of the book. Ignore case
    sensitivity.
    Check the next slide for the Book text you can use to test.`
     */
    public static void main(String[] args) {
        String book ="Java textbook By Murodil. Chapter 1 datatypes and variables. Chapter 2\n" +
                "conditional statements. chapter 3 String manipulation. Chapter 4\n" +
                "Loops. Chapter 5 Arrays. Chapter 6 Methods. chapter 7 ArrayList.\n" +
                "chapter 8 instance and static. Chapter 9 Constructors. Chapter 10\n" +
                "Encapsulation and Inheritance. Chapter 11 Abstraction and\n" +
                "Polymorphism. Chapter 12 Exceptions. Chapter 13 Collections. Chapter\n" +
                "14 Learn more.";
        int count = 0 ;
        for (int i = 0; i < book.length()-6; i++) {
            if(book.substring(i,i+7).equalsIgnoreCase("chapter")){
                count++;
            }
        }
        double value = count*10.0;
        System.out.println("Value of the book = $" + value);

    }
}

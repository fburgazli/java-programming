package office_hours.practice030221;

public class PersonInfo {
    public static void main(String[] args) {
        String name = "Frederick";
        byte age = 42;
        char gender = 'M';
        boolean isStudent = false;
        short numberOfSiblings = 4;
        long favoriteNumber = 1000000000000000000L;
        int numberOfSeasons = 4;
        int year = 1979;
        double birthDate = 2.16;
        String fullBirthDate = "" + birthDate +"." + year ; // "" in the beginning to change to String
        String favoriteQuote = "Think big,dream bigger!";

        System.out.println("Full birth date is " + fullBirthDate);
        System.out.println('F' + 0); // printing ascii value of F

    }
}

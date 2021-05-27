package office_hours.saim_only_tasks;

public class Author {
    public static void main(String[] args) {
        /*
       [Author] - Look at CappuccinoBuyer from class for an idea

        You are an author. You are writing a book and want to figure out some information related to the genre of book you are writing. Given the genre name figure out: average page length, average profit, average number of sequels, average number of countries published in.

        Make variables for all of that information. Given empty defaults for all except the neighborhood name. Print the information once at the end.

        Data based on genre:

         */
        String genre = "Detective";
        int pageLength = 0;
        int profit = 0;
        int sequels = 0;
        int countries = 0;

        switch (genre) {
            case "Fantasy":
                pageLength = 500;
                profit = 1000000;
                sequels = 5;
                countries = 50;
                break;

            case "Detective":
                pageLength = 350;
                profit = 700000;
                sequels = 3;
                countries = 45;
                break;

            case "Science Fiction":
                pageLength = 720;
                profit = 900500;
                sequels = 4;
                countries = 30;
                break;

            case "Short Story":
                pageLength = 150;
                profit = 300000;
                sequels = 1;
                countries = 40;
                break;
            default:
                System.out.println("Invalid entry");
                return;
        }
        System.out.println("genre = " + genre);
        System.out.println("pageLength = " + pageLength);
        System.out.println("profit = $" + profit);
        System.out.println("sequels = " + sequels);
        System.out.println("countries = " + countries);

    }

}

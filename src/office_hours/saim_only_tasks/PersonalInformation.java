package office_hours.saim_only_tasks;

import java.util.Scanner;

public class PersonalInformation {
    /*
    [Personal Information - Scanner and If]
Ask the user how many people they live with?
 if user lives with Less than 2 people: print "Live with less than 2 people"
 if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
 if the user lives with more than 6 people: print "Live with "more than 6 people"
 Ask the user what city they live in?
 Ask the user if the live in downtown ("yes or no")
 if you live downtown, ask them have you thought about moving to the suburbs? ("yes or
no")
 if they have thought about it print "do it its great", if they have not print "You should
think about it"
 Ask the user their favorite animal?
 Print "Wow %animal is a great animal"
 Ask the user how many pets they want?
 Print "Interesting, do you want %numberOfPets %favoriteAnimals?"
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int people = scan.nextInt();

        if(people<2){
            System.out.println("Live with less than 2 people");
        } else if(people>=3 && people<=6){
            System.out.println("Live with 3 - 6 people");
        } else{
            System.out.println("Live with more than 6 people");
        }
        System.out.println("What city do you live in?");
        String city = scan.nextLine();
        scan.nextLine();
        System.out.println("Do you live in downtown? (Yes/No)");
        String downtown = scan.next();
        if (downtown.equals("Yes") || downtown.equals("yes")) {
            System.out.println("Have you thought about moving to the suburbs? (Yes/No)");
            String suburb = scan.next();
            if(suburb.equals("Yes")|| suburb.equals("yes")){
                System.out.println("Do it! It's great!");
            } else {
                System.out.println("You should think about it");
            }
        }
        System.out.println("What's your favorite animal?");
        scan.nextLine();
        String favoriteAnimal = scan.nextLine();


        System.out.println("Wow "+ favoriteAnimal+ " is a great animal");


        System.out.println("How many pets do you want?");
        int numberOfPets = scan.nextInt();
        System.out.println("Interesting, so you want " + numberOfPets  + " " + favoriteAnimal +"s");


    }
}

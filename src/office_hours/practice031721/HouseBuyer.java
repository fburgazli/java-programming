package office_hours.practice031721;

public class HouseBuyer {
    public static void main(String[] args) {
        /*
        [House Buyer ] - Look at CappuccinoBuyer from class for an idea

You are buying a new house and need to collect information about the houses in a specific area. You will give the neighborhood name and see the average house price, rating of school districts near by(out of 5), if it is a gated community or not, allow pets or not.

Make variables for all of that information. Given empty defaults for all except the neighborhood name. Print the information once at the end.

    Data based on neighborhood name:

        name - Hills
        average price - 89,000
        rating - 4.0
        gated - no
        allow pets - yes

        name - Oaks
        average price - 75,000
        rating - 3.5
        gated - no
        allow pets - yes

        name - Highland
        average price - 150,000
        rating - 4.5
        gated - yes
        allow pets - no

        name - Canyon
        average price - 201,000
        rating - 4.8
        gated - yes
        allow pets - yes

         */
        String name = "Oaks";
        int averagePrice;
        double rating;
        boolean gated, allowPets;

        switch(name){
            case "Hills":
                averagePrice = 89_000;
                rating = 4.0;
                gated = false;
                allowPets = true;
                break;
            case "Oaks":
                   averagePrice = 75_000;
                    rating = 3.5;
                    gated = false;
                    allowPets = true;
                    break;
            case "Highland":
                    averagePrice = 150_000;
                    rating = 4.5;
                    gated = true;
                    allowPets = false;
                    break;
            case "Canyon":
                    averagePrice = 201_000;
                    rating = 4.8;
                    gated = true;
                    allowPets = true;
                    break;
            default:
                name = "Invalid entry";
                averagePrice = 0;
                rating = 0.0;
                gated = false;
                allowPets = false;
        }
        System.out.println("name = " + name);
        System.out.println("averagePrice = $" + averagePrice);
        System.out.println("rating = " + rating);
        System.out.println("gated = " + gated);
        System.out.println("allowPets = " + allowPets);

    }
}

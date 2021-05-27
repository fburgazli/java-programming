package office_hours.saim_only_tasks;

public class ProblemSetSwitchHouse {
    public static void main(String[] args) {

        String house ="Villa";
        int occupants = 0;
        switch(house){
            case "Tree house":
                occupants = 1;
                break;
            case "Mobile home":
                occupants =2;
                break;
            case "Apartment":
                occupants =4;
                break;
            case "Town house":
                occupants =6;
                break;
            case "Villa":
                occupants = 8;
                break;
            case "Mansion":
                occupants = 10;
                break;
            default:
                System.out.println("Invalid entry");
                return;
        }
        System.out.println("Number of occupants is " + occupants + " in a " + house);

    }
}

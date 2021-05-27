package day16_switch_ternary;

public class FloorSelector {
    public static void main(String[] args) {

        int floorNum = 7;

        System.out.println("if else if :");

        if(floorNum ==1){
            System.out.println("Floor 1 is selected.Companies: Verizon,Starbucks");
        } else if(floorNum ==2){
            System.out.println("Floor 2 is selected. Companies: Cybertek,Intelsat, ATT");
        } else if(floorNum ==3){
            System.out.println("Floor 3 is selected. Companies:Lyft, BofA, Steakhouse");
        } else {
            System.out.println("Invalid floor number!");
        }

        System.out.println("Switch case :");

        switch (floorNum){

            case 1:
                System.out.println("Floor 1 is selected.Companies: Verizon,Starbucks");
                break;
            case 2:
                System.out.println("Floor 2 is selected. Companies: Cybertek,Intelsat, ATT");
                break;
            case 3:
                System.out.println("Floor 3 is selected. Companies:Lyft, BofA, Steakhouse");
                break;
            default :
                System.out.println("Invalid floor number!");
                break;
        }



    }
}

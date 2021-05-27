package office_hours.practice051921;

public class Birds {
    //encapsulation
    private String species;
    private boolean canFly;
    private double beakLength;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public double getBeakLength() {
        return beakLength;
    }

    public void setBeakLength(double beakLength) {
        if(beakLength>0) {
            this.beakLength = beakLength;
        }else{
            System.out.println("Invalid length!");
        }
    }
}

package office_hours.practice031621;

public class BMI {
    public static void main(String[] args) {
        double mass = 76;
        double height =1.75;

        double bmi = mass/(height*height);

        if(bmi< 18.5) {
            System.out.println("Underweight");
        } else if(bmi<25){
            System.out.println("Normal weight");
        } else if(bmi<30) {
            System.out.println("Overweight");
        } else{
            System.out.println("Obese");
        }

    }
}

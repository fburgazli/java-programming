package office_hours.practice031521;

public class TriangleAngles {
    public static void main(String[] args) {

        int angle1 = 50;
        int angle2 = 60;
        int angle3 = 70;

        boolean isTriangle = (angle1 + angle2 + angle3) == 180;

        if(isTriangle){
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Not a triangle");
        }


    }
}

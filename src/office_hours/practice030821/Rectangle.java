package office_hours.practice030821;

import java.util.Scanner;

public class Rectangle {
    /*
    Make a class Rectangle
create a main method

     - Declare two variables: length and width

         - Calculate the Perimeter 2(l*w)
         - Calculate the Area (w * l)

     - Print properties of the Rectangle

     - Modify to accept Scanner inputs
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length and width of the rectangle:");

        double length = scan.nextDouble();
        double width = scan.nextDouble();

        double area = length*width;
        double perimeter = 2*(length+width);

        System.out.println("The perimeter of the rectangle = " + perimeter);
        System.out.println("The area of the rectangle = " + area);


    }
}

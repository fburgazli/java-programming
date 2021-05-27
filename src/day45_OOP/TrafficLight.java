package day45_OOP;

public class TrafficLight {
    String color;
    //this is read only method ,displays value of color variable
    public void showColor(){
        System.out.println("Current color = " + color);
    }
    // this method updates the value of color variable
    public void changeColor(String newColor){
        System.out.println("Changing color to " + newColor);
        color = newColor;
    }
}

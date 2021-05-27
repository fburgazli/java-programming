package office_hours.practice051721;

public class Rectangle {
    double width;
    double heigth;
    double area;

    public void setDimensions(double rWidth,double rHeight){
        width = rWidth;
        heigth = rHeight;

    }

    public double getArea(){
        return area = width*heigth;
    }
    //command+N to open constructor and then choose toString()
    @Override
    public String toString() {
        return "Rectangle{" +
                "width= " + width +
                ", heigth= " + heigth +
                ", area= " + area +
                '}';
    }
}

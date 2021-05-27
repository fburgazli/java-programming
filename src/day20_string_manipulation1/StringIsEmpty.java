package day20_string_manipulation1;

public class StringIsEmpty {
    public static void main(String[] args) {
        String city = "";
        String car = "lexus";
        String space= " ";
        System.out.println(city.isEmpty()); //true
        System.out.println(car.isEmpty());// false
        System.out.println(space.isEmpty());//false

        System.out.println(city.length() == 0); //true
        System.out.println(car.length()== 0); //false
        System.out.println(city.equals("")); //true
        System.out.println(car.equals(""));//false
        System.out.println("".equals(city));// true

        if(!car.isEmpty()){
            System.out.println("I have a car!");
        } else{
            System.out.println("I don't have a car.");
        }

        //String word ;
        //System.out.println(word.isEmpty()); gives error because word is not initialized.

    }
}

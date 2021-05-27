package day41_arraylist;
import java.util.*;
public class UpdatingArrayList {
    public static void main(String[] args) {
      List<String> cars = new ArrayList<>();
      cars.add("Honda");
      cars.add("Toyota");
      cars.add("Nissan");
      cars.add("BMW");
      cars.add("GM");
      cars.add(0,"Jeep");
      cars.add(1,"Ford");
      cars.add(2,"Yugo");
        System.out.println(cars);

        String allCarsInOneString=cars.toString();
        System.out.println("allCarsInOneString = " + allCarsInOneString);//saves all cars in 1 string variable
        System.out.println(allCarsInOneString.length());

        System.out.println(cars);
        cars.set(0,"Mercedes");
        System.out.println(cars);
        cars.set(4,"Mazda");
        System.out.println(cars);
        System.out.println(cars.indexOf("Ford"));
        cars.set(1,"RAM");
        System.out.println(cars);
        cars.set(cars.indexOf("Yugo"),"Tesla");
        System.out.println(cars);

        if(cars.contains("BMW")){
          cars.set(cars.indexOf("BMW"),"VW");
        }else{
          System.out.println("BMW is not found.");
        }
      System.out.println(cars);

      for (int i = 0; i < cars.size(); i++) {
        if(cars.get(i).equals("RAM")){
          cars.set(i,"Audi");
        }
        if(cars.get(i).equals("GM")){
          cars.set(i,"Subaru");
        }
        if(cars.get(i).equals("VW")){
          cars.set(i,"Suzuki");
        }
      }

      System.out.println(cars);


    }
}

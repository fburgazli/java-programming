package day40_arraylist;

import java.util.*;

public class RawArrayList {
    public static void main(String[] args) {
        //declare a new raw arraylist: that can store objects of any type.It is not recommended to use like this unless in certain cases.
        //default capacity for arraylist is 10 with 10 null values.
        ArrayList list1 = new ArrayList();//1st way to declare
        List list2 = new ArrayList(); //2nd way to declare - polymorphic way

        // add values
        list1.add("java");
        list1.add("apples");
        list1.add("coffe");
        list1.add(123);
        list1.add(23.4);
        list1.add(true);
        list1.add("wooden spoon");

        System.out.println(list1);
        System.out.println(list1.size());

        //We need to use Restricted Type that only allows certain type of data.


        ArrayList<Integer> nums = new ArrayList<>();// restricted type accepts only Integer wrapper class.
        ArrayList num = new ArrayList(); //raw arraylist - not recommended might be used with API




    }
}

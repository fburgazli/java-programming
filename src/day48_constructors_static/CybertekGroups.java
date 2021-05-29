package day48_constructors_static;

import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
        Group group= new Group("Group#16");

        //group.setMembers(Arrays.asList("Max","Halide","Aygun","Abi"));
        group.addMember("Rod");
        group.addMember("Mariam");
        group.addMember("Abi");
        group.addMember("Aygun");
        group.addMember("Max");
        group.addMember("Mariam");

        System.out.println(group);
        System.out.println(group.getMembers().size());
        group.removeMember("Abi");

        System.out.println(group);
        System.out.println(group.getMembers().size());

        Group group2 = new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stephen","Waksum","Akrem","Bulent","Andrea","Andrei"));
        System.out.println(group2.getMembers());

        if(group2.getMembers().contains("Akrem")){
            System.out.println("Akrem is a member of Group2");
        }else{
            System.out.println("Akrem is not a member of Group 2");
        }


    }
}

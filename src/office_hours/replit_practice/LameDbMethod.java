package office_hours.replit_practice;

import java.util.*;

public class LameDbMethod {

    public static String lameDb(String db, String op, String id, String data) {
        String[] arr=db.split("#");
        String newDb="";
        List<String> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        if(op.equals("add")){
            for (int i = 0; i <=arr.length; i++) {

                if (i == Integer.parseInt(id) - 1) {
                    list.add(Integer.parseInt(id) - 1, id + data);
                }
            }
            for(int i=0;i<= arr.length;i++){
                newDb += list.get(i).replace(list.get(i).charAt(0)+"",i+1+"")+"#";
            }
            return newDb.substring(0,newDb.length()-1);
        }else if(op.equals("edit")){
            for (int i = 0; i <=arr.length; i++) {

                if (i == Integer.parseInt(id) - 1) {
                    list.set(Integer.parseInt(id)-1,id+data);
                }
            }

            for(int i=0;i<arr.length;i++){
                newDb += list.get(i).replace(list.get(i).charAt(0)+"",i+1+"")+"#";
            }
            return newDb.substring(0,newDb.length()-1);
        }else if(op.equals("delete")){
            list.remove(Integer.parseInt(id)-1);
            for(String each:list){
                newDb += each+"#";
            }
            return "#"+newDb.substring(0,newDb.length()-1);
        }
        return null;
    }//end lameDb

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        System.out.println(lameDb("1etsy#2wooden#3spoon","add","4","aaa"));
        System.out.println(lameDb("1etsy#2wooden#3spoon","add","1","bbb"));
        System.out.println(lameDb("1test#2bla#3foo","edit","2","bbb"));
        System.out.println(lameDb("1tst#2bla#3foo","delete","1",""));


    }
}

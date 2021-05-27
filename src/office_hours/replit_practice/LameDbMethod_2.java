package office_hours.replit_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LameDbMethod_2 {
    public static String lameDb(String db, String op, String id, String data) {
        ArrayList<String> list= new ArrayList<>(Arrays.asList(db.split("#")));
        //System.out.println(list);
        int idx = Integer.parseInt(id);
        switch (op){
            case "add":
                if(idx> list.size()){
                    list.add(id+data);
                }else{
                    int newId=1;
                    String str="";
                    for (int i = 0; i < list.size() ; i++) {
                        if(i==idx-1){
                            str += newId++ + data + "#";
                        }
                        str += newId++ +list.get(i).substring(1)+"#";
                    }
                    return str.substring(0,str.length()-1);
                }


                break;
            case "edit":
                list.set(idx-1,id+data);
                break;
            case "delete":
                list.remove(idx-1);
                break;
        }

        String result= list.toString();

        return result.substring(1,result.length()-1).replace(", ","#");
    }//end lameDb

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        System.out.println(lameDb("1etsy#2wooden#3spoon","add","4","aaa"));
        System.out.println(lameDb("1etsy#2wooden#3spoon","add","1","bbb"));
        System.out.println(lameDb("1test#2bla#3foo","edit","2","bbb"));
        System.out.println(lameDb("1tst#2bla#3foo","delete","1",""));


    }
}

package day30_arrays;

public class ArrayLoopWithconditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};
        String[] countries = {"Brazil","China","Cuba","Sweden","France","Vietnam","Albania","Brazil",
                "Portugal","China","Philippines","Philippines","China","Philippines","China",
                "Armenia","Philippines","China","Colombia","Philippines","Honduras","Indonesia","Brazil",
                "China","United States","Russia"};

        //print all prices more than 100;
        for(double each : prices){
            if(each>100.0){
                System.out.println(each);
            }

            }
        System.out.println("Prices between 10 and 70: ");
        for(double each:prices) {

            if (each >= 10 && each <= 70) {
                System.out.println(each);
            }
        }
        System.out.println("--------count prices more than 50-----------------");
        int count =0;
        for(double each: prices){

            if(each>50){
                count++;
            }
        }
        System.out.println("count prices more than 50 : "+count);

        System.out.println("-------countries with name length more than 7------------");
        for(int i=0 ; i< countries.length ;i++){
            if(countries[i].length()>7){
                System.out.print(countries[i]+" ");
            }
        }
        System.out.println();
        for(String each: countries){
            if(each.length()>7){
                System.out.print(each+" ");
            }
        }
    }
}

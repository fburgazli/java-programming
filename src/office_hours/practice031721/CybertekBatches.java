package office_hours.practice031721;

public class CybertekBatches {
    public static void main(String[] args) {

        String batch = "US"; //EU


        if( batch.equals("US") || batch.equals("us") ){

            boolean isMorning = false;

            if(isMorning){
                System.out.println("Class time are 10-5 EST. M,T,W,Th,F.");
            } else {
                System.out.println("Class times are 7-10 PM EST M,T,W,Th and 10-5 Sun,Sat");
            }

        } else if (batch.equals("EU") || batch.equals("eu")){
            System.out.println("Class times 10-5 EST M<T<W<Th,F.");

        } else {
            System.out.println(" Invalid Batch");
        }

    }
}

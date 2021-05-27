package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student = {"id","fistName","lastName","batchNum","phoneNum"};
        String[] student1 = {"AB210221","Fikret","Burgazli","Batch#22", "5133848327"};
        System.out.println("Student1 ID : " + student1[0]);
        System.out.println("Student1 First name: " + student1[1]);
        System.out.println("Student1 Last name: "+ student1[2]);
        System.out.println("Student batch Number: " + student1[3]);
        System.out.println("Student1 mobile number: " + student1[4]);

        System.out.println(student1.length);
        if(student1.length ==5){
            System.out.println("PASS: data array has correct length.");
        }else{
            System.out.println("FAIL: data array has incorrect length");
        }
        if(student1.length == student.length){
            System.out.println("PASS: data arrays length match.");
        } else {
            System.out.println("FAIL: data arrays length mismatch.");
        }

        System.out.println(student1[1].toUpperCase() +" "+ student1[2].toUpperCase());

    }
}

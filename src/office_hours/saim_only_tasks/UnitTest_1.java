package office_hours.saim_only_tasks;

public class UnitTest_1 {
    public static void main(String[] args) {
        int num = -5;
        System.out.print(num++ + ",");
        System.out.print(num =0);
        System.out.print("," + --num);

        short s = 13 -9 /3 *10;
        s += -10;
        System.out.println(s);

        boolean one =('a' != 'z') && false;
        boolean two = one || 0 == (9-10+1);
        System.out.println(two);

        long l =100;
        short s0 =(short) l;
        System.out.println(s0+10);

        int a =10;
        a = --a + a++ + a-- + a++;
        System.out.println(a);

        short s1 = 13 + 3*(10-6) %2;
        boolean b = s1 != 25;
        System.out.println(b);

        byte b2 =104;
        boolean check = b2 <100;
        if(check){
            b2 -= 100;
        }else {
            b2 =50;
        }
        System.out.println(b2);

        if(183 == 13 + 50*2 +70) {
            System.out.println("Java");
        } else {
            System.out.println("SS");
        }

        int cookies = 10;
        String day = "tuesday";

        switch(day){
            case "sunday":
                cookies++;
            case "monday":
                cookies +=5;
                break;
            case "tuesday":
            case "wednesday":
                cookies +=10;
            case "thursday":
                cookies +=5;
                break;
            case "friday":
                break;
            case "saturday":
                cookies--;
                break;
            default:
                cookies = 0;
        }
        System.out.println(cookies);

        String str ="";
        int num2 = 20;
        switch(num2){
            case 0:
                str = "C#";
                break;
            case 10:
                str += "is";
            case 15:
                str = "fun";
            case 20:
                str += "java ";
            case 25:
                str += "is";
                break;
            case 30:
                str += "fun";
                break;
            case 35:
                str ="python";
            case 40:
                str += "90";
        }
        System.out.println(str);

        double pi =3.14;
        boolean bb = 119%5 ==0;
        int n =0;
        if(pi > 3.14 && !bb){
            n +=50;
        }else{
            n-=50;
        }
        if(bb){
            n +=50;
        }
        System.out.println(n);

        double decimal = 13.142;
        int whole = decimal < 20 ? 20 :10;
        System.out.println(whole);

        String name = "Jimmy";
        boolean checkk ;
        if ( name == "James"){
            checkk = false;

        } else {
            checkk =true;
        }
        String str1 = checkk ? "5" : "10";
       // System.out.println( str == 10); str can't be equal to int.

        int check1 = 132;
        String str5 ="";
        if( check1 %2 ==0){
            str5 += check1;//Todo:Check: this is concatenation adding an int ot string not assigning!!!
            if(check1%5 == 0){
                str5 +="132";
            }else{
                str5 ="500";
            }
        }else {
            str5 += "123";
        }
        System.out.println(str5);
        int num5 =2;
        boolean b5 = true;
        switch(num){
            case 0:
                b5 = false;
            case 1:
                System.out.print(1);
            case 2:
                if(b5){
                    System.out.print(2);
                }else{
                    b5 =false;
                }
            case 3:
                if(b5){
                    System.out.print(3);
                    b = false;
                }else{
                    break;
                }
            case 4:
                System.out.print(4);
            case 5: ///Todo:Check: !b true so it will exit here without printing 5.
                if(!b5){
                    break;
                }
                System.out.print(5);
        }







    }
}

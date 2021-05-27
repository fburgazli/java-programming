package office_hours.practice051821;

public class Mutability {
    public static void main(String[] args) {
        String one = " java";
        String two = one;
        String three = two.toUpperCase();
        System.out.println(two);
        System.out.println(three);

        int[] arr ={1,2,3};
        int[] arr2 = arr;
        arr[0]=100;
        System.out.println("arr = " + arr);
        System.out.println("arr2 = " + arr2);

    }
}

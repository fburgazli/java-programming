package office_hours.practice051921;

public class MyBackYard {
    public static void main(String[] args) {
        Birds bird1= new Birds();
        Birds bird2 = new Birds();
        bird1.setSpecies("Cardinal");
        bird1.setCanFly(true);
        System.out.println(bird1.getCanFly());
        bird2.setBeakLength(-1);
        System.out.println(bird2.getBeakLength());

    }
}

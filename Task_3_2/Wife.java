package Task_3_2;


import java.util.Random;


public class Wife extends Person {
    static Random r = new Random();

    public Wife(String name) {
        super();
        this.name = name;

    }

    public static boolean getPermission() {
        int p = r.nextInt(2);
        return p == 0;

    }


}

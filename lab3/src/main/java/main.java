/**
 * Created by Sasha on 18.03.2016.
 */
public class main {
    public static void main(String[] args) {
        SimpsonMethod sm = new SimpsonMethod(1,2,0.001);
        System.out.println("-----Simpson-----");
        System.out.println(sm.calculate());
        TrapMethod tm = new TrapMethod(1,2,0.001);
        System.out.println("-----Trap-----");
        System.out.println(tm.calculate());

    }
}

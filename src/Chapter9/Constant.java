package Chapter9;

public class Constant {
    public int num =10;
    public final int NUM=100;

    public static void main(String[] args) {
        Constant cons = new Constant();
        cons.num=50;
//        cons.NUM=200;

        System.out.println(cons.num);
        System.out.println(cons.NUM);
    }
}

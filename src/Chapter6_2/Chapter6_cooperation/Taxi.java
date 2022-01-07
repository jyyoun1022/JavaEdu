package Chapter6_2.Chapter6_cooperation;

public class Taxi {
    String compnyName;
    int money;
    int pasenger;

    public Taxi(String compnyName){
        this.compnyName=compnyName;
    }

    public void take(int money){
        pasenger++;
        this.money +=money;
    }
    public void showInfo(String compnyName){
        System.out.println();
    }
}

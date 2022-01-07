package Chapter6_2;

public class Taxi {
    String companyName;
    int money;
    int passengerCount;

    public Taxi(String companyName){
        this.companyName = companyName;
    }
    public void take(int money){
        passengerCount++;
        this.money+=money;
    }
    public void showInfo(){
        System.out.println(companyName+"택시 수입은"+money+"입니다.");
    }
}

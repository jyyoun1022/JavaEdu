package Chapter6_2.Chapter6_cooperation;

public class Subway {
    String subwayNumber;
    int money;
    int passengerCount;

    Subway(String subwayNumber){
        this.subwayNumber=subwayNumber;
    }

    public void take(int money){
        this.money+=money;
        passengerCount++;
    }
    public void showInfo(String subwayNumber){
        System.out.println(subwayNumber + "호선의 수입은" + money + "입니다. 또한 승객수는" + passengerCount + "입니다." );
    }
}

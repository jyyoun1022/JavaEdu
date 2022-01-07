package Chapter6_2.Chapter6_cooperation;

public class Bus {
    String busNumber;
    int money;
    int passengerCount;

    public Bus(String busNumber){
        this.busNumber =busNumber;
    }

    public void take(int money){
        passengerCount++;
        this.money+=money;
    }
    public void showInfo(){
        System.out.println("버스번호" + busNumber +"의 수입은" + money + "이고 버스 승객수는" + passengerCount+ "입니다.");
    }
}

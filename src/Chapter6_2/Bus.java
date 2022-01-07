package Chapter6_2;

public class Bus {
    int busNumber;
    int passengerCount;
    int money;


    public Bus(int busNumber){      //버스번호
        this.busNumber=busNumber;
    }
    public void take(int money){   //승객한명이 타면 돈이 들어올건데 그럼 돈은 증가는 하고,승객도 증가한다.
        passengerCount++;
        this.money += money;
    }
    public void showInfo(){
        System.out.println("버스"+busNumber+"번의 승객은"+passengerCount+"명이고"+"수입은"+money +"입니다.");
    }
}








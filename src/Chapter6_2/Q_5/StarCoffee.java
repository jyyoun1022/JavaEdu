package Chapter6_2.Q_5;

public class StarCoffee {
    private int money;

    public StarCoffee(){}

    public String sellSCoffee(int money){
        this.money+=money;
        if(money==Menu.getStarAmericano()){
            return "별다방 아메리카노를 구입했습니다.";
        }
        else if(money == Menu.getStarLatte()){
            return "별다방 라뗴를 구입했습니다.";
        }
        else{
            return null;
        }
    }
}

package Chapter6_2.Q_5;

public class BeanCoffee {
    private int money;

    public int getMoney() {
        return money;
    }

    //팔면 돈이 올라가는 메소드생성 및 생성자생성
    public BeanCoffee(){}

    public String sellBCoffee(int money){
        this.money+=money;
        if(Menu.getBeanAmericano()==money){
            return "콩다방 아메리카노를 구입했습니다.";
        }
        else if(money ==Menu.getBeanLatte()){
            return "콩다방 라떼를 구입했습니다.";
        }
        else{
            return null;
        }

    }
}

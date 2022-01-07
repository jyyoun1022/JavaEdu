package Chapter6_2.Q_5;

public class CoffeeTest {
    public static void main(String[] args) {
        Person kim = new Person("Kim", 10000);
        StarCoffee sCoffee = new StarCoffee();
        BeanCoffee bCoffee = new BeanCoffee();

        kim.buySCoffee(sCoffee, 4000);
        kim.buyBCoffee(bCoffee, 4500);
    }
}

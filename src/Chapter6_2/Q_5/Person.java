package Chapter6_2.Q_5;

public class Person {

        private String name;
        private int money;

        public String getName () {
            return name;
        }
        public int getMoney () {
            return money;
        }
    public Person(String name, int money){
            this.name = name;
            this.money = money;
        }
        public void buySCoffee (StarCoffee sCoffee,int money){
            String message = sCoffee.sellSCoffee(4000);
            if (message != null) {
                this.money -= money;
                System.out.println(name + "님이" + money + "으로" + message);
            }

        }
        public void buyBCoffee (BeanCoffee bCoffee,int money){
            String message = bCoffee.sellBCoffee(4500);
            if (message != null) {
                this.money -= money;
                System.out.println(name + "님이" + money + "으로" + message);

            }
        }

}


package 추상클래스.template;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("=====자율주행하는차=====");
        Car myCar = new AICar();
        myCar.run();


        System.out.println("=====사람이 운전하는차=====");
        Car mycar2 = new ManualCar();
        mycar2.run();

    }
}

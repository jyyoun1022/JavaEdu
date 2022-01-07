package Chapter9.Q5;

public class Genesis extends Car{

    @Override
    public void start() {
        System.out.println("제네시스 시동을 켭니다");
    }

    @Override
    public void drive() {
        System.out.println("제네시스 달립니다.");

    }

    @Override
    public void stop() {
        System.out.println("제네시스 멈춥니다.");

    }

    @Override
    public void turnOff() {
        System.out.println("제네시스 시동을 끕니다.");

    }
}

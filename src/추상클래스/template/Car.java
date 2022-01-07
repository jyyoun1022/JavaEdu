package 추상클래스.template;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void starCar(){
        System.out.println("시동을 켭니다.");
    }

    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }

    final public void run(){
        starCar();
        drive();
        wiper();
        stop();
        turnOff();              //템플릿 메서드


    }
}

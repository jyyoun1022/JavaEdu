package 추상클래스;

public abstract class Car {
    public abstract void run();
    public abstract void refuel();
    public void stop(){
        System.out.println("차가 멈춥니다.");
    }

}

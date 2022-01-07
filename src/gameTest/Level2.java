package gameTest;

public class Level2 extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("조금 빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("조금 높이 점프");
    }

    @Override
    public void turn() {
        System.out.println("턴못함");

    }

    @Override
    public void showPlayerLevel() {
        System.out.println("레벨2입니다.");

    }
}

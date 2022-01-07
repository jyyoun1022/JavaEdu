package gameTest;

public class Level1 extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("달린다.");
    }

    @Override
    public void jump() {
        System.out.println("점프못함");

    }

    @Override
    public void turn() {
        System.out.println("턴 못함");

    }

    @Override
    public void showPlayerLevel() {
        System.out.println("레벨1따리입니다.");

    }
}

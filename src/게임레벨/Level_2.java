package 게임레벨;

public class Level_2 extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("빠르게 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("점프를합니다.");

    }

    @Override
    public void turn() {
        System.out.println("턴할줄 몰라..");

    }

    @Override
    public void showLevelMessage() {
        System.out.println("레벨2입니다.=================");

    }
}

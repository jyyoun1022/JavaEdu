package 게임레벨;

public class Level_3 extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("엄청 빠르게 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("점프합니다.");

    }

    @Override
    public void turn() {
        System.out.println("턴합니다.");

    }

    @Override
    public void showLevelMessage() {
        System.out.println("레벨3입니다.===================");

    }
}

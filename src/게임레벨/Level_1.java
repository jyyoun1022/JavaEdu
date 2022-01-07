package 게임레벨;

public class Level_1 extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("점프못함");

    }

    @Override
    public void turn() {
        System.out.println("턴못함");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("레벨1입니다.==============");

    }
}

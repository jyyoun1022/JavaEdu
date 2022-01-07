package gameTest;

public class Level3 extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("ㅈㄴ 빨리달린다");
    }

    @Override
    public void jump() {
        System.out.println("2단점프쌉가능");

    }

    @Override
    public void turn() {
        System.out.println("백텀블링 쌉가능");

    }

    @Override
    public void showPlayerLevel() {
        System.out.println("레벨3따리입니다.");

    }
}

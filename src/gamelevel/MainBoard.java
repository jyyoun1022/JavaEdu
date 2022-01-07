package gamelevel;

public class MainBoard {
    public static void main(String[] args) {
        Player player = new Player();

        BeginnerLevel bLevel =new BeginnerLevel();
        player.upgradeLevel(bLevel);

        player.play(1); //처음 생성하면 BeginnerLevel

        AdvancedLevel aLevel = new AdvancedLevel();
        player.upgradeLevel(aLevel);
        player.play(2);

        SuperLevel sLevel = new SuperLevel();
        player.upgradeLevel(sLevel);
        player.play(3);
    }
}

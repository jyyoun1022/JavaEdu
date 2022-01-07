package gameTest;

import gamelevel.AdvancedLevel;
import gamelevel.SuperLevel;

public class MainBoard {
    public static void main(String[] args) {
        Player player= new Player();
        player.play(1);

        Level2  lv2 =new Level2();
        player.LevelUp(lv2);
        player.play(2);

        Level3 lv3 = new Level3();
        player.LevelUp(lv3);
        player.play(3);
    }
}


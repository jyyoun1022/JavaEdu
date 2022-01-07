package 게임레벨;

import gameTest.Level2;

public class MainBoard {
    public static void main(String[] args) {
       Player player = new Player();

       Level_1 lv1 = new Level_1();
       player.upgradeLevel(lv1);
       player.hunting(1);

        Level_2 lv2 = new Level_2();
        player.upgradeLevel(lv2);
        player.hunting(2);

        Level_3 lv3 = new Level_3();
        player.upgradeLevel(lv3);
        player.hunting(3);
        player.getPlayerName();







    }
}

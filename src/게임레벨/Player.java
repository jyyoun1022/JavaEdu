package 게임레벨;

public class Player {
    private PlayerLevel level;
    private String playerName;

    public String getPlayerName() {
        return playerName;
    }

    public Player(){

        }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level){
        this.level=level;
        level.showLevelMessage();
    }
    public void hunting(int count){
        level.go(count);
    }
}


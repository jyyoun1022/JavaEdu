package gameTest;

public class Player {
    private PlayerLevel level;

    public Player(){
         level = new Level1();
        level.showPlayerLevel();
    }

    public PlayerLevel getLevel() {
        return level;
    }
    public void LevelUp(PlayerLevel level){
        this.level=level;
        level.showPlayerLevel();
    }
    public void play(int count){
        level.go(count);
    }
}



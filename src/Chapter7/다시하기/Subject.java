package Chapter7.다시하기;

public class Subject {
    private  String name;
    private int scorePoint;

    public Subject(){}

    public Subject(String name,int scorePoint){
        this.name=name;
        this.scorePoint=scorePoint;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScorePoint() {
        return scorePoint;
    }

    public void setScorePoint(int scorePoint) {
        this.scorePoint = scorePoint;
    }

}

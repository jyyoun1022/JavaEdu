package Chapter6_2;

public class Student {
    public String stduentName;
    public int grade;
    public int money;

    private Student(){}

    public Student(String studentName, int money){
        this.stduentName=studentName;
        this.money =money;
    }

    public void takebus(Bus bus){
        bus.take(1000);
                this.money-=1000;
    }
    public void takeSubway(Subway subway){
        subway.take(1500);
        this.money -=1500;
    }
    public void takeTaxi(Taxi taxi){
        taxi.take(10000);
        this.money =money;
    }
    public void showInfo(){
        System.out.println(stduentName+"님의 남은 돈은"+money + "입니다.");
    }
}

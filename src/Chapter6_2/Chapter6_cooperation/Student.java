package Chapter6_2.Chapter6_cooperation;

public class Student {
    String studentName;
    int money;
    int grede;

    public Student(String studentName,int money){
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus2){
        bus2.take(1000);
        this.money -=1000;
    }

    public void takeSubway(Subway subway){
        subway.take(2000);
        this.money -= 2000;
    }
   public  void showInfo(String studentName){
        System.out.println(studentName + "의 남은돈은 " + money + "입니다.");
    }
}

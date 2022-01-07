package Chapter7.다시하기;
import java.util.ArrayList;

public class Student_ {
    private int studentID;
    private String studentName;
    ArrayList<Subject> subjectList =new ArrayList<Subject>();

    public Student_(int studentID,String studentName){
        this.studentID=studentID;
        this.studentName=studentName;
    }

    public void addSubject(String name, int score){
       //밑에꺼 3줄은 같다16-18 Subject subject = new Subject(name,score);
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);
        subjectList.add(subject);
    }

    public void showStudentInfo(){
        int total=0;
        for(Subject s :subjectList){
            total+= s.getScorePoint();
            System.out.println("학생" + studentName+ "의" + s.getName()+"과목성적은 " + s.getScorePoint()+"입니다.");
        }
        System.out.println("학생" + studentName +"의 총점은" + total + "입니다.");
    }
}

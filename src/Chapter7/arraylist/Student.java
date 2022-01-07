package Chapter7.arraylist;

import java.util.ArrayList;

public class Student {
    private int studentID;
    private String studentName;
    ArrayList<Subject> subjectList;   //ArrayList 선언하기

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ArrayList<Chapter7.arraylist.Subject> getSubjectLIst() {
        return subjectList;
    }

    public void setSubjectLIst(ArrayList<Chapter7.arraylist.Subject> subjectLIst) {
        this.subjectList = subjectLIst;
    }

    public Student(int studentID, String studentName){
        this.studentID=studentID;
        this.studentName=studentName;
        ArrayList<Subject> subjectList= new ArrayList<Chapter7.arraylist.Subject>();//ArraryList 생성하기
    }

    public void addSubject(String name,int score){
        Chapter7.arraylist.Subject subject = new Chapter7.arraylist.Subject();
        subject.setName(name);
        subject.setScorePoint(score);
        subjectList.add(subject);

    }

    public void showStudentInfo(){
        int total =0;
        for(Subject s : subjectList){
            total +=s.getScorePoint();
            System.out.println("학생" + studentName + "의" + s.getName() + "과복성적은" + s.getScorePoint() + "입니다.");
        }
        System.out.println("학생" + studentName + "의 총점은" + total + "입니다.");
    }


}

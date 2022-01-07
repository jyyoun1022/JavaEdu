package Chapter7;

import Chapter5.Subject;

public class Student {
    private int studentID;
    private String name;

    public Student(){}

    public Student(int studentID,String name){
        this.studentID=studentID;
        this.name=name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showStudentInfo(){
        System.out.println(getName()+"학생은" + "이며 학번은" +getStudentID()+ "입니다.");
    }

}

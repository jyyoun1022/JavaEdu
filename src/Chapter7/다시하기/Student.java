package Chapter7.다시하기;

public class Student {
    private int studentID;
    private  String name;

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

    public Student(){}

    public void showStudentInfo(){
        System.out.println(getStudentID()+","+getName());
    }

    public Student(int studentID,String name){
        this.studentID=studentID;
        this.name =name;
    }
}

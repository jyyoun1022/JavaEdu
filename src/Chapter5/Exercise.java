package Chapter5;

public class Exercise {
    public static int studentID=12345;
    private String studentName;
    int grade;
    String address;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName,int grade) {
        this.studentName = studentName;
        this.grade =grade;
    }


}

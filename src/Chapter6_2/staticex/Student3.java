package Chapter6_2.staticex;

public class Student3 {
    private static int serialNum;
    int studentID; //학번
    String studentName;
    int grade;
    String address;
    int cardNumber; //학생카드번호

    public Student3() {
        serialNum++;
        studentID = serialNum;
        cardNumber = studentID + 100;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }

    public static int getSerialNum() {
        int i = 10;
        //studentName = "aaa";   //오류 남
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student3.serialNum = serialNum;
    }
}



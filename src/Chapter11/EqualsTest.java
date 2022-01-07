package Chapter11;

class Student{
    public int studentID;
    public String studentName;

    public Student(int studentID,String studenName){
        this.studentID=studentID;
        this.studentName=studenName;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student std = (Student) obj;
            if (this.studentID == std.studentID)
                return true;
            else return false;
        }
        return false;
        }

    @Override
    public int hashCode() {
        return studentID;
    }

    @Override
    public String toString() {
        return studentID +"," + studentName;
    }
}
public class EqualsTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100,"이상원");
        Student studentLee2 = studentLee;   //주소복사
        Student studentSang = new Student(100,"이상원");

        System.out.println("================================");

        if(studentLee == studentLee2)
            System.out.println("studentLee와 studentLee2의 주소는 같습ㄴ디ㅏ.");
        else
            System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
        if(studentLee.equals(studentLee2))
            System.out.println("studentLee와 studentLee2는 동일합니다.");
        else
            System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");

        if(studentLee == studentSang)
            System.out.println("studentLee와 studentSang의 주소는 같습니다.");
        else
            System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
        if(studentLee.equals(studentSang))
            System.out.println("studentLee와 studentSang는 동일합니다.");
        else
            System.out.println("studentLee와 studentSang은 동일 하지 않습니다.");

        System.out.println("studentLee의 hashCode :" +studentLee.hashCode());
        System.out.println("studentSang의 hashCode :" +studentSang.hashCode());

        System.out.println("studentLee의 실제 주소값 :" + System.identityHashCode(studentLee));

        System.out.println("studentSang의 실제 주소값 :" + System.identityHashCode(studentSang));


        System.out.println("====================");




    }
}

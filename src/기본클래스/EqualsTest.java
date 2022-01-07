package 기본클래스;


//Object의 equlas()메서드의 원래 기능은 두 인스턴스의 주소를 비교하는것.따라서 같은 주소인 경우만 equals()메서드의 결과가 true가 된다.
//만약 대한민국 사람의 주민 번호가 같다면 주소가 달라도 같은 한 사람인것과 같다.
//따라서 인스턴스의 주소가 달라도 동일한 객체인 것을 확인 할 수 있어야 한다.
//즉, 두인스턴스가 있을 때 ==는 단순히 물리적으로 같은 메모리 주소인지 여부를 확인할 수있고,
//Object의 equals()메서드는 재정의를 하여 논리적으로 같은 인스턴스인지 확인할수 있도록 구현할 수 있다.
//
class Student{
    public int studentID;
    public String studentName;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return studentID + "," + studentName;
    }

    @Override
    public boolean equals(Object obj) {                 //equals()메서드의 매개변수는 Object형입니다. 비교될 객체가 Object형 매개변수로 전달되면 instanceof를 사용하여 매개변수형의 원래 자료형이 Student인지 확인.
        if(obj instanceof Student){                     //
            Student std =(Student)obj;
            if(this.studentID == std.studentID)
            return true;
        else
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentID;
    }
}
public class EqualsTest {
    public static void main(String[] args) {
        Student studentYoun = new Student(180,"윤재열");
        Student studentYoun2 = studentYoun;   //주소복사(studentYoun)
        Student studentYoon = new Student(180,"윤재열");

        if(studentYoun == studentYoun2)
            System.out.println("같음");
        else
            System.out.println("다름");
        if(studentYoun.equals(studentYoun2))
            System.out.println("동일");
        else
            System.out.println("다름");
        if(studentYoun == studentYoon)
            System.out.println("같음");
        else
            System.out.println("다름");
        if(studentYoun.equals(studentYoon))
            System.out.println("같음");
        else
            System.out.println("다름");

        System.out.println("========hashCode=========");
        System.out.println("youn :" +studentYoun.hashCode());
        System.out.println("yoon :" +studentYoon.hashCode());

        System.out.println("=========실제주소값===========");

        System.out.println("youn :" + System.identityHashCode(studentYoun));
        System.out.println("yoon :" + System.identityHashCode(studentYoon));
    }


}

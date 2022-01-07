package 기본클래스;

//person클래스는 생성자가 3개이고, 각 멤버변수에 get,set()메서드를 제공한다.이를 컴파일 하여 Person.class파일을 생성.

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException{
        Person person = new Person();           //getClass()메서드를 사용하려면 이미 생성된 인스턴스가 있어야한다.
        Class pClass1 = person.getClass();  //Object의 getClass()메서드 사용하기

        System.out.println(pClass1.getName());

        Class pClass2 = Person.class;   //직접 class파일 대입하기

        System.out.println(pClass2.getName());

        Class pClass3 = Class.forName("기본클래스.Person");  //()안에 클래스 이름으로 가져오기

        System.out.println(pClass3.getName());
    }
}

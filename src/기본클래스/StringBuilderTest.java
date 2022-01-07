package 기본클래스;

//문자열에 여러 문자열을 추가 해야하는 경우 일단 StringBuilder 클래스를 생성하고 여기에 문자열을 추가(append)한다.
//그렇게 되면 append()메서드가 실행될 때마다 메모리가 새로 생성되는 것이 아니라,하나의 메모리에 계속 연결된다(해시코드값을 통해 알수 있다.)

public class StringBuilderTest {
    public static void main(String[] args) {
        String javaStr = new String("java");
        System.out.println("javaStr 문자열 주소 :" +System.identityHashCode(javaStr)); //인스턴스가 처음 생성됐을 때 메모리주

        StringBuilder buffer = new StringBuilder(javaStr); //String으로부터 StringBuilder생성
        System.out.println(" 연산전 buffer 메모리 주소" + System.identityHashCode(buffer));

        buffer.append(" and");
        buffer.append(" android");                      //문자열 추가
        buffer.append(" programming is fun!!");
        System.out.println("연산 후 buffer 메모리 주소" +System.identityHashCode(buffer));

        javaStr = buffer.toString();   //String 클래스로 반환
        System.out.println(javaStr);
        System.out.println("새로 만들어진 javaStr 문자열 주소" + System.identityHashCode(javaStr));
    }
}

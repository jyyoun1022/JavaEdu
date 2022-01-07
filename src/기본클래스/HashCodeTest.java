package 기본클래스;

// 참조 변수를 출력할 때 본 16진수 숫자값이 '해시 코드 값'이고, 이값은 자바 가상 머신이 힙메모리에 저장한 '인스턴스의 주소 값'입니다.
//즉 자바에서는 두 인스턴스가 같다면 hashCode()메서드에서 반환하는 해시 코드 값이 같아야 한다.
//따라서 논리적으로 같은 두 객체도 같은 해시 코드 값을 반환하도록 hashCode()메서드를 재정의해야한다.
//즉, equals()메서드를 재정의 했다면, hashCode()메서드도 재정의 해야한다.
//일반적으로 hashCode()메서드를 재정의 할때는 equals()메서드에서 논리적으로 같다는 것을 구현할 때 사용한 멤버 변수를 활용하는 것이 좋다.
//실제 인스턴스값의 주소를 알 고싶다면 System.indentityHashCode()메서드를 사용하면 된다.


public class HashCodeTest {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        IntegerTest i1 = new IntegerTest();
        IntegerTest i2 = new IntegerTest();

        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());
    }
}

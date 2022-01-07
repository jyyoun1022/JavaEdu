package 기본클래스;

public class StringEquals {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String ("abc");

        System.out.println(str1 == str2);            //두 인스턴스 주소 값이 같은지 비교하여 출력
        System.out.println(str1.equals(str2));      //String 클래스의 equals()메서드 사용. 두 인스턴스의 문자열 값이 같은지 비교하여 출력

        IntegerTest i1 = new IntegerTest();
        IntegerTest i2 = new IntegerTest();

        System.out.println(i1 == i2);           //두 인스턴스 주소 값이 같은지 비교하여 출력
        System.out.println(i1.equals(i2));      //integer클래스의 equals()메서드 사용.두 인스턴스의 정수 값이 같은지 비교하여 출력
    }
}

package 기본클래스;

public class StringTest2 {
    public static void main(String[] args) {
        String javaStr = new String("java");
        String androidStr = new String("android");
        System.out.println(javaStr);
        System.out.println("처음 문자열 주소 값" + System.identityHashCode(javaStr));


        javaStr = javaStr.concat(androidStr);  //문자열 javaStr와 문자열 androidStr를 연결하여 javaStr에 대입.

        System.out.println(javaStr);
        System.out.println("연결된 문자열 주소 값" + System.identityHashCode(javaStr));
    }
}

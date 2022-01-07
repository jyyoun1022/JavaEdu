package 기본클래스;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {
    public static void main(String[] args) throws ClassNotFoundException{
        Class strClass = Class.forName("java.lang.String");   //클래스 이름으로 가져오기

        Constructor[] cons = strClass.getConstructors();       //모든 생성자 가져오기
        for(Constructor c : cons){
            System.out.println(c);
        }

        System.out.println("===================");

        Field[] fields =strClass.getFields();               //모든 멤버변수(필드)가져오기
        for(Field f : fields){
            System.out.println(f);
        }
        System.out.println("=====================");
        Method[] methods = strClass.getMethods();           //모든 메서드 가져오기
        for(Method m : methods){
            System.out.println(m);
        }

        //Class클래스를 가져오기 위해 forName()메서드를 사용한다.이메서드는 정적메서드이므로 클래스를 생성하지 않아도 사용할 수 있다.


    }
}

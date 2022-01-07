package 기본클래스;

public class IntegerTest {
    //public void setValue(Integer i){~~} 객체를 매개변수로 받는 경우
    //public Integer returnValue(){~~~}  반환 값이 객체형인 경우
    //Integer클래스는 int자료형을 감싼 클래스이다.
    //Integer클래스의 생성자는 이와 같이 2가지가 있다.
    //Integer(int value){} <<특정 정수를 매개변수로 받는 경우,       Integer(String s){}<<특정 문자열을 매개변수로 받는경우 2가지가 있다.
    //int value는 final변수이며 한번 생성 되면 변경할수가 없다.


    //IntegerTest iValue = new IntegerTest(100);
    //int myValue = iValue.intValue;            << Integer클래스 내부의 int자료형 값을 가져오기 위해서는 intValue()메서드를 사용한다.(myValue를 출력하면 100이 출력된다.)

    //Integer number1 = Integer.valueOf("100");
    //Integer number2 = Integer.valueOf(100);      << valueOf() 정적 메서드를 사용하면 생성자를 사용하지 않고 정수나 문자열을 바로 Integer클래스로 반환받을 수 있다.


    //int num = Integer.parseInt("100");  << parseInt()메서드를 활용하면 문자열이 어떤 숫자를 나타낼 떄, 학번이나 개수등이 문자열로 전잘된 경우에 문자열에서 int값을 바로 가져와서 반환할 수도 있다.


    //기본형 값을 Wrapper 클래스의 객체로 자동으로 변환시켜 주는 것을 Autoboxing이라고 한다.
    //반대로 Wrapper클래스의 객체를 자동으로 기본형 값으로 변환 시켜 주는 것을 Unboxing이라고 한다.

//        public static Integer add(Integer x, Integer y){                  // Autoboxing
//            return x+y;                                                  // Unboxing => 객체끼리 덧셈이 안되는데 자동으로 기본자료형으로 변형되서 계산
//                                                                        // return될때는 다시 출력형인 Integer로 Autoboxing이 이루어짐
//        }
//        public static void main(String[] args) {
//            System.out.println(add(4,2))                           // 6
//        }
//    }
    }


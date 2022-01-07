package 기본클래스;

//어떤 경우에는 여러 클래스 중에 상황에 따라 다른 클래스를 사용해야할 때가 있고, 반환받는 클래스가 정확히 어떤 자료형인지 모를 때도 있다.
//이렇게 모르는 클래스의 정보를 사용할 경우에 우리가 클래스 정보를 직접 찾아야하는데 class클래스를 활용한다.
//Object클래스의 getClass()메서드 사용하기,    클래스파일 이름을 Class변수에 직접 대입하기,     Class.forName("클래스이름")메서드 사용하기

public class Person {
    private String name;
    private int age;

    public Person() {}    //디폴트 생성자

    public Person(String name) {        //이름만 입력받는 생성자
        this.name = name;
    }

    public Person(String name, int age) {       //이름,나이를 입력받는 생성자
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

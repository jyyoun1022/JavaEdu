package Chapter10;

public class MyClassTest {
    public static void main(String[] args) {
        MyClass mClass = new MyClass();

        X xClass = new MyClass();
        xClass.x();

        Y yClass = new MyClass();
        yClass.y();

        MyInterface iClass = new MyClass();
        iClass.myMethod();
        iClass.x();
        iClass.y();
    }
}

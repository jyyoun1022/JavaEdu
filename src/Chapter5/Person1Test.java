package Chapter5;

public class Person1Test {
    public static void main(String[] args) {
        Person1 personKim = new Person1();
        personKim.name = "김유신";
        personKim.weight = 85.5F;
        personKim.height = 180.0F;

        Person1 personLee = new Person1("이순신",179,89); //person1() <<생성자호출

    }
}

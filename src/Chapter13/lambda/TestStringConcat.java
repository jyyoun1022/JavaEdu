package Chapter13.lambda;

public class TestStringConcat {
    public static void main(String[] args) {
        String s1 ="Hello";
        String s2 ="World";
        StringconCatImpl str = new StringconCatImpl();
        str.makeString(s1,s2);

        StringConcat concat = (s,v) -> System.out.println(s+ "," + v);
        concat.makeString(s1,s2);

    }
}

package Chapter5;

public class FunctionTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int result;

        result= add(num1,num2);
        System.out.println(result);

        result = sub(num1,num2);
        System.out.println(result);

        result = times(num1,num2);
        System.out.println(result);

        double result1 = divide(num1,num2);
        System.out.println(result1);


    }


    public static int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }
    public static int sub(int n1,int n2){
        int result = n1 - n2;
        return result;
    }
    public static int times(int n1, int n2){
        int result = n1 * n2;
        return result;
    }
    public static double divide(double n1,double n2){
        double result1 = n1 / n2;
        return result1;
    }
}
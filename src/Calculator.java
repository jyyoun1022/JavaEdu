import java.util.Scanner;
class Operation{
    int num1;
    int num2;
    char oper;
public Operation(){}

    public static int add (int num1,int num2){
    int result =num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + result + "입니다." );
        return result;
    }
    public static int substract(int num1,int num2){
    int result = num1 - num2;
        System.out.println(num1 + "-" + num2 + "=" + result + "입니다." );
        return result;
    }
    public static int times(int num1,int num2){
    int result = num1 * num2;
        System.out.println(num1 + "*" + num2 + "=" + result + "입니다." );
        return result;
    }
    public static double divide(int num1,int num2){
    double result = num1 / num2;
        System.out.println(num1 + "/" + num2 + "=" + result + "입니다." );
    return result;
    }


}
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("계산할 num1값을 입력해주세요.");
        int num1 =sc.nextInt();
        System.out.println("계산할 부호를 선택해서 입력해주세요.(+,-,*,/");
        char op =sc.next().charAt(0);
        System.out.println("게산할 num2값을 입력해주세요.");
        int num2 = sc.nextInt();



        switch(op){
            case '+' :
                Operation.add(num1,num2);
                break;
            case '-' :
                Operation.substract(num1,num2);
                break;
            case '*' :
                Operation.times(num1,num2);
                break;
            case '/' :
                Operation.divide(num1,num2);
                break;
            default :
                System.out.println("사칙연산에 부적합한 문자입니다.");
        }
    }
}

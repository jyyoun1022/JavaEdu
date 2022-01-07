package ScannerEx;
import java.util.Scanner;

public class ScannerSwitch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("논리연산을 입력하세요");

        boolean a =sc.nextBoolean();
        String b = sc.next();
        boolean c =sc.nextBoolean();

        boolean res =false;         //값을 초기화한다.
        switch(b){
            case "AND":
                res =a && c;
                break;
            case "OR":
                res= a || c;
                break;
            default:
                System.out.println("옳지 않은 논리연산자입니다.");
                break;
        }
        System.out.println(res);
        sc.close();
    }
}

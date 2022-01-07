package ScannerEx;
import java.util.Scanner;

public class IfSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("커피를 주문해주세요>>");
        String a = sc.nextLine();
        int b = sc.nextInt();
        String coffee = a;
        if (coffee.equals("에스프레소")) {
            System.out.println(2000 * b + "원입니다.");
        } else if (coffee.equals("아메리카노")) {
            System.out.println(2500 * b + "원입니다.");
        } else if (coffee.equals("카푸치노")) {
            System.out.println(3000 * b + "원입니다.");
        } else if (coffee.equals("카페라떼")) {
            System.out.println(3500 * b + "원입니다.");
        } else {
            System.out.println("저희 카페에는 없는 종류입니다.");
        }
        sc.close();
    }
}

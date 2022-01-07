package ScannerEx;
import java.util.Scanner;

public class IfSwitch02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("커피를 주문해주세요.");
        String a =sc.nextLine();
        int i =sc.nextInt();

        switch (a){
            case "에스프레소":
                System.out.println(2000*i+"원");
                break;
            case "아메리카노":
                System.out.println(2500*i+"원");
                break;
            case "카푸치노":
                System.out.println(3000*i+"원");
                break;
            case "카페라떼":
                System.out.println(3500*i+"원");
                break;
            default:
                System.out.println("죄송합니다.저의 카페에는 없는 메뉴입니다.");
                break;
        }
        sc.close();
    }
}

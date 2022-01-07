package ScannerEx;
import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("각층이 높이를 나타네느 Scanner입니다.");
        System.out.println("몇층인지 입력하세요>>");

        int a =sc.nextInt();
        int b=5;
        int sum = a*b;
        System.out.println(sum +"m입니다. ");
        sc.close();
    }
}

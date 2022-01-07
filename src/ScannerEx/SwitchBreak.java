package ScannerEx;
import java.util.Scanner;

public class SwitchBreak {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("학점을 입력하세요");
        String a =scanner.next();

        switch (a){
            case "A": case "B":
                System.out.println("Excellent");
                break;
            case "C": case "D":
                System.out.println("Good");
                break;
            case "F":
                System.out.println("Bye");
                break;
            default:
            System.out.println("정해진 등급이 아닙니다.");
        }

    }
}

package 별찍기;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("홀수 정수를 입력하세요.");
        int num = sc.nextInt();

            //상단
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= num - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            //하단
            for (int i = num - 1; i >= 1; i--) {
                for (int j = num - 1; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");

                }
                System.out.println();
            }
        }
    }

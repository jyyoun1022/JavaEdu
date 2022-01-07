package 별찍기;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하시오.");
        int num =sc.nextInt();

        for(int i=0; i<=num; i++){
            for(int j=0; j<=num-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =0; i<=num-1; i++){
            for(int j =0; j<=i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

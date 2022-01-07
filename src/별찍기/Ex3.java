package 별찍기;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int num =sc.nextInt();

        for(int i=0; i<=num; i++){
            for(int j=0; j<num-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
